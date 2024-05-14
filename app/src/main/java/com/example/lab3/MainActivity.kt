package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab3.ui.theme.Lab3Theme
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable


class MainActivity : ComponentActivity() {

    @Composable
    fun Greeting(name:String){
        Text(
            text ="Hello, $name",
            modifier = Modifier
                .padding(0.dp, 16.dp)
                .fillMaxWidth(),
            color = Color.Blue,

            textAlign = TextAlign.Center
        )
    }

    @Composable
    fun MessageCard(msg:String){
        Text(
            text = msg,
            modifier= Modifier
                .padding(0.dp, 16.dp)
                .fillMaxWidth(),
            color = Color.DarkGray,
//            fontSize = 100 .dp,
//            fontWeight = FontWeight.Bold,
//            textAlign = TextAlign.Center
        )
    }

    @Composable
    fun CounterCard(){
        var count by rememberSaveable { mutableStateOf(0) }
        Column (
            modifier= Modifier
                .fillMaxWidth()
                .padding(30.dp)
            ){
            MessageCard(msg = "You have clicked the button $count times")
            Button(onClick = {count++}) {
                Text(text = "Click me")
            }
        }
    }

    @Composable
    fun GreetingCard(msg:String){
        var text by remember{ mutableStateOf(msg)}

        Column (
            modifier= Modifier
                .fillMaxWidth()
                .padding(30.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
        ){
            MessageCard(msg = text)
            Button(onClick = {text="Hi!"}) {
                Text(text = "Click me")
            }
        }

    }


    @Preview(showBackground = true)
    @Composable
    fun PreviewGreeting(){
        Greeting(name = "Đỗ Tuấn Thành")
//        GreetingCard(msg = "Đỗ Tuấn Thành-PH34899")
        CounterCard()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            Greeting(name = "Đỗ Tuấn Thành")
            CounterCard()
        }
    }


}
