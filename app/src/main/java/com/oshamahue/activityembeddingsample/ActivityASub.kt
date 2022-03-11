package com.oshamahue.activityembeddingsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oshamahue.activityembeddingsample.databinding.ActivityASubBinding

class ActivityASub : AppCompatActivity() {

    private lateinit var binding: ActivityASubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityASubBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}
