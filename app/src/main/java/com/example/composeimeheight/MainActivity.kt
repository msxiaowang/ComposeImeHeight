package com.example.composeimeheight

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.compose.material3.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Button(onClick = {
                val dialog = MyDialogFragment()
                dialog.show(supportFragmentManager, "MyDialogFragment")
            }) {
                Text(text = "Show Dialog")
            }
        }
    }
}
