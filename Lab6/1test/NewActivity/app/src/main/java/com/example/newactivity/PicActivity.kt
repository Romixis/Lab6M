package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.graphics.Bitmap
import android.os.Parcelable
import android.view.View
import com.bumptech.glide.Glide
import android.widget.TextView



class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pic_layout)

        title = "Картинка"; // Установка заголовка на Activity

        val link = intent.getStringExtra("picLink")
        val imageView = findViewById<View>(R.id.picView) as ImageView

        Glide
            .with(this)
            .load(link)
            .into(imageView)
    }
}
