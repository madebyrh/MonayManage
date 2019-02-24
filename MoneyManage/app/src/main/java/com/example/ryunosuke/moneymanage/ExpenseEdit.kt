package com.example.ryunosuke.moneymanage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.ryunosuke.moneymanage.R.layout.food_fragment
import com.example.ryunosuke.moneymanage.R.layout.life_fragment

class ExpenseEdit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val lifeFragment =  LifeFragment()
        val foodFragment = FoodFragment()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_edit)

        //どのボタンが押されたか判別
        val id = intent.getIntExtra("category",0)
        val transaction = supportFragmentManager.beginTransaction()
        when(id){
            R.id.food -> transaction.add(R.id.container, foodFragment)
            R.id.life -> transaction.add(R.id.container, lifeFragment)
        }

        transaction.commit()
    }

}
