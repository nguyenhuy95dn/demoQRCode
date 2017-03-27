package com.example.age.demoqrcode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by Age on 3/27/2017.
 */
public class DetailQRActivity extends AppCompatActivity {
    private static final String URL = "url";
    private WebView mWebView;
    private String mUrl;

    public static Intent detailIntent(Context context, String url) {
        Intent intent = new Intent(context, DetailQRActivity.class);
        intent.putExtra(URL, url);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_qr_code);
        mUrl = getIntent().getStringExtra(URL);
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.loadUrl(mUrl);
    }
}
