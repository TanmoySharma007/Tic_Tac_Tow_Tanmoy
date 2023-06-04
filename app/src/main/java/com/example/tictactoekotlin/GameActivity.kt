package com.example.tictactoekotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
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

    }

   fun buclick ( view : View){

         var cellId = 0
        val buSelected = view as Button

            when (buSelected.id){
                R.id.button1 ->
                    cellId = 1
                R.id.button2 ->
                    cellId = 2
                R.id.button3 ->
                    cellId = 3
                R.id.button4 ->
                    cellId = 4
                R.id.button5 ->
                    cellId = 5
                R.id.button6 ->
                    cellId = 6
                R.id.button7 ->
                    cellId = 7
                R.id.button8 ->
                    cellId = 8
                R.id.button9 ->
                    cellId = 9

            }
                    Log.d("buclicked: ",buSelected.id.toString())
                    Log.d("cellid: ",cellId.toString())

       gameplay(cellId,buSelected) // Gameplay Function is called in the viewClick Function

    }

    var activePlayer = 1

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

     fun gameplay (cellid:Int ,buSelected: Button) {

         if (activePlayer==1) {
             buSelected.text= "X"
             buSelected.setBackgroundResource(R.drawable.circular_button)
             player1.add(cellid)
             activePlayer = 2

         } else{
             buSelected.text= "O"

             buSelected.setBackgroundResource(R.drawable.circular_button)
             player1.add(cellid)
             activePlayer = 1
         }

         buSelected.isEnabled = false
     }


}



