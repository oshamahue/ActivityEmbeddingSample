package com.oshamahue.activityembeddingsample

import android.content.Context
import androidx.startup.Initializer
import androidx.window.embedding.SplitController

class HomeWindowInitializer : Initializer<SplitController> {
    override fun create(context: Context): SplitController {
        SplitController.initialize(context, R.xml.splitconfigmain)
        return SplitController.getInstance()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
