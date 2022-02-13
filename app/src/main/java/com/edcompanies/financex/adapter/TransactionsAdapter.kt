package com.edcompanies.financex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edcompanies.financex.R
import com.edcompanies.financex.model.Transaction
import org.w3c.dom.Text
import java.lang.Math.floor
import java.lang.Math.round

class TransactionsAdapter(val dataset:List<Transaction>):
    RecyclerView.Adapter<TransactionsAdapter.TransactionViewHolder>() {

    class TransactionViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val transactionMode=view.findViewById<TextView>(R.id.transaction_mode_id)
        val transactionTime=view.findViewById<TextView>(R.id.transaction_time_id)
        val transactionUgxAmount=view.findViewById<TextView>(R.id.transaction_ug_amount_id)
        val transactionUsdAmount=view.findViewById<TextView>(R.id.transaction_usd_amount_id)
        val img=view.findViewById<ImageView>(R.id.transaction_icon_id)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.item_transaction,parent,false)
        return  TransactionViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction=dataset[position]
        holder.transactionMode.text=transaction.mode
        holder.transactionTime.text=transaction.date
        holder.transactionUgxAmount.text="${transaction.amount} UGX"
        holder.transactionUsdAmount.text=String.format("USD %.2f",(transaction.amount.toFloat()/3500.0))
        holder.img.setImageResource(transaction.imageId)

    }

    override fun getItemCount()=dataset.size
}