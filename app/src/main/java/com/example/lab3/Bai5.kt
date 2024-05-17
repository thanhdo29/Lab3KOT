package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.compose.AsyncImage

class Bai5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GetLayout()
        }
    }

    @Composable
    fun GetLayout(){
        Column(
            modifier = Modifier
                .background(color = Color(0xFF262121))
                .fillMaxSize(),

        ) {
            GetTextTitle(title = "Thanh toán")
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black))
            Column(modifier = Modifier.padding(start = 15.dp, top = 10.dp)) {
                Text(text = "Địa chỉ nhận hàng",
                    color = Color.White,
                    fontSize = 13.sp)
                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 50.dp, bottom = 15.dp, top = 10.dp)) {
                    Image(painter = painterResource(id = R.drawable.address),
                        contentDescription =null,
                        modifier = Modifier.size(15.dp) )

                    Column (modifier = Modifier.padding(start = 20.dp)){
                        GetTextAddress(address = "Tri|22222222")
                        GetTextAddress(address = "22/333 đường Trung Mỹ Tây ")
                        GetTextAddress(address = "phường Tân Thời Nhất")
                        GetTextAddress(address = "quận 12, thành phố Hồ Chí Minh")
                    }
                }
                Text(text = "Vui lòng chọn một trong nhưng phương thức thanh toán sau:",
                    color = Color.White,
                    fontSize = 13.sp, modifier = Modifier.padding(bottom = 33.dp))
            }
            Box(modifier = Modifier){
                Column {
                    GetRowItem(color = Color(0xFFfa8500), noidung = "PayPal", linkAnh = "https://i.pinimg.com/564x/f4/22/30/f42230e621c19fea5815dde7a09ed83c.jpg")
                    GetRowItem(color = Color.LightGray, noidung = "Visa", linkAnh = "https://i.pinimg.com/564x/5f/79/a6/5f79a6defe837d721dd2e3b2dba041e1.jpg")
                    GetRowItem(color = Color(0xFFec1387), noidung = "Momo", linkAnh = "https://i.pinimg.com/564x/69/30/7b/69307bd0562270fae1f9a86c1c52a0af.jpg")
                    GetRowItem(color = Color(0xFF00c2fd), noidung = "Zalo Pay", linkAnh = "https://i.pinimg.com/564x/3e/65/3f/3e653f67cb491553c4684be8730f11f9.jpg")
                    GetRowItem(color = Color(0xFF18ebea), noidung = "Thanh toán trực tiếp", linkAnh = "https://i.pinimg.com/564x/51/96/31/519631424e1825241c6be399db399cc6.jpg")
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFfe734c)),
                    modifier = Modifier.fillMaxWidth().padding(top = 335.dp, start = 35.dp, end = 35.dp),
                    shape = RoundedCornerShape(7.dp)
                ) {
                    Text(text = "Tiếp theo", color = Color.White, fontSize = 16.sp) // Đặt màu chữ thành màu trắng để dễ đọc trên nền đen
                }

            }

        }
    }

    @Composable
    fun GetTextTitle(title:String){
        Text(text = title,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 20.dp),
            fontSize = 20 .sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)
    }

    @Composable
    fun GetTextAddress(address:String){
        Text(text = address, color = Color.White, modifier = Modifier.padding(2.dp))
    }

    @Composable
    fun GetRowItem(color: Color, noidung:String, linkAnh:String){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(20.dp, 5.dp, 20.dp, 5.dp)
                .background(color = color, shape = RoundedCornerShape(10.dp))
                .height(60.dp)
                .fillMaxWidth(),


            ) {
            AsyncImage(model = linkAnh, contentDescription =null, modifier = Modifier
                .size(50.dp, 50.dp)
                .padding(start = 20.dp) )



            Text(text = noidung,
                modifier = Modifier
                    .padding(start = 70.dp)
                    .weight(1f),color= Color.White)


            RadioButton(selected = false, onClick = { /*TODO*/ })

        }
    }

    @Preview
    @Composable
    fun DefaultPreview(){
        GetLayout()
    }

}