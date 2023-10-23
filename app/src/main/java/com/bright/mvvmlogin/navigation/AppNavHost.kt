package com.bright.mvvmlogin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bright.mvvmlogin.ui.theme.screens.calculator.CalculatorScreen
import com.bright.mvvmlogin.ui.theme.screens.home.HomeScreen
import com.bright.mvvmlogin.ui.theme.screens.intent.IntentScreen
import com.bright.mvvmlogin.ui.theme.screens.login.LoginScreen
import com.bright.mvvmlogin.ui.theme.screens.products.Products
import com.bright.mvvmlogin.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination: String= ROUTE_HOME) {

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination ){

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_PRODUCTS){
            Products(navController)
        }
        composable(ROUTE_CALCULATOR){
            CalculatorScreen(navController)
        }
        composable(ROUTE_INTENT){
            IntentScreen(navController)
        }
    }
    
}