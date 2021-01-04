package com.mercusuar.materi2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class CurriculumVitae extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum_vitae);

        frameLayout = findViewById(R.id.simpleFrameLayout);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Biodata"));
        tabLayout.addTab(tabLayout.newTab().setText("Pendidikan"));
        tabLayout.addTab(tabLayout.newTab().setText("Kemampuan"));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment= null;
                switch (tab.getPosition()){
                    case 0:
                        fragment =new Biodata();
                        break;
                    case 1:
                        fragment =new Pendidikan();
                        break;
                    case 2:
                        fragment =new Kemampuan();
                        break;
                }

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.simpleFrameLayout,fragment);
                fragmentTransaction.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}