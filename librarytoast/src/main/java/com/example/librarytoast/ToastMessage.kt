package com.example.librarytoast

import android.content.Context
import android.widget.Toast

object ToastMessage {

    fun showMessage(context: Context,message: String) {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}