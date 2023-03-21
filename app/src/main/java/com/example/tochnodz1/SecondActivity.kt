package com.example.tochnodz1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tochnodz1.R
import com.example.tochnodz1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }



    fun onClickGoMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}