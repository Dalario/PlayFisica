package br.com.dalario.playfisica.Screens.Modulo4

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
fun Modulo4_Screen(navController: NavController){

    Box(modifier = Modifier.fillMaxSize().background(color = colorResource(R.color.fundo))){

        Image(
            painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo tela",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )


        Column(
            modifier = Modifier.fillMaxSize().statusBarsPadding(),
            verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    "Aulas Módulo 4",
                    fontWeight = FontWeight.Bold,
                    fontFamily = Piexelify,
                    fontSize = 45.sp,
                    color = colorResource(R.color.white),
                    modifier = Modifier.border(
                        2.dp,
                        color = Color.White, shape = RoundedCornerShape(10.dp),
                    ).background(
                        colorResource(R.color.modulo_4),
                        shape = RoundedCornerShape(10.dp)
                    ).padding(horizontal = 10.dp)
                )
            }
            Column(modifier = Modifier.fillMaxSize().verticalScroll(state = rememberScrollState())) {
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "MouseX e MouseY",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_1",
                        imagemRes = R.drawable.play,
                        thumbnailid = "JbxS5hvTsmo"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Aplicação MouseX e MouseY",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_2",
                        imagemRes = R.drawable.play,
                        thumbnailid = "B0VSgCvfVu4"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "PmouseX e PmouseY",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_3",
                        imagemRes = R.drawable.play,
                        thumbnailid = "-KutcUpVjyo"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Interações com o mouse",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_4",
                        imagemRes = R.drawable.play,
                        thumbnailid = "-y72Y8kZiSw"
                    )
                }

                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Comando Random",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_5",
                        imagemRes = R.drawable.play,
                        thumbnailid = "av28aDGlpfU"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercício 23",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_6",
                        imagemRes = R.drawable.play,
                        thumbnailid = "aI5vyqCb44I",
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Mouse e Double/Clicked",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_7",
                        imagemRes = R.drawable.play,
                        thumbnailid = "PwVHEquhr7E"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercício 24",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_8",
                        imagemRes = R.drawable.play,
                        thumbnailid = "kR9OdfZREuc"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Moved X e Y",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_9",
                        imagemRes = R.drawable.play,
                        thumbnailid = "kwynRNl_0ys"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Mouse Pressed/Realeased",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_10",
                        imagemRes = R.drawable.play,
                        thumbnailid = "vUDOojeVk6Y"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Exercício 25",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_11",
                        imagemRes = R.drawable.play,
                        thumbnailid = "IeZLSrITvXk"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Mouse Dragged/Moved",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_12",
                        imagemRes = R.drawable.play,
                        thumbnailid = "lmW8HhCUxEw"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Exercício 26",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_13",
                        imagemRes = R.drawable.play,
                        thumbnailid = "jTPFhsOrP3s"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Mouse Wheel/IsPressed",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_14",
                        imagemRes = R.drawable.play,
                        thumbnailid = "aZHVYb0y4dU"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "Exercício 27",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_15",
                        imagemRes = R.drawable.play,
                        thumbnailid = "G7HKUtzzUfQ"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Request/Exit PointerLock",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_16",
                        imagemRes = R.drawable.play,
                        thumbnailid = "w5p92ZXAk7E"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "KeyIsPressed, Key e KeyCode",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_17",
                        imagemRes = R.drawable.play,
                        thumbnailid = "037co_TGc7A"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercício 28",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_18",
                        imagemRes = R.drawable.play,
                        thumbnailid = "mDo54lDS_Kc"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "KeyPressed e KeyIsDown",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_19",
                        imagemRes = R.drawable.play,
                        thumbnailid = "wcQhPKlsJmE"
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Aulas(
                        legenda = "Exercício 29",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_20",
                        imagemRes = R.drawable.play,
                        thumbnailid = "DpNoDfgbQNc"
                    )
                }
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp)) {
                    Aulas(
                        legenda = "KeyTyped e KeyReleased",
                        cor_cima = colorResource(R.color.fundo),
                        cor_baixo = colorResource(R.color.modulo_4),
                        navController = navController,
                        destino = "modulo4_21",
                        imagemRes = R.drawable.play,
                        thumbnailid = "DFIe76rjLF4"
                    )
                }
            }
        }
    }
}
