package com.example.lab3.btOOP

class CBGV(
    hoten: String,
    tuoi: Int?,
    quequan: String?,
    var msgv: String,
    var luongCung: Float,
    var luongThuong: Float?,
    var luongPhat: Float?
) : NguoiModel(hoten, tuoi, quequan) {
    var luongThuc: Float = 0f
        get() = luongCung + (luongThuong ?: 0f) - (luongPhat ?: 0f)

    override fun getThongTin(): String {
        return "CBGV: ${super.getThongTin()} -msgv: $msgv- " +
                "Luong thuc linh: $luongThuc"
    }

   companion object{
       var dsGv = mutableListOf<CBGV>()

       public fun addGv(gv: CBGV) {
           dsGv.add(gv)
       }

       public fun deleteGv(id: String) {
           val gv = dsGv.find { it.msgv == id }
           dsGv.remove(gv)
       }

       public fun getDS(){
           if (dsGv.isEmpty()){
               println("Danh sách trống")
           }else{
               dsGv.forEach{gv->
                   println(gv.getThongTin())
               }
           }
       }

       public fun updateGv(id:String, updategv:CBGV){
           val index = dsGv.indexOfFirst { it.msgv == id }
           if (index != -1) {
               dsGv[index] = updategv
           } else {
               println("Không tìm thấy giáo viên")
           }
       }
   }
}
