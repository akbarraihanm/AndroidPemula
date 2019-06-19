package com.example.androidpemula

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detil.*

class DetilActivity : AppCompatActivity() {

    companion object{
        const val info = "info"
        const val lahir = "v"
        const val wafat = "a"
        const val tinggi = "s"
        const val gambar = "as"
    }

    lateinit var presiden : InfoPresiden

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detil)

        var info = intent.getStringExtra(info)
        var lahir = intent.getStringExtra(lahir)
        var wafat = intent.getStringExtra(wafat)
        var tinggi = intent.getStringExtra(tinggi)
        var gambar = intent.getStringExtra(gambar)

        Glide.with(this)
                .load(gambar)
                .apply(RequestOptions().override(350, 550))
                .into(img_item)
        tvinfo.text = info
        tvlahir.text = lahir
        tvwafat.text = wafat
        tvtinggi.text = tinggi
    }
}
