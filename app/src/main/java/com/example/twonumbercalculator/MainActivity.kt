package com.example.twonumbercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnSum:Button
    lateinit var btnMinus:Button
    lateinit var btnMulti:Button
    lateinit var btnModulus:Button
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var tvSubtract: TextView
    lateinit var tvAddition:TextView
    lateinit var tvMultiply:TextView
    lateinit var tvModulus:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSum=findViewById(R.id.btnSum)
        btnMinus=findViewById(R.id.btnMinus)
        btnMulti=findViewById(R.id.btnMulti)
        btnModulus=findViewById(R.id.btnModulus)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        tvSubtract=findViewById(R.id.tvSubtract)
        tvAddition=findViewById(R.id.tvAddition)
        tvMultiply=findViewById(R.id.tvMultiply)
        tvModulus=findViewById(R.id.tvModulus)

        btnSum.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            calculateSum(num1,num2)
        }
        btnMinus.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            calculateMinus(num1,num2)
        }
        btnMulti.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            calculateMultiplication(num1,num2)
        }
        btnModulus.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            calculateModulus(num1,num2)
        }
    }
    fun calculateModulus(num1: Int, num2: Int) {
     var modulus=num1%num2
        tvModulus.text=modulus.toString()
    }

    fun calculateMultiplication(num1: Int, num2: Int) {
       var multiplicatiuon=num1*num2
        tvMultiply.text=multiplicatiuon.toString()
    }

    fun calculateMinus(num1: Int, num2: Int) {
      var minus=num1-num2
        tvSubtract.text=minus.toString()
    }

    fun calculateSum(num1:Int,num2:Int){
       var sum=num1+num2
        tvAddition.text=sum.toString()

    }

}