package com.tuk.tukar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_insta_club.*


class insta_club : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insta_club)
        webView_club.apply{
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }
        webView_club.loadUrl("https://instagram.com/tuk_film_19?igshid=YmMyMTA2M2Y=")
    }
    override fun onBackPressed() {
        if (webView_club.canGoBack())
        {
            webView_club.goBack()
        }
        else
        {
            finish()
        }
    }
    }
