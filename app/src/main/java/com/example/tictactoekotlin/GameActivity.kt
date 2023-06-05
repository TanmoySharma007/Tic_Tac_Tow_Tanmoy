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

            when (buSelected.id)
                       {
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
                  //  Log.d("buclicked: ",buSelected.id.toString())
                    //Log.d("cellid: ",cellId.toString())

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
             player2.add(cellid)
             activePlayer = 1
         }

         buSelected.isEnabled = false

         checkWinner()
     }

        fun checkWinner (){
            var winner = 0


            // row  1 is  the winner

            if (player1.contains(1)&& player1.contains(2)&& player1.contains(3)){
                winner = 1
            }
            if (player2.contains(1)&& player2.contains(2)&& player2.contains(3)){
                winner = 2
            }

            // row 2 is the winner
            if (player1.contains(4)&& player1.contains(5)&& player1.contains(6)){
                winner = 1
            }
            if (player2.contains(4)&& player2.contains(5)&& player2.contains(6)){
                winner = 2
            }

            // row 3 is the winner
            if (player1.contains(7)&& player1.contains(8)&& player1.contains(9)){
                winner = 1
            }
            if (player2.contains(7)&& player2.contains(8)&& player2.contains(9)){
                winner = 2
            }
            // column 1 is the winner
            if (player1.contains(1)&& player1.contains(4)&& player1.contains(7)){
                winner = 1
            }
            if (player2.contains(1)&& player2.contains(4)&& player2.contains(7)){
                winner = 2
            }
            // column 2 is the winner
            if (player1.contains(2)&& player1.contains(5)&& player1.contains(8)){
                winner = 1
            }
            if (player2.contains(2)&& player2.contains(5)&& player2.contains(8)){
                winner = 2
            }
            // column 3 is the winner
            if (player1.contains(3)&& player1.contains(6)&& player1.contains(9)){
                winner = 1
            }
            if (player2.contains(3)&& player2.contains(6)&& player2.contains(9)){
                winner = 2
            }
            // cross 1  is the winner
            if (player1.contains(1)&& player1.contains(5)&& player1.contains(9)){
                winner = 1
            }
            if (player2.contains(1)&& player2.contains(5)&& player2.contains(9)){
                winner = 2
            }

            // cross 2  is the winner
            if (player1.contains(3)&& player1.contains(5)&& player1.contains(7)){
                winner = 1
            }
            if (player2.contains(3)&& player2.contains(5)&& player2.contains(7)){
                winner = 2
            }






            if (winner==1) {
                 Toast.makeText(this,"player 1 wins the game",Toast.LENGTH_LONG).show()
            } else if (winner==2) {
                Toast.makeText(this,"player 2 wins the game",Toast.LENGTH_LONG).show()
            }
        }



}



