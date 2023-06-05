package com.example.tictactoekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.example.tictactoekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView (binding.root)

        binding.logoimg.translationY = -1000f
        binding.gamename.translationY = 1000f

        binding.logoimg.animate().translationY( 0f).duration = 2000
        binding.gamename.animate().translationY( 0f).duration = 2000

        Handler(Looper.getMainLooper()).postDelayed({
            var intent= Intent(this,StartActivity::class.java)
            startActivity(intent)
        },3000)

    }
}