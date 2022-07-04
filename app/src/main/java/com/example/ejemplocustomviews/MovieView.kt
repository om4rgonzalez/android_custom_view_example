package com.example.ejemplocustomviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MovieView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private val cover: ImageView
    private val tittle: TextView

    init {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.view_movie, this, true)

        cover = view.findViewById(R.id.cover)
        tittle = view.findViewById(R.id.tittle)
    }

    fun setMovie(movie: Movie){
        tittle.text = movie.tittle
    }
}