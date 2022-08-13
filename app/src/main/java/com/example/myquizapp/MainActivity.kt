package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val etName : EditText = findViewById(R.id.etName)
        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java) //intent is used to change between activities on the app screen
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish() //finish() is used to end the last activity. In this case MainActivity will get closed after pressing Start, which means if you go back you will get to the home screen of the phone.
            }
        }
    }
}