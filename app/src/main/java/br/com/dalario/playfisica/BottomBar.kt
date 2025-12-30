package br.com.dalario.playfisica

import androidx.compose.ui.res.colorResource
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.remember


@Composable
fun BottomBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val barColor =   when {
        currentRoute?.startsWith("modulo1") == true -> colorResource(R.color.modulo_1) // azul para módulo 1
        currentRoute?.startsWith("modulo2") == true -> colorResource(R.color.modulo_2) // verde para módulo 2
        currentRoute?.startsWith("modulo3") == true -> colorResource(R.color.modulo_3) // laranja para módulo 3
        currentRoute?.startsWith("quiz") == true -> colorResource(R.color.quiz)
        else-> colorResource(R.color.azul_logo)
    }


    NavigationBar(
        modifier = Modifier.height(60.dp),
        containerColor = barColor,

    ){
        Row(
            modifier = Modifier.fillMaxSize().padding(top = 9.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            NavigationBarItem(
                selected = navController.currentDestination?.route == "Modulos",
                onClick = {navController.navigate("modulos")},
                icon= {
                    Icon(
                        painterResource(R.drawable.icone_modulo2),
                        contentDescription = "Modulos",
                        Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
            )
            NavigationBarItem(
                selected = navController.currentDestination?.route == "Home",
                onClick = {navController.navigate("home")},
                icon= {
                    Icon(
                        Icons.Default.Home,
                        contentDescription = "Home",
                        Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
            )
            NavigationBarItem(
                selected = navController.currentDestination?.route == "Configuracoes",
                onClick = {navController.navigate("configuracoes")},
                icon= {
                    Icon(
                        Icons.Default.Settings,
                        contentDescription = "Configurações",
                        Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
            )













        }
    }
}