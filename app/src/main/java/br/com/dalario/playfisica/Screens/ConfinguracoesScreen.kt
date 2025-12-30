package br.com.dalario.playfisica.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth

@Composable
fun ConfiguracoesScreen(modifier: Modifier = Modifier, navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo tela",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center
            ){
            Button(
                modifier = Modifier.padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.azul_logo)),
                onClick = {
                    FirebaseAuth.getInstance().signOut()
                    navController.navigate("login")
                }

            ) {
                Text(
                    "Deslogar",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontFamily = Piexelify,
                    fontSize = 30.sp
                )
            }
        }
    }


}