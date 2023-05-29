package com.dicoding.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TentangKu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang_ku)

        supportActionBar?.title= "Profil"
        val actionBar= supportActionBar
        actionBar!!.title= "Tentang Saya"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


//        val photoYoshe= findViewById<ImageView>(R.id.image_yoshe)
//        val tvNama= findViewById<TextView>(R.id.nama_yoshe)
//        val tvEmail= findViewById<TextView>(R.id.email_yoshe)
//        val tvAsal= findViewById<TextView>(R.id.asal_yoshe)
//        val tvKB= findViewById<TextView>(R.id.kb_yoshe)
//
//        val tPhotoYoshe= intent.getStringExtra(DetailKpop.EXTRA_PHOTOYOSHE)
//        val tNama= intent.getStringExtra(DetailKpop.EXTRA_NAMA)
//        val tEmail= intent.getStringExtra(DetailKpop.EXTRA_EMAIL)
//        val tAsal= intent.getStringExtra(DetailKpop.EXTRA_ASAL)
//        val tKB= intent.getStringExtra(DetailKpop.EXTRA_KB)
//
//        tvNama.text= tNama
//        Glide.with(this)
//            .load(tPhotoYoshe)
//            .apply(RequestOptions())
//            .into(photoYoshe)
//        tvEmail.text= tEmail
//        tvAsal.text= tAsal
//        tvKB.text= tKB
//    }
//
//    companion object{
//        const val EXTRA_NAMA= "extra_nama"
//        const val EXTRA_EMAIL= "extra_email"
//        const val EXTRA_ASAL= "extra_asal"
//        const val EXTRA_KB= "extra_kb"
//        const val EXTRA_PHOTOYOSHE= "extra_photo_yoshe"
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return true
//    }
}