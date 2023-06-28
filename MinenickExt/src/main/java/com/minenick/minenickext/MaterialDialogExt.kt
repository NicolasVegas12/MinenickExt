package com.minenick.minenickext

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.afollestad.materialdialogs.MaterialDialog
import com.google.android.material.snackbar.Snackbar

@SuppressLint("CheckResult")
fun MaterialDialog.mostrarDialogFecha(title: String, setDate: (() -> Unit)) {
    title(text = title)
    noAutoDismiss()
    positiveButton(text = "OK") {
        setDate.invoke()
        dismiss()
    }
    negativeButton(text = "Cancel") { dismiss() }
}

@SuppressLint("CheckResult")
fun MaterialDialog.mostrarDialogHora(title: String, setHour: (() -> Unit)) {
    title(text = title)
    noAutoDismiss()
    positiveButton(text = "OK") {
        setHour.invoke()
        dismiss()
    }
    negativeButton(text = "Cancel") { dismiss() }
}



fun showSnackBar(root: View, text: String) {
    Snackbar.make(root, text, Snackbar.LENGTH_LONG).show()
}


fun View.dismissKeyboard(completed: () -> Unit = {}) {
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    val wasOpened = inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    if (!wasOpened) completed()
}
