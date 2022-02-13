package com.edcompanies.financex.data

import com.edcompanies.financex.R
import com.edcompanies.financex.model.DashboardItem
import com.edcompanies.financex.model.Notification
import com.edcompanies.financex.model.Transaction

class DataManager {
    fun loadTransactions():List<Transaction>{
        return listOf(Transaction(1,"Receive","11 Feb 2022, 3:49PM",1000, R.drawable.ic_down),
            Transaction(2,"Receive","11 Feb 2022,2:49PM",1000,R.drawable.ic_down),Transaction
        (3,"Send","11 Feb 2022,12:05PM",20000,R.drawable.ic_up))
    }

    fun loadDashboardItems():List<DashboardItem>{
        return listOf(DashboardItem(1,R.drawable.ic_transactions,"Transactions"),
            DashboardItem(2,R.drawable.ic_bills,"Bills"), DashboardItem
        (3,R.drawable.ic_invoices,"Invoices"),DashboardItem
        (4,R.drawable.ic_support,"Support"))
    }

    fun loadNotifications():List<Notification>{
        return listOf(Notification(1,"Tom requested you to send them 400,000","11 Feb,2022 4:00PM",R.drawable.tom))
    }
}