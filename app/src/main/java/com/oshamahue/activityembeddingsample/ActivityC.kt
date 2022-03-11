package com.oshamahue.activityembeddingsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oshamahue.activityembeddingsample.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {

    private lateinit var binding: ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnF.setOnClickListener {
            startActivity(Intent(this, ActivityCSub::class.java))
        }

    }

}
