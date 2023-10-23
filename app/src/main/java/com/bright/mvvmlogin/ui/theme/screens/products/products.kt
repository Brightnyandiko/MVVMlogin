package com.bright.mvvmlogin.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bright.mvvmlogin.R
import com.bright.mvvmlogin.navigation.ROUTE_HOME

@Composable
fun Products(navController: NavHostController) {

    Column(horizontalAlignment = Alignment.Start,
           verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
          ) {
        Image(painter = painterResource(id = R.drawable.doublebed),
            contentDescription = "double bed",
        )
        Spacer(modifier = Modifier.height(30.dp))

        Image(painter = painterResource(id = R.drawable.singleroom),
            contentDescription = "mountain",
             )

        Spacer(modifier = Modifier.height(30.dp),
        )

        Image(painter = painterResource(id = R.drawable.mount),
            contentDescription = "singleroom")
        
        Spacer(modifier = Modifier.height(10.dp))
        
        Button(onClick = { navController.navigate(ROUTE_HOME) },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape) {
            
            Text(text = "Homepage", color = Color.DarkGray)
            
        }

    }




}

@Preview
@Composable
fun Productsprev() {

    Products(rememberNavController())

}