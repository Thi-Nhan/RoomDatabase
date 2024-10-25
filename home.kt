package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun home(modifier: Modifier = Modifier, navController: NavController){
   Scaffold (modifier = Modifier.fillMaxSize(),
      topBar = {
          TopAppBar(
              title = { Text("Le van quyen 0306221162") },
              colors = TopAppBarDefaults.topAppBarColors(
                  containerColor = Color.Blue,
                  titleContentColor = Color.White
              )
          )
      }
   ){
       Column(modifier=Modifier.padding(it).fillMaxSize(),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center
           ) {
            Text(
                text = "JSDHSJHDSHDSH",
                style = TextStyle(
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 45.sp
                )
            )
           Spacer(modifier.height(30.dp))
           Image(painter = painterResource(R.drawable.img), contentDescription = null,modifier=Modifier.size(width = 400.dp, height = 300.dp))
           Spacer(modifier.height(30.dp))
           ElevatedButton(
               onClick = {
                    navController.navigate(Screen.register.route)
               },
               modifier=modifier.padding(70.dp).size(width = 100.dp, height = 80.dp),
               shape = RoundedCornerShape(10),
               colors = ButtonDefaults.elevatedButtonColors(
                   containerColor = Color.Blue
               )
           ) {
               Text(text = "dang ky", color = Color.White)
           }
       }
   }
}
//@Preview(showBackground = true)
//@Composable
//fun GreetinPreview() {
//    MyApplicationTheme {
//        home()
//    }
//}