package com.oshamahue.activityembeddingsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oshamahue.activityembeddingsample.databinding.ActivityCSubBinding

class ActivityCSub : AppCompatActivity() {

    private lateinit var binding: ActivityCSubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCSubBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}
