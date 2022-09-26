package com.example.coo.ui

import Controller
import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.coo.R
import com.example.coo.databinding.ActivityMainBinding
import android.content.ContentValues.TAG
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val lawan by lazy {
        arrayListOf(
            binding.ibatu2,
            binding.ikertas2,
            binding.igunting2,
        )
    }


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val controller = Controller(this)

        val kita = arrayListOf(
            binding.ibatu1,
            binding.ikertas1,
            binding.igunting1,
            binding.ibatu2, binding.ikertas2, binding.igunting2
        )
        when (binding.ibatu1 + binding.ibatu2) {
            binding.tvMenang.autoLinkMask{
                Log.d(TAG, "menang")
                Toast.makeText(this, "versus", Toast.LENGTH_SHORT).show()
            }->{binding.tvMenang}
        }
//        kita.forEachIndexed { Index, ImageView ->
//            ImageView.setOnClickListener {



            binding.ibatu1.setOnClickListener {
                Log.d(TAG, "batu")
                Toast.makeText(this, "batu", Toast.LENGTH_SHORT).show()
                binding.ibatu1.imageTintMode
                binding.ibatu1.setBackgroundColor(ContextCompat.getColor(this, R.color.bluewan))
            }
            binding.ikertas1.setOnClickListener {
                Log.d(TAG, "kertas")
                Toast.makeText(this, "kertas", Toast.LENGTH_SHORT).show()
                binding.ikertas1.imageTintMode
                binding.ikertas1.setBackgroundColor(ContextCompat.getColor(this, R.color.bluewan))
            }
            binding.igunting1.setOnClickListener {
                Log.d(TAG, "gunting")
                Toast.makeText(this, "gunting", Toast.LENGTH_SHORT).show()
                binding.igunting1.imageTintMode
                binding.igunting1.setBackgroundColor(ContextCompat.getColor(this, R.color.bluewan))
            }
        }
    }

private fun TextView.autoLinkMask(value: () -> Unit) {

}


//}

private operator fun Drawable.Callback.plus(ibatu2: ImageView) {

}
