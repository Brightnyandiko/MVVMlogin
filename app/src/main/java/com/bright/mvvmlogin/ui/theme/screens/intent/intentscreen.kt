package com.bright.mvvmlogin.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent

import android.content.pm.PackageManager
import android.provider.MediaStore
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController



@Composable
fun IntentScreen(navController: NavHostController) {

    val context= LocalContext.current
    Column(horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Top,
           modifier = Modifier
               .fillMaxSize()
               .background(Color.LightGray)) {



        Text(text = "CalcIntent App",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp)

        Button(onClick ={val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(context as Activity,takePictureIntent,1,null)},
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            ) {

            Text(text = "camera", color = Color.DarkGray)

        }
        Button(onClick = {
//            val uri = ("smsto:07456789")
//
////            val intent = Intent(Intent.ACTION_SENDTO, uri)
//            val intent= Intent(Intent.ACTION_SENDTO, uri)
//
//            intent.putExtra("Hello", "How is today's weather")
//
//            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            ) {

            Text(text = "sms", color = Color.DarkGray)

        }
        Button(onClick = {
            val phone = "+34666777888"

            val intent = Intent(Intent.ACTION_DIAL, android.net.Uri.fromParts("tel", phone, null))

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            ) {

            Text(text = "dial", color = Color.DarkGray)

        }

        Button(onClick = {
            val simToolKitLaunchIntent =
                context.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { context.startActivity(it) }
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            ) {

            Text(text = "mpesa", color = Color.DarkGray)

        }
        Button(onClick = {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, android.net.Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            context.startActivity(Intent.createChooser(emailIntent, "Send email..."))
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            ) {

            Text(text = "email", color = Color.DarkGray)

        }
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            ) {

            Text(text = "share", color = Color.DarkGray)

        }
        Button(onClick = {
            val intent = Intent(Intent.ACTION_CALL, android.net.Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)
            }
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            ) {

            Text(text = "call", color = Color.DarkGray)

        }

    }
    
}

@Preview
@Composable
fun intentscreenprev() {

    IntentScreen(rememberNavController())

}