package com.example.burak.orderlist.Items

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.burak.orderlist.R
import kotlinx.android.synthetic.main.profile_items.view.*

class Profile_RvAdapter(private val items: MutableList<String>) : RecyclerView.Adapter<Profile_RvAdapter.VH>() {

    companion object {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(parent)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun addItem(name: String) {
        items.add(name)
        notifyItemInserted(items.size)
    }

    fun removeAt(position: Int) {
        items.removeAt(position)
        notifyItemRemoved(position)
    }

    class VH(parent: ViewGroup) : RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.profile_items, parent, false)) {

        fun bind(name: String) = with(itemView) {
            val ff:Float = 15.toFloat()
            rowName.text = name
            rowName.setTextColor(Color.BLUE)
            rowName.textSize = ff
        }
    }
}