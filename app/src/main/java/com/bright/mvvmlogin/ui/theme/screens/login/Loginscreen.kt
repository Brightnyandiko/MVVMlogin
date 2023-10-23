package com.bright.mvvmlogin.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bright.mvvmlogin.navigation.ROUTE_LOGIN
import com.bright.mvvmlogin.navigation.ROUTE_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController:NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
//    var confirmpassword by remember { mutableStateOf(TextFieldValue("")) }



    Column(horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Top,
           modifier = Modifier
               .fillMaxSize()
               .background(Color.LightGray)) {
        
        Text(text = "login here", color = Color.DarkGray,
            fontFamily = FontFamily.Monospace,
            fontSize = 10.sp
            )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = email, onValueChange ={
            email=it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = { Text(text = "Enter email", color = Color.DarkGray,
                           fontSize = 15.sp, fontFamily = FontFamily.Serif)
                     }


            )
        OutlinedTextField(value = password, onValueChange ={
            password=it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = { Text(text = "Enter password", color = Color.DarkGray,
                fontSize = 15.sp, fontFamily = FontFamily.Serif)
            }


        )

//        OutlinedTextField(value = confirmpassword, onValueChange ={
//            confirmpassword=it },
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp),
//            label = { Text(text = "Confirm password", color = Color.Gray,
//                fontSize = 15.sp, fontFamily = FontFamily.Serif)
//            }
//
//
//        )

        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
               colors = ButtonDefaults.buttonColors(Color.Gray),
               shape = CircleShape,
               modifier = Modifier.fillMaxWidth()) {

            Text(text = "Click to login", color = Color.DarkGray)

        }


        Button(onClick = { navController.navigate(ROUTE_REGISTER) },
               colors = ButtonDefaults.buttonColors(Color.Transparent),
               shape = CircleShape,
               modifier = Modifier.fillMaxWidth()) {
            Text(text = "Don't have an Account? ", color = Color.DarkGray)
            Text(text = "Create an account here", color = Color.Black)

        }




    }

}

@Preview
@Composable
fun LoginScreenpre() {

    LoginScreen(rememberNavController())

}