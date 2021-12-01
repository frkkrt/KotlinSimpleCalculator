package com.furkankurt.kotlinsimplecalculator

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.furkankurt.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var number1:Int?=null
    var number2:Int?=null
    var result:Int?=null

    lateinit var myString:String


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun mySum(view: View){
        /*
        var deger1=binding.editTextNumber.text.toString().toInt()
        var deger2=binding.editTextNumber2.text.toString().toInt()
        binding.resultText.text="Result:${deger1+deger2}"

         */
        number1=binding.editTextNumber.text.toString().toIntOrNull()
        number2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1==null||number2==null)
        {
            binding.resultText.text="Error"
        }
        else
        {
            result=number1!!+number2!!
            binding.resultText.text="Result: $result"
        }
    }
    fun mySub(view:View)
    {
        /*
        var deger1=binding.editTextNumber.text.toString().toInt()
        var deger2=binding.editTextNumber2.text.toString().toInt()
        binding.resultText.text="Result:${deger1-deger2}"

         */
        number1=binding.editTextNumber.text.toString().toIntOrNull()
        number2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1==null||number2==null)
        {
            binding.resultText.text="Error"
        }
        else
        {
            result=number1!!-number2!!
            binding.resultText.text="Result: $result"
        }
    }
    fun myMultiply(view:View)
    {
        /*
         var deger1=binding.editTextNumber.text.toString().toInt()
        var deger2=binding.editTextNumber2.text.toString().toInt()
        binding.resultText.text="Result:${deger1*deger2}"
         */
        number1=binding.editTextNumber.text.toString().toIntOrNull()
        number2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1==null||number2==null)
        {
            binding.resultText.text="Error"
        }
        else
        {
            result=number1!!*number2!!
            binding.resultText.text="Result: $result"
        }
    }
    fun myDiv(view:View)
    {
        /*
        var deger1=binding.editTextNumber.text.toString().toInt()
        var deger2=binding.editTextNumber2.text.toString().toInt()
        binding.resultText.text="Result:${deger1/deger2}"
         */
        number1=binding.editTextNumber.text.toString().toIntOrNull()
        number2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1==null||number2==null)
        {
            binding.resultText.text="Error"
        }
        else
        {
            result=number1!!/number2!!
            binding.resultText.text="Result: $result"
        }

    }
}