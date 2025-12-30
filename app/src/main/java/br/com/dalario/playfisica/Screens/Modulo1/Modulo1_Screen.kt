package br.com.dalario.playfisica.Screens.Modulo1

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import br.com.dalario.playfisica.Componentes.Aulas
import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify

@Composable
fun Modulo1_Screen (navController: NavController) {
    Box(modifier = Modifier.fillMaxSize().background(color = colorResource(R.color.fundo))){
        Image(
            painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo tela",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize().statusBarsPadding()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    "Aulas Módulo 1",
                    fontWeight = FontWeight.Bold,
                    fontFamily = Piexelify,
                    fontSize = 45.sp,
                    color = colorResource(R.color.white),
                    modifier = Modifier.border(
                        2.dp,
                        color = Color.White, shape = RoundedCornerShape(10.dp),
                    ).background(
                        colorResource(R.color.modulo_1),
                        shape = RoundedCornerShape(10.dp)
                    ).padding(horizontal = 10.dp)
                )
            }
            Column(modifier = Modifier.fillMaxSize().verticalScroll(state = rememberScrollState())) {
            Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "O que é P5.js?",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_1",
                    imagemRes = R.drawable.play,
                    thumbnailid = "3Ld0IT9ii-4"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "Functions Setup e Draw do P5.js",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_2",
                    imagemRes = R.drawable.play,
                    thumbnailid = "brYO770Ccv4"
                )
            }
            Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "CreateCanvas e Backgroud",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_3",
                    imagemRes = R.drawable.play,
                    thumbnailid = "68PfSUKZ62U"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "Circle e EllIpse",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_4",
                    imagemRes = R.drawable.play,
                    thumbnailid = "kMvgZRXhzw8"
                )
            }

            Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "Exercício 1",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_5",
                    imagemRes = R.drawable.play,
                    thumbnailid = "mtgUuAMzBfY"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "Fill e Stroke",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_6",
                    imagemRes = R.drawable.play,
                    thumbnailid = "f5yU6toX_ds"
                )
            }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "Exercício 2",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_7",
                    imagemRes = R.drawable.play,
                    thumbnailid = "W8FoSm7rdO4"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "strokeWheight, noFill e noStroke",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_8",
                    imagemRes = R.drawable.play,
                    thumbnailid = "4bC1ywtaABs"
                )
            }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "Exercício 3",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_9",
                    imagemRes = R.drawable.play,
                    thumbnailid = "yi5ivR4iQDI"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "Line e Point",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_10",
                    imagemRes = R.drawable.play,
                    thumbnailid = "kyE3rNk0Htk"
                )
            }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "Quad e Triangle",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_11",
                    imagemRes = R.drawable.play,
                    thumbnailid = "YtvHAqq4ywo"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "Exercício 4",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_12",
                    imagemRes = R.drawable.play,
                    thumbnailid = "imcOIwE-qXY"
                )
            }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "Exercício 5",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_13",
                    imagemRes = R.drawable.play,
                    thumbnailid = "sEcHzCbO780"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "Rect e Square",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_14",
                    imagemRes = R.drawable.play,
                    thumbnailid = "AeGPr2a2hSE"
                )
            }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "Exercício 6",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_15",
                    imagemRes = R.drawable.play,
                    thumbnailid = "Xhrm262OkQg"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Aulas(
                    legenda = "Exercício 7",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_16",
                    imagemRes = R.drawable.play,
                    thumbnailid = "zdf_XM6SZbM"
                )
            }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                Aulas(
                    legenda = "Arc do P5.js",
                    cor_cima = colorResource(R.color.fundo),
                    cor_baixo = colorResource(R.color.modulo_1),
                    navController = navController,
                    destino = "modulo1_17",
                    imagemRes = R.drawable.play,
                    thumbnailid = "c-eUGQ3HmYA"
                )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))

            }
        }
        }
    }
}