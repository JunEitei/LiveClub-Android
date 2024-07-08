package com.kitamura.liveclub

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化 WebView
        webView = findViewById(R.id.webView)
        webView.webChromeClient = WebChromeClient() // 支持 ChromeClient
        webView.webViewClient = WebViewClient() // 支持 WebViewClient

        // 全屏显示
        supportActionBar?.hide() // 隐藏 ActionBar
        webView.settings.javaScriptEnabled = true // 启用 JavaScript
        webView.loadUrl("https://live-club.github.io/") // 加载指定网页
    }

}