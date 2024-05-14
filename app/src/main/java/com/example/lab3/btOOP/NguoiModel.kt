package com.example.lab3.btOOP

open class NguoiModel(var hoten:String, var tuoi:Int?, var quequan:String?) {
    open fun getThongTin():String{
        return "$hoten- Tuoi: $tuoi- Que quan: $quequan"
    }
}