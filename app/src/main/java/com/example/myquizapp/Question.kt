package com.example.myquizapp

data class Question(
    val id: Int, //id for the Question in this app
    val question: String, //type Int
    val image: Int, //Int is used to find the image in our folders
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int //this will hold the index of which answer is the correct one




)
