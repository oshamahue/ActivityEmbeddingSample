package com.oshamahue.activityembeddingsample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.oshamahue.activityembeddingsample.databinding.ActivityAMainBinding
import com.oshamahue.othermodule.ActivityBMain

class ActivityAMain : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityAMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnB.setOnClickListener { view ->
            startActivity(Intent(this, ActivityASub::class.java))
        }
        binding.btnC.setOnClickListener { view ->
           openC(this)
        }
        binding.btnE.setOnClickListener { view ->
            startActivity(Intent(this, ActivityC::class.java))
        }
    }

    fun openC(context: Context) {
        context.startActivity(Intent(context, ActivityBMain::class.java).apply {
            putExtra(
                "split",
                true
            )
        })
    }

}
