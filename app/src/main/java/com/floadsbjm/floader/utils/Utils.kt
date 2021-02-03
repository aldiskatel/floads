package com.floadsbjm.floader.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar

fun View.snackBar(message: String) {
    Snackbar.make(
        this,
        message,
        Snackbar.LENGTH_LONG
    ).also { snackBar ->
        snackBar.setAction("OK") {
            snackBar.dismiss()
        }
    }.show()
}

fun View.hideKeyboard() {
    val inputMethodManager = context!!.getSystemService(
        Context.INPUT_METHOD_SERVICE
    ) as? InputMethodManager
    inputMethodManager?.hideSoftInputFromWindow(this.windowToken, 0)
}