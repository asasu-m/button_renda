package com.gmail.murakasinn.button_renda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gmail.murakasinn.button_renda.ui.theme.Button_rendaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Button_rendaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent(){
    var pushCnt  by remember { mutableStateOf(0)}
    Box(
        modifier=Modifier
            .fillMaxSize(),
        contentAlignment= Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally

        ){

            Text(
                text=pushCnt.toString(10),
                color= Color.Red,
                fontSize=100.sp,
                fontWeight=FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick={
                        pushCnt++
                    //TODO
                },
                modifier = Modifier
                    .size(200.dp)



            ){
                Text(text="PUSH!!", fontSize = 20.sp)
            }
        }
    }
}