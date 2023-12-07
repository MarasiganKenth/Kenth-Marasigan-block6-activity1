package com.marasigan.kenth.block6.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.marasigan.kenth.block6.p1.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener { add() }
        binding.btnSub.setOnClickListener { sub() }
        binding.btnMul.setOnClickListener { mul() }
        binding.btnDiv.setOnClickListener { div() }
    }

    private fun div() {
        TODO("Not yet implemented")
    }

    private fun mul() {
        TODO("Not yet implemented")
    }

    private fun sub() {
        TODO("Not yet implemented")
    }

    private fun add() {
        Toast.makeText(this, "add", Toast.LENGTH_SHORT).show()
        val num1 = binding.etFirst.text.toString().toInt()
        val num2 = binding.etSecond.text.toString().toInt()
        val result = num1 + num2

        binding.tvAnswer.text = result.toString()
    }
}