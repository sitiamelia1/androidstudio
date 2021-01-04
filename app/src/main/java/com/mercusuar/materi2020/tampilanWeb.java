package com.mercusuar.materi2020;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class tampilanWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_web);
        String alamat = "https://www.google.co.id/?h1=id";
        WebView web = (WebView) findViewById(R.id.website);
        web.getSettings(). setJavaScriptEnabled(true);
        web.loadUrl(alamat);
        web.setWebViewClient(new WebViewClient());
    }
}