package com.minenick.minenickext

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ProgressBar

@SuppressLint("UseCompatLoadingForDrawables")
fun ProgressBar.setNewProgress(total:Double, part:Double, context:Context){
    var porcentaje = 0
    if (total != 0.0) {
        porcentaje =
            part.getPorcentaje(total)
    }
    val drawable : Drawable?= if (porcentaje <= 50) {
        context.getDrawable(R.drawable.bg_curved_progress_bar_good)

    } else if (porcentaje in 51..79) {
        context.getDrawable(R.drawable.bg_curved_progress_bar_medium)

    } else {
        context.getDrawable(R.drawable.bg_curved_progress_bar_bad)

    }
    this.progress = porcentaje
    this.progressDrawable = drawable
}
