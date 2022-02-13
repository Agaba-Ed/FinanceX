package com.edcompanies.financex.model

class Transaction(private val id:Int,val mode:String,val date:String,val amount:Int,val imageId:Int)

class Notification(val id:Int,val msg:String,val time:String,val img:Int)

class DashboardItem(private val id:Int,val imgId:Int,val title:String)