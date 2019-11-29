package com.sample.caculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPush(v: View){
        if (operation == true){
            editText.setText("")
        }
        operation = false
        val btnSlected = v as Button
        var Value: String? = editText.text.toString()
        when(btnSlected.id){
            btn1.id -> {Value+="1"}
            btn2.id -> {Value+="2"}
            btn3.id -> {Value+="3"}
            btn4.id -> {Value+="4"}
            btn5.id -> {Value+="5"}
            btn6.id -> {Value+="6"}
            btn7.id -> {Value+="7"}
            btn8.id -> {Value+="8"}
            btn9.id -> {Value+="9"}
            btn0.id -> {Value+="0"}
            btnDOT.id -> {Value+="."}
            btnAM.id -> {Value= "-"+ Value}
        }
        editText.setText(Value)
    }

    var op = "*"
    var operation = true
    var oldNumber = ""
    fun onPush2(v:View){
        val btnSlected = v as Button
        var Value: String? = editText.text.toString()
        when(btnSlected.id){
            btnMU.id ->{
               op = "*"
            }
            btnD.id ->{
                op = "/"
            }
            btnADD.id ->{
                op = "+"
            }
            btnMI.id ->{
                op = "-"
            }

        }
        oldNumber = editText.text.toString()
        operation = true

    }

    fun onPush3(v:View){
        var newNumber = editText.text.toString()
        var finalNumber: Double? = null
        when(op){
            "*" ->{
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "/" ->{
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "+" ->{
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
            "-" ->{
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
        }
        editText.setText(finalNumber.toString())
        operation = true
    }

    fun onPercent(v: View){
        var number = editText.text.toString().toDouble()/100
        editText.setText(number.toString())

    }

    fun onClean(v:View){
        editText.setText("0")
        operation = true
    }


















}
