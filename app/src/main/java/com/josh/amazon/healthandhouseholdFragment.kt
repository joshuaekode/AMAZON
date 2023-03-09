package com.josh.amazon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class healthandhouseholdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_healthandhousehold,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview: WebView = view.findViewById(R.id.healthweb)
        mywebview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.loadUrl("https://www.amazon.com/gp/browse.html?node=3760901&ref_=navm_cs_health_household")
        mywebview.settings.javaScriptEnabled
        mywebview.settings.allowContentAccess=true
        mywebview.settings.useWideViewPort=true
        mywebview.settings.domStorageEnabled=true
        mywebview.settings.builtInZoomControls=false
        mywebview.settings.javaScriptCanOpenWindowsAutomatically=true
        mywebview.settings.allowFileAccess=true
        mywebview.settings.useWideViewPort=true

    }
}