package com.demo.advanced.daggerhilt.view.base


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseAdapter<T, VB : ViewBinding>(private var items: MutableList<T>) :
    RecyclerView.Adapter<BaseViewHolder>() {

    abstract fun onBindData(`val`: T)
    lateinit var binding: VB

    abstract fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): VB


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        binding =
            setBinding(layoutInflater, parent)
        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        onBindData(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

}