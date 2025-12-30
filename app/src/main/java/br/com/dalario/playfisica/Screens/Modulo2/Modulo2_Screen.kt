package br.com.dalario.playfisica.Screens.Modulo2

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
fun Modulo2_Screen (navController: NavController) {
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
                    "Aulas Módulo 2",
                    fontWeight = FontWeight.Bold,
                    fontFamily = Piexelify,
                    fontSize = 45.sp,
                    color = colorResource(R.color.white),
                    modifier = Modifier.border(
                        2.dp,
                        color = Color.White, shape = RoundedCornerShape(10.dp),
                    ).background(
                        colorResource(R.color.modulo_2),
                        shape = RoundedCornerShape(10.dp)
                    ).padding(horizontal = 10.dp)
                )
            }
            Column(modifier = Modifier.fillMaxSize().verticalScroll(state = rememberScrollState())) {
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Variável e Atribuição",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_1",
                        imagemRes = R.drawable.play,
                        thumbnailid = "t2r3iS5aPlU"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Operações e o If",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_2",
                        imagemRes = R.drawable.play,
                        thumbnailid = "KCLq8rIOuDA"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Movimento Retilíneo Uniforme",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_3",
                        imagemRes = R.drawable.play,
                        thumbnailid = "U5pWI95cydM"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Mais Aplicações do MRU",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_4",
                        imagemRes = R.drawable.play,
                        thumbnailid = "qh-2ebjl5cw"
                    )
                }

                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Exercicío 8",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_5",
                        imagemRes = R.drawable.play,
                        thumbnailid = "dhf-9c3J9BM"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "MRU na Diagonal",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_6",
                        imagemRes = R.drawable.play,
                        thumbnailid = "14JftxNx5go",
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "MRU Variado",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_7",
                        imagemRes = R.drawable.play,
                        thumbnailid = "7hFHx1zRd4A"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicío 9",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_8",
                        imagemRes = R.drawable.play,
                        thumbnailid = "W01xLl65P3c"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Queda Livre",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_9",
                        imagemRes = R.drawable.play,
                        thumbnailid = "Hkta5bcReeE"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicío 10",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_10",
                        imagemRes = R.drawable.play,
                        thumbnailid = "FuQ3h0UJUIY"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Lançamento Vertical",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_11",
                        imagemRes = R.drawable.play,
                        thumbnailid = "lg0845LBNxQ"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicío 11",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_12",
                        imagemRes = R.drawable.play,
                        thumbnailid = "oWe4Zxh33HY"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Lançamento Horizontal",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_13",
                        imagemRes = R.drawable.play,
                        thumbnailid = "NcPOPo6e5vI"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicío 12",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_14",
                        imagemRes = R.drawable.play,
                        thumbnailid = "mDpqXtlOssU"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Lançamento Oblíquo",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_15",
                        imagemRes = R.drawable.play,
                        thumbnailid = "bSyuVhZHZ9w"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercicío 13",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_16",
                        imagemRes = R.drawable.play,
                        thumbnailid = "dTRrArtw6-A"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Estrutura If else",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_2),
                        navController = navController,
                        destino = "modulo2_17",
                        imagemRes = R.drawable.play,
                        thumbnailid = "t7nhtPJEKIs"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))

                }
            }
        }
    }
}