package com.dicoding.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var rvKpopes: RecyclerView
    private var list: ArrayList<Kpop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKpopes= findViewById(R.id.rv_kpops)
        rvKpopes.setHasFixedSize(true)

        list.addAll(KpopsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKpopes.layoutManager= LinearLayoutManager(this)
        val listKpopAdapter= ListKpopAdapter(list)
        rvKpopes.adapter= listKpopAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setMode(SelectedMode: Int) {
        when (SelectedMode) {
            R.id.about_page -> {
                val intentAbout= Intent(this@MainActivity, TentangKu::class.java)
                startActivity(intentAbout)
            }
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
}