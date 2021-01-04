package com.mercusuar.materi2020;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import
import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class login extends AppCompatActivity {
    //variable
    Button b1,b2;
    EditText ed1,ed2;
    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button)findViewById(R.id.btnlogin);
        ed1 = (EditText)findViewById(R.id.txtusername);
        ed2 = (EditText)findViewById(R.id.txtpass);

        b2 = (Button)findViewById(R.id.btnsignup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Berhasil...",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(getApplicationContext(), MenuProgram.class);
                    startActivity(i);

                }
                else{
                    Toast.makeText(getApplicationContext(), "Gagal Login",Toast.LENGTH_SHORT).show();
                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0){
                        b1.setEnabled(false);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}