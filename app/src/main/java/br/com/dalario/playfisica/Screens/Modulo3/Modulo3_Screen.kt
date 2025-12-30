package br.com.dalario.playfisica.Screens.Modulo3

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
fun Modulo3_Screen (navController: NavController) {
    Box(modifier = Modifier.fillMaxSize().background(color = colorResource(R.color.fundo))) {

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
                    "Aulas Módulo 3",
                    fontWeight = FontWeight.Bold,
                    fontFamily = Piexelify,
                    fontSize = 45.sp,
                    color = colorResource(R.color.white),
                    modifier = Modifier.border(
                        2.dp,
                        color = Color.White, shape = RoundedCornerShape(10.dp),
                    ).background(
                        colorResource(R.color.modulo_3),
                        shape = RoundedCornerShape(10.dp)
                    ).padding(horizontal = 10.dp)
                )
            }
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(state = rememberScrollState())
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "1° Lei de Newton",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_1",
                        imagemRes = R.drawable.play,
                        thumbnailid = "GT5JRtmZQ_U"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicio 14",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_2",
                        imagemRes = R.drawable.checklist,
                        thumbnailid = "UNPPgKmpFnA"
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "2° Lei de Newton",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_3",
                        imagemRes = R.drawable.play,
                        thumbnailid = "tIfvN0NnYMg"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercício 15",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_4",
                        imagemRes = R.drawable.play,
                        thumbnailid = "N7MFMdN2LWQ"
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "3° Lei de Newton",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_5",
                        imagemRes = R.drawable.play,
                        thumbnailid = "YYmVHl8cNuk"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Força de Atrito",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_6",
                        imagemRes = R.drawable.play,
                        thumbnailid = "oUxfT7Ri7q0"
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "Força de Arrasto",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_7",
                        imagemRes = R.drawable.play,
                        thumbnailid = "TCXg3PqnaG4"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicio 16",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_8",
                        imagemRes = R.drawable.play,
                        thumbnailid = "TB9p5pHpUJs"
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "Força de Tração e Elástica",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_9",
                        imagemRes = R.drawable.play,
                        thumbnailid = "UIeMNLA02PM"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicio 17",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_10",
                        imagemRes = R.drawable.play,
                        thumbnailid = "cXm2ZcC_qGo"
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "Exercicio 18",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_11",
                        imagemRes = R.drawable.play,
                        thumbnailid = "x1RCk37uvcQ"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Formas de Energia",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_12",
                        imagemRes = R.drawable.play,
                        thumbnailid = "1FsY61SGVoo"
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "Efeito Bounce",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_13",
                        imagemRes = R.drawable.play,
                        thumbnailid = "m7hHSarABFI"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercício 19",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_14",
                        imagemRes = R.drawable.play,
                        thumbnailid = "nRZnp1Mys1M"
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Aulas(
                        legenda = "Momento Linear",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_15",
                        imagemRes = R.drawable.play,
                        thumbnailid = "P9pfxZaJExI"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercício 20",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_3),
                        navController = navController,
                        destino = "modulo3_16",
                        imagemRes = R.drawable.play,
                        thumbnailid = "ELIcCJKCIZQ"
                    )
                }
            }
        }
    }
}