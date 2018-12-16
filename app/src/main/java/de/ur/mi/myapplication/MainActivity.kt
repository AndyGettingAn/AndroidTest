package de.ur.mi.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        println(getSum(2,3))


    }

    fun getSum(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}
