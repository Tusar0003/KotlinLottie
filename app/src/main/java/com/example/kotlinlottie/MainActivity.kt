package com.example.kotlinlottie

import android.animation.Animator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottieView = findViewById<LottieAnimationView>(R.id.lottie_volume)
//        val clickView = findViewById<LottieAnimationView>(R.id.lottie_click)

        var progress = 0f
        lottieView.progress = progress

//        val animator = ValueAnimator.ofFloat(0f, 0.5f)
//        animator.addUpdateListener { animation: ValueAnimator ->
//            progress += animation.animatedValue as Float
//            lottieView.progress = progress
//        }
//        animator.start()

//        lottieView.scale = 0.5f
//        lottieView.playAnimation()

        lottieView.setOnClickListener {
            if (progress >= 1f) {
                progress = 0f
                lottieView.progress = progress
            } else {
                progress += 0.1f
                lottieView.progress = progress
            }
        }

//        clickView.setOnClickListener {
//            clickView.playAnimation()
//        }

        lottieView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationStart(animation: Animator?) {

            }
        })
    }
}
