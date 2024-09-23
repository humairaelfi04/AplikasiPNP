package com.humaira.latihan23september

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.humaira.latihan23september.adapter.AdapterGaleri
import com.humaira.latihan23september.model.ModelGaleri

class Galeri : AppCompatActivity() {
    private var recyleView: RecyclerView? = null
    private var galeriAdapter: AdapterGaleri? = null
    private var movieList =  mutableListOf<ModelGaleri>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri)
        movieList = ArrayList()
        recyleView = findViewById(R.id.rv_galeri)
        galeriAdapter = AdapterGaleri(this,movieList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this,2
        )
        recyleView!!.layoutManager = layoutManager
        recyleView!!.adapter = galeriAdapter


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        prepareMovieList()
    }
    private fun prepareMovieList()
    {
        var movie = ModelGaleri("Akuntansi",R.drawable.akuntansi)
        movieList.add(movie)
        movie = ModelGaleri("Gedung Depan",R.drawable.depan)
        movieList.add(movie)
        movie = ModelGaleri("Diklat",R.drawable.diklat)
        movieList.add(movie)
        movie = ModelGaleri("Direktur",R.drawable.direktur)
        movieList.add(movie)
        movie = ModelGaleri("Logo PNP",R.drawable.logo)
        movieList.add(movie)
        movie = ModelGaleri("PKM",R.drawable.pkm)
        movieList.add(movie)
        galeriAdapter!!.notifyDataSetChanged()
    }

}