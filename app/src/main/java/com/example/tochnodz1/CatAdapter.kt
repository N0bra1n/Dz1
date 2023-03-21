package com.example.tochnodz1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tochnodz1.databinding.ItemCatBinding
import java.util.ArrayList

class CatAdapter: RecyclerView.Adapter<CatAdapter.CatHolder>() {
    val catList = ArrayList<Cat>()
    class CatHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = ItemCatBinding.bind(item)
        fun bind(cat: Cat) = with(binding){

            iv.setImageResource(cat.imageId)
            tvName.text = cat.name
            tvDesc.text = cat.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cat, parent, false)
        return CatHolder(view)
    }

    override fun getItemCount(): Int {
        return catList.size
    }

    override fun onBindViewHolder(holder: CatHolder, position: Int) {
        holder.bind(catList[position])
    }

    fun addCat(cat: Cat){
        catList.add(cat)
        notifyDataSetChanged()
    }
}