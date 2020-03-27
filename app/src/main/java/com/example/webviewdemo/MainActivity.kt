package com.example.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val url = "https://www.google.com/";
        loadWebView(url)
    }

    private fun loadWebView(url:String) {

        if (NetworkUtil.isOnline(this)){
            val webView = findViewById<WebView>(R.id.webview)
            webView.loadUrl(url)

        }

        else {
            Snackbar.make(webview.rootView,getString(R.string.internet_not_available),Snackbar.LENGTH_LONG).show()
        }

    }
}
