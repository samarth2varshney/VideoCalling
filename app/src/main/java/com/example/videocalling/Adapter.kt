package com.example.videocalling

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codewithkael.webrtcprojectforrecord.utils.AdapterInterface
import com.codewithkael.webrtcprojectforrecord.utils.NewMessageInterface

class Adapter(private var items: MutableList<String>,private val Interface: AdapterInterface) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items[position]
        holder.textView.text = item
        holder.itemView.setOnClickListener {
            Interface.onClick(item)
        }
    }

    override fun getItemCount() = items.size

    fun updateData(newItems: List<String>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }



}