package com.demo.advanced.daggerhilt.view.base


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T>(private var items: ArrayList<T>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    abstract fun onBindData(holder: RecyclerView.ViewHolder?, `val`: T, position: Int)
    abstract fun setItemLayout(): Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(setItemLayout(), parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        onBindData(holder, items[position], position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    internal inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)
}