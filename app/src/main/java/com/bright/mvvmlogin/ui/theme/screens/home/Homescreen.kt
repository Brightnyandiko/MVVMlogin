package com.bright.mvvmlogin.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bright.mvvmlogin.navigation.ROUTE_CALCULATOR
import com.bright.mvvmlogin.navigation.ROUTE_INTENT
import com.bright.mvvmlogin.navigation.ROUTE_LOGIN
import com.bright.mvvmlogin.navigation.ROUTE_PRODUCTS
import com.bright.mvvmlogin.navigation.ROUTE_REGISTER

@Composable
fun HomeScreen(navController:NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)

    ) {

        Text(
            text = "Welcome to this App", color = Color.DarkGray,
            fontFamily = FontFamily.Serif, fontSize = 23.sp
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "The Apps User Interface", color = Color.Gray,
            fontFamily = FontFamily.Monospace, fontSize = 21.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { navController.navigate(ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
        ) {
            Text(text = "Login", color = Color.DarkGray)

        }
        Button(
            onClick = { navController.navigate(ROUTE_PRODUCTS) },
            colors = ButtonDefaults.buttonColors(Color.Gray,),
            shape = CircleShape
        ) {
            Text(text = "Products", color = Color.DarkGray)


        }

        Button(
            onClick = { navController.navigate(ROUTE_CALCULATOR) },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
        ) {
            Text(text = "Calculator", color = Color.DarkGray)
        }

        Button(
            onClick = { navController.navigate(ROUTE_INTENT) },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
        ) {
            Text(text = "Intent", color = Color.DarkGray)


        }
    }
}

@Preview
@Composable
fun HomePage() {

    HomeScreen(rememberNavController())
}