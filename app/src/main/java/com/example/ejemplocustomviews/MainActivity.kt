package com.example.ejemplocustomviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movie = findViewById<MovieView>(R.id.movie)
        movie.setMovie(Movie("Batman", "http"))

    }
}