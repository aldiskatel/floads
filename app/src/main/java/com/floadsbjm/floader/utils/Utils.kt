package com.floadsbjm.floader.utils

import android.view.View
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