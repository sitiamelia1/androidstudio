package com.mercusuar.materi2020;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class follower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follower);
        Button btnFB = (Button)findViewById(R.id.btnfb);
        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://web.facebook.com/sitiamelia/");
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        Button btnIG = (Button)findViewById(R.id.btnig);
        btnIG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/yyameliiya/");
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        Button btnTwit = (Button)findViewById(R.id.btntwitter);
        btnTwit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/yyameliiya");
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),login.class);
                startActivity(i);
            }
        });
    }
}