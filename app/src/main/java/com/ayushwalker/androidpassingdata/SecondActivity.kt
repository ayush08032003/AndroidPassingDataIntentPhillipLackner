package com.ayushwalker.androidpassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE",0)
//        val country = intent.getStringExtra("EXTRA_COUNTRY")
//        val person = "$name is $age years old and lives in $country"
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        tvPerson.text = person.toString() 

//        println(country)
    }

}