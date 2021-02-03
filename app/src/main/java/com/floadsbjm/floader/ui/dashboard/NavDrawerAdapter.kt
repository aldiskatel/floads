package com.floadsbjm.floader.ui.dashboard

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.floadsbjm.floader.databinding.RowNavDrawerBinding

class NavDrawerAdapter(
    private var items: ArrayList<NavigationDrawerItemModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var context: Context

    class NavDrawerItemViewHolder(private val binding: RowNavDrawerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: NavigationDrawerItemModel, lastItem: Boolean) {
            if (lastItem) {
                binding.viewSeparator.isVisible = false
            }
            binding.ivHomeIcon.setImageResource(item.icon)
            binding.tvHome.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        val binding = RowNavDrawerBinding.inflate(LayoutInflater.from(context), parent, false)
        return NavDrawerItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position == items.size - 1) {
            (holder as NavDrawerItemViewHolder).bind(items[position], true)
        }
        (holder as NavDrawerItemViewHolder).bind(items[position], false)
        holder.itemView.setOnClickListener {
            onItemClickListener?.let { it(items[position]) }
        }
    }


    override fun getItemCount(): Int {
        return items.count()
    }

    private var onItemClickListener: ((NavigationDrawerItemModel) -> Unit)? = null

    fun setOnItemClickListener(listener: (NavigationDrawerItemModel) -> Unit) {
        onItemClickListener = listener
    }
}