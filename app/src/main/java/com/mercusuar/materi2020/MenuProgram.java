package com.mercusuar.materi2020;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_program);
        Button btnProg1 = (Button)findViewById(R.id.btnProg1);
        btnProg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ScrollingActivity.class);
                startActivity(i);
            }
        });
        Button btnProg2 = (Button)findViewById(R.id.btnProg2);
        btnProg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),tampilanWeb.class);
                startActivity(i);
            }
        });
        Button btnProg3 = (Button)findViewById(R.id.btnProg3);
        btnProg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CalculatorAngka.class);
                startActivity(i);
            }
        });
        Button btnProg4 = (Button)findViewById(R.id.btnProg4);
        btnProg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),follower.class);
                startActivity(i);
            }
        });
        Button btnProg5 = (Button)findViewById(R.id.btnProg5);
        btnProg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CurriculumVitae.class);
                startActivity(i);
            }
        });
        Button btnProg6 = (Button)findViewById(R.id.btnProg6);
        btnProg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PersegiPanjang.class);
                startActivity(i);
            }
        });
    }
}