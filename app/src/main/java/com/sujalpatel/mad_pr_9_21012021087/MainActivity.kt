package com.sujalpatel.mad_pr_9_21012021087

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    lateinit  var alarmanimation : AnimationDrawable
    lateinit var heartanimation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        val alarmimage:ImageView = findViewById(R.id.imageView)
        alarmimage.setBackgroundResource(R.drawable.alarm_animation)
        alarmanimation =alarmimage.background as AnimationDrawable

        val heart : ImageView = findViewById(R.id.heart)
        heart.setBackgroundResource(R.drawable.heart_animation)
        heartanimation = heart.background as AnimationDrawable
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {

        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            alarmanimation.start()
            heartanimation.start()
        }
        else{
            alarmanimation.stop()
            heartanimation.stop()
        }
    }
}