package com.androd.androidjavascriptinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView : WebView = findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(WebAppInterface(this),"Android")
        webView.loadUrl("https://jaehoon-pg.github.io/demo-web/")

    }
}