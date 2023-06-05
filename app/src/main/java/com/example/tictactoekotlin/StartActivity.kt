package com.example.tictactoekotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.tictactoekotlin.databinding.ActivityMainBinding
import com.example.tictactoekotlin.databinding.ActivityStartBinding
import java.util.zip.Inflater

class StartActivity : AppCompatActivity() {
    private lateinit var binding1 : ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ActivityStartBinding.inflate(layoutInflater)

        setContentView(binding1.root)



        binding1.button.setOnClickListener {

                var intent = Intent(this , GameActivity::class.java)
                    startActivity(intent)




        }




        }
    }
