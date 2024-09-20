package com.jamesmc.webapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    companion object {
        const val WEB_URL =
            "file:///android_asset/index.html"  // Use 10.0.2.2 for localhost from the emulator
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()

        loadUrl(WEB_URL)
    }

    private fun loadUrl(webUrl: String) {
        webView.loadUrl(webUrl)

    }
}





