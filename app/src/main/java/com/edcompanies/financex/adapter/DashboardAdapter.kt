package com.edcompanies.financex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edcompanies.financex.R
import com.edcompanies.financex.model.DashboardItem
import com.edcompanies.financex.model.Transaction

class DashboardAdapter(val dataset: List<DashboardItem>):
    RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder>() {

    class DashboardViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val dImage=view.findViewById<ImageView>(R.id.item_image)
        val dTitle=view.findViewById<TextView>(R.id.item_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.item_dashboard,parent,false)
        return  DashboardViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val item=dataset[position]
        holder.dImage.setImageResource(item.imgId)
        holder.dTitle.text=item.title

    }

    override fun getItemCount()=dataset.size
}