package com.bright.mvvmlogin.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bright.mvvmlogin.navigation.ROUTE_LOGIN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen(navController:NavHostController) {
    var firstnumber by remember { mutableStateOf(TextFieldValue("")) }
    var secondnumber by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Text(
            text = "Calculator",
            color = Color.Black,
            fontSize = 30.sp
        )

        OutlinedTextField(value = firstnumber,
            onValueChange = { firstnumber = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = {
                Text(
                    text = "Enter first number",
                    color = Color.Black,
                    fontSize = 30.sp
                )
            }

        )

        OutlinedTextField(value = secondnumber,
            onValueChange = { secondnumber = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = {
                Text(
                    text = "Enter second number",
                    color = Color.Black,
                    fontSize = 30.sp
                )
            }
        )

        Button(
            onClick = {
                val myfirstnumber=firstnumber.text.trim()
                val mysecondnumber=secondnumber.text.trim()

                if (myfirstnumber.isEmpty() || mysecondnumber.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnumber.toDouble() + mysecondnumber.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
        ) {

            Text(text = "+", color = Color.Black)

        }
        Button(
            onClick = {
                      val myfirstnumber=firstnumber.text.trim()
                      val mysecondnumber=secondnumber.text.trim()

                if (myfirstnumber.isEmpty() || mysecondnumber.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnumber.toDouble() - mysecondnumber.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
        ) {

            Text(text = "-", color = Color.Black)

        }

        Button(
            onClick = {
                val myfirstnumber=firstnumber.text.trim()
                val mysecondnumber=secondnumber.text.trim()

                if (myfirstnumber.isEmpty() || mysecondnumber.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnumber.toDouble() * mysecondnumber.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
        ) {

            Text(text = "*", color = Color.Black)

        }

        Button(
            onClick = {
                val myfirstnumber=firstnumber.text.trim()
                val mysecondnumber=secondnumber.text.trim()

                if (myfirstnumber.isEmpty() || mysecondnumber.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnumber.toDouble() / mysecondnumber.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
        ) {

            Text(text = "/", color = Color.Black)

        }

        Text(text = answer,
            color = Color.Black,
            fontSize = 30.sp)


    }
}

    @Preview
    @Composable
    fun CalPreview() {
        CalculatorScreen(rememberNavController())

    }