package com.minenick.minenickext

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog

fun Activity.hideKeyboard() {
    // Check if no view has focus:
    val view: View = this.currentFocus ?: return
    val inputManager: InputMethodManager =
        getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
}

fun Fragment.hideKeyboard() {
    // Check if no view has focus:
    val view: View = requireActivity().currentFocus ?: return
    val inputManager: InputMethodManager =
        requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
}

fun Fragment.openKeyboard(editText: EditText) {
    // Check if no view has focus:
    val inputMethodManager =
        requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    editText.requestFocus()
    inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
}

fun Activity.openKeyboard(editText: EditText) {
    // Check if no view has focus:
    val inputMethodManager =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    editText.requestFocus()
    inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
}

fun Activity.showDialogMessage(
    message: String,
    event: (() -> Unit) = { },
    cancelable: Boolean = false,
    theme:Int? = null
) {
    MaterialDialog(this).show {
        message(text = message)
        cancelable(false)
        positiveButton(text = "Aceptar") {
            event.invoke()
        }

        theme?.let {
            setTheme(it)
        }

        if (cancelable) {
            negativeButton(text = "Cancelar")
        }
    }
}

fun Fragment.showDialogMessage(
    message: String,
    event: (() -> Unit) = { },
    cancelable: Boolean = false,
    theme: Int? = null
) {
    MaterialDialog(requireContext()).show {
        message(text = message)
        cancelable(false)
        positiveButton(text = "Aceptar") {
            event.invoke()
        }
        theme?.let {
            activity?.setTheme(it)
        }

        if (cancelable) {
            negativeButton(text = "Cancelar")
        }
    }
}
