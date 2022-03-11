package com.oshamahue.othermodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityBMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_main)
        if (intent.getBooleanExtra("split", false)) {
            openDActivity()
            intent.putExtra("split", false)
        }
        val button: Button = findViewById(R.id.openBSub)
        button.setOnClickListener {
            openDActivity()
        }

    }

    private fun openDActivity() {
        startActivity(Intent(this, ActivityBSub::class.java))
    }
}
