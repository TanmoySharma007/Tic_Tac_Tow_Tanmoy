package com.example.tictactoekotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.tictactoekotlin.databinding.ActivityGameBinding
import com.example.tictactoekotlin.databinding.ActivityMainBinding



class GameActivity : AppCompatActivity() {



    private lateinit var binding3: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding3= ActivityGameBinding.inflate(layoutInflater)

        setContentView(binding3.root)

         binding3.CardViewbutton.setOnClickListener {

             startActivity( Intent(this,StartActivity::class.java))
         }

            fun buttonclick( view : View){

                val buttonSelected = view as Button


            }
    }









}



