package com.androd.androidjavascriptinterface

import android.content.Context
import android.util.Log
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface(private val mContext : Context) {
    private val TAG: String? = WebAppInterface::class.simpleName

    @JavascriptInterface
    fun showToast(toast : String){
        Toast.makeText(mContext,toast, Toast.LENGTH_SHORT).show()
    }
}