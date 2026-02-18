package br.com.dalario.playfisica.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify

@Composable
fun ModulosScreen(navController: NavController) {

    Box (modifier = Modifier.fillMaxSize().background(color = colorResource(R.color.fundo))){
        Image(
            painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo tela",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxSize().statusBarsPadding()) {
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
                    .height(90.dp)
                    .padding(horizontal = 5.dp),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {

                Image(
                    painter = painterResource(R.drawable.foguete),
                    contentDescription = "Foguete", Modifier.size(80.dp)
                )

                Column(
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.border(2.dp, Color.White, shape = RoundedCornerShape(10.dp)),
                ) {

                    Text(
                        "Módulos",
                        fontWeight = FontWeight.Bold,
                        fontFamily = Piexelify,
                        fontSize = 45.sp,
                        color = colorResource(R.color.white),
                        modifier = Modifier.border(
                            1.dp,
                            color = Color.DarkGray, shape = RoundedCornerShape(10.dp),
                        ).background(
                            colorResource(R.color.azul_logo),
                            shape = RoundedCornerShape(10.dp)
                        ).padding(horizontal = 10.dp)
                    )
                }

                Image(
                    painter = painterResource(R.drawable.foguete),
                    contentDescription = "Foguete",
                    Modifier
                        .size(80.dp)
                        .graphicsLayer(scaleX = -1f)
                )

            }
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(110.dp)
                    .padding(5.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.modulo_1)),
                border = BorderStroke(1.dp, Color.White),
                onClick = { navController.navigate("modulo1") }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
//
                    ) {
                        Text(
                            "Módulo",
                            fontSize = 60.sp, color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Piexelify,
                        )

                    }
                    Text(
                        "1",
                        fontSize = 60.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Piexelify,
                    )
                }

            }
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(110.dp)
                    .padding(5.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.modulo_2)),
                border = BorderStroke(1.dp, Color.White),
                onClick = { navController.navigate("modulo2") }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
                    ) {
                        Text(
                            "Módulo",
                            fontSize = 60.sp, color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Piexelify,
                        )

                    }
                    Text(
                        "2",
                        fontSize = 60.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Piexelify,
                    )
                }

            }
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(110.dp)
                    .padding(5.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.modulo_3)),
                border = BorderStroke(1.dp, Color.White),
                onClick = { navController.navigate("modulo3") }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
//
                    ) {
                        Text(
                            "Módulo",
                            fontSize = 60.sp, color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Piexelify,
                        )

                    }
                    Text(
                        "3",
                        fontSize = 60.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Piexelify,
                    )
                }

            }
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(110.dp)
                    .padding(5.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.modulo_4)),
                border = BorderStroke(1.dp, Color.White),
                onClick = { navController.navigate("modulo4") }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
//
                    ) {
                        Text(
                            "Módulo",
                            fontSize = 60.sp, color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Piexelify,
                        )

                    }
                    Text(
                        "4",
                        fontSize = 60.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Piexelify,
                    )
                }

            }

        }
    }

}