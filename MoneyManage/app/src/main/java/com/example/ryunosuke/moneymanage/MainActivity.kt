package com.example.ryunosuke.moneymanage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foodButton = findViewById<Button>(R.id.food)
        val lifeButton = findViewById<Button>(R.id.life)
        foodButton.setOnClickListener {
            onCategoryButtonTapped(it)
        }
        lifeButton.setOnClickListener {
            onCategoryButtonTapped(it)
        }
    }

    fun onCategoryButtonTapped(view: View?) {
        val intent = Intent(this, ExpenseEdit::class.java)
        intent.putExtra("category", view?.id)
        startActivity(intent)
    }
}
