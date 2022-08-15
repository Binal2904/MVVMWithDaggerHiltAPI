package com.demo.advanced.daggerhilt.view.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

class BaseViewHolder internal constructor(
    binding: ViewBinding
) : RecyclerView.ViewHolder(binding.root)