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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

@Composable
fun QuizzesScreen(navController: NavController){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo estrelado",
            contentScale = ContentScale.Crop,
        )

        Column(modifier = Modifier.fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 5.dp), verticalArrangement = Arrangement.SpaceAround, horizontalAlignment = Alignment.CenterHorizontally) {

            Column(
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.border(2.dp, Color.White, shape = RoundedCornerShape(10.dp)),
            ) {
                Text(
                    "Quizzes",
                    fontWeight = FontWeight.Bold,
                    fontFamily = Piexelify,
                    fontSize = 45.sp,
                    color = colorResource(R.color.white),
                    modifier = Modifier.border(
                        1.dp,
                        color = Color.DarkGray, shape = RoundedCornerShape(10.dp),
                    ).background(
                        colorResource(R.color.quiz),
                        shape = RoundedCornerShape(10.dp)
                    ).padding(horizontal = 10.dp)
                )
            }

            Spacer(Modifier.padding(vertical = 10.dp))
            Column(modifier = Modifier.fillMaxSize().padding(bottom = 20.dp).verticalScroll(state = rememberScrollState())) {
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz)),
                border = BorderStroke(1.dp, Color.White),
                onClick = {navController.navigate("quiz")}
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        "Tipos de Forças",
                        fontSize = 40.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

            }
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz)),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        "Leis de Newton",
                        fontSize = 40.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz)),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        "P5.js",
                        fontSize = 40.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz)),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        "????????",
                        fontSize = 40.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz)),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        "????????",
                        fontSize = 40.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz)),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        "????????",
                        fontSize = 40.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

        }
        }


    }


}