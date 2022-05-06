package com.example.cosplayplanner.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cosplayplanner.R
import com.example.cosplayplanner.models.Cosplay
import io.realm.RealmResults

class MainListAdapter : RecyclerView.Adapter<MainListHolder>() {
    private lateinit var data: RealmResults<Cosplay>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListHolder {
        val holder = LayoutInflater.from(parent.context).inflate(R.layout.holder_main_list, parent, false)
        return MainListHolder(holder)
    }

    override fun onBindViewHolder(holder: MainListHolder, position: Int) {
        holder.titleTextView.text = data[position]?.character.toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setData(_data: RealmResults<Cosplay>) {
        data = _data
    }
}

class MainListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.cosplayImage)
    val titleTextView: TextView = itemView.findViewById(R.id.cosplayTitleText)
}