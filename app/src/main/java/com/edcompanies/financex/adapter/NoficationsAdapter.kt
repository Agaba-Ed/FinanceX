package com.edcompanies.financex.adapter

import com.edcompanies.financex.model.Notification
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edcompanies.financex.R

class NotificationsAdapter(val dataset: List<Notification>):
    RecyclerView.Adapter<NotificationsAdapter.NotificationViewHolder>() {

    class NotificationViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val nImage=view.findViewById<ImageView>(R.id.notif_img)
        val nMsg=view.findViewById<TextView>(R.id.notif_msg)
        val nTime=view.findViewById<TextView>(R.id.notif_time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.item_notification,parent,false)
        return  NotificationViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val notification=dataset[position]
        holder.nImage.setImageResource(notification.img)
        holder.nMsg.text=notification.msg
        holder.nTime.text=notification.time

    }

    override fun getItemCount()=dataset.size
}