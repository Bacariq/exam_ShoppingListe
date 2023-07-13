package com.example.exam_shoppingliste.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam_shoppingliste.R
import com.example.exam_shoppingliste.data.foodData


class itemAdapter( foodList : MutableList<foodData>) : RecyclerView.Adapter<itemViewHolder>() {
    var _foodList: MutableList<foodData> = foodList;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val layout =  LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout, parent, false)
        return itemViewHolder(layout);
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val item : foodData = _foodList[position];
        holder.SetupData(item)
    }

    override fun getItemCount(): Int {
        return _foodList.size
    }
}