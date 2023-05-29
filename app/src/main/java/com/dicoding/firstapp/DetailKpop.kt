package com.dicoding.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailKpop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kpop)

        val actionBar= supportActionBar
        actionBar!!.title= "Detail Informasi"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val imgKpop= findViewById<ImageView>(R.id.img_item_photo)
        val tvName= findViewById<TextView>(R.id.tv_item_name)
        val tvInformasi= findViewById<TextView>(R.id.tv_item_description)
        val tvHoby= findViewById<TextView>(R.id.tv_item_hoby)
        val tvMakanan= findViewById<TextView>(R.id.tv_item_makanan)

        val inImg= intent.getIntExtra(EXTRA_PHOTO, 0)
        val inName= intent.getStringExtra(EXTRA_NAME)
        val inInformasi= intent.getStringExtra(EXTRA_INFORMASI)
        val inHoby= intent.getStringExtra(EXTRA_HOBY)
        val inMakanan= intent.getStringExtra(EXTRA_MAKANAN)

        imgKpop.setImageResource(inImg)
        tvHoby.text= inHoby
        tvMakanan.text= inMakanan
        tvName.text= inName
        tvInformasi.text= inInformasi
    }

    companion object{
        const val EXTRA_PHOTO="extra_photo"
        const val EXTRA_NAME= "extra_name"
        const val EXTRA_INFORMASI= "extra_informasi"
        const val EXTRA_HOBY= "extra_hoby"
        const val EXTRA_MAKANAN= "extra_makanan"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}