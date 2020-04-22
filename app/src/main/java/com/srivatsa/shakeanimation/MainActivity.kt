package com.srivatsa.shakeanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image=findViewById(R.id.iv)
        animRocket()
    }

    private fun animRocket() {
        val rotate= AnimationUtils.loadAnimation(this,R.anim.shake_animation)
        image.animation=rotate
    }
}
