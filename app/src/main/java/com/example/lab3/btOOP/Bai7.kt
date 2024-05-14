package com.example.lab3.btOOP

fun main(){
    var hoten:String=""
    var tuoi:Int=0
    var quequan:String=""
    var msgv:String=""
    var luongcung:Float=0f
    var luongthuong:Float?=0f
    var luongphat:Float?=0f
    var s:String?
    var gv1= CBGV("Nguyen Van Long", 30, "HCM", "34899", 500f,50f, 10f)

    println(gv1.getThongTin())

    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    println("Nhập tên giáo viên: ")
                    s= readLine()
                    if (s!= null){
                        hoten=s
                    }

                    println("Nhập tuổi giáo viên: ")
                    s= readLine()
                    if (s!= null){
                        tuoi=s.toInt()
                    }

                    println("Nhập quê quán giáo viên: ")
                    s= readLine()
                    if (s!= null){
                        quequan=s
                    }

                    println("Nhập mã giáo viên: ")
                    s= readLine()
                    if (s!= null){
                        msgv=s
                    }

                    println("Nhập lương cứng: ")
                    s= readLine()
                    if (s!= null){
                        luongcung=s.toFloat()
                    }

                    println("Nhập lương thưởng: ")
                    s= readLine()
                    if (s!= null){
                        luongthuong=s.toFloat()
                    }

                    println("Nhập lương phạt: ")
                    s= readLine()
                    if (s!= null){
                        luongphat=s.toFloat()
                    }

                    val gv2 = CBGV(hoten, tuoi, quequan, msgv, luongcung, luongthuong, luongphat)
                    CBGV.addGv(gv2)

                }


                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")
                    CBGV.getDS()
                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    println("Nhap msgv can xoa: ")
                    s= readLine()
                    if (s!=null){
                        CBGV.deleteGv(s)
                    }
                }

                4 -> {
                    println("Cap nhat thong tin gv")
                    println("Cập nhật thông tin giáo viên")
                    println("Nhập mã giáo viên cần cập nhật: ")
                    val id = readLine() ?: ""

                    println("Nhập tên giáo viên: ")
                    hoten = readLine() ?: ""

                    println("Nhập tuổi giáo viên: ")
                    tuoi = readLine()?.toIntOrNull() ?: 0

                    println("Nhập quê quán giáo viên: ")
                    quequan = readLine() ?: ""

                    println("Nhập mã giáo viên: ")
                    msgv = readLine() ?: ""

                    println("Nhập lương cứng: ")
                    luongcung = readLine()?.toFloatOrNull() ?: 0f

                    println("Nhập lương thưởng: ")
                    luongthuong = readLine()?.toFloatOrNull()

                    println("Nhập lương phạt: ")
                    luongphat = readLine()?.toFloatOrNull()

                    val updatedGv = CBGV(hoten, tuoi, quequan, msgv, luongcung, luongthuong, luongphat)
                    CBGV.updateGv(id, updatedGv)
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)
}