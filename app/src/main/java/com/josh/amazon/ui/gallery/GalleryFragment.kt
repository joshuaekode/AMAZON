package com.josh.amazon.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.josh.amazon.R
import com.josh.amazon.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview: WebView = view.findViewById(R.id.dealsweb)
        mywebview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.loadUrl("https://www.amazon.com/gp/goldbox?ref_=navm_nav_cs_gb")
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