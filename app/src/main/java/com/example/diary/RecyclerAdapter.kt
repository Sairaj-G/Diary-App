package com.example.diary

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter <RecyclerAdapter.ViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.item_date.text = "1/1/2022"
        holder.item_entry.text = "My First Diary Entry"
    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var item_date : TextView
        var item_entry : TextView
        init {
            item_date  =itemView.findViewById(R.id.textView)
            item_entry= itemView.findViewById(R.id.textView2)
        }
    }
}