package com.example.tochnodz1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tochnodz1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = CatAdapter()
    private val imageIdList = listOf(
        R.drawable.cat1,
        R.drawable.cat2,
        R.drawable.cat3,
        R.drawable.cat4,
        R.drawable.cat5,
    )
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)
        init()

    }

    private fun init() {
        binding.apply {
            rv.layoutManager = LinearLayoutManager(this@MainActivity)
            rv.adapter = adapter
            while (i<5){
                var qq = i+1
                val cat = Cat(imageIdList[i], "Cool cat $qq", "he is cool cat $qq")
                adapter.addCat(cat)
                i++
            }
        }
    }
    fun onClickDetails(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }


}