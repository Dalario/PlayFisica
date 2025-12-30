package br.com.dalario.playfisica.Componentes

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify
import coil.compose.AsyncImage

@Composable
fun Conteudos(
    navController: NavController,
    videoId: String,
    titulo: String,
    cor_modulo: Color,
    descricao: String,
    destino_material: String,
    exercicioId: String
) {
    Box(
        modifier = Modifier.fillMaxSize().padding().background(color = Color.White)
    ) {
        Image(
            painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo tela",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize().statusBarsPadding()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp),
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
            ) {
                YoutubeVideo(
                    videoId = videoId,
                    modifier = Modifier.fillMaxSize(),
                )
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(440.dp)
                    .padding(top = 10.dp),
                colors = CardDefaults.cardColors(cor_modulo)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize().border(2.dp, color = Color.DarkGray)
                        .padding(start = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.Center,

                        ) {
                        Text(
                            titulo,
                            fontSize = 30.sp,
                            color = colorResource(R.color.white),
                            fontWeight = FontWeight.Bold,
                            fontFamily = Piexelify,
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp),
                    ){
                        Text(text = descricao,
                            textAlign = TextAlign.Justify,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 23.sp,
                            modifier = Modifier.verticalScroll(rememberScrollState())
                        )
                    }
                }


            }

            if(titulo.startsWith("Exercício")){
                exerciciovizu(exercicioId = exercicioId, cor_modulo = cor_modulo);
            }
            else {
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .height(70.dp)
                        .padding(top = 10.dp),
                    colors = CardDefaults.cardColors(cor_modulo),
                    border = BorderStroke(2.dp, Color.DarkGray),
                    onClick = { navController.navigate(destino_material) }
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            "Ver material",
                            fontSize = 50.sp, color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Piexelify,
                        )
                    }

                }
            }

        }

    }
}

@Composable
fun exerciciovizu(
    exercicioId: String,
    cor_modulo: Color,
){

    val context = LocalContext.current

    Card(modifier = Modifier.fillMaxWidth()
        .height(70.dp)
        .padding(top = 10.dp),
        colors = CardDefaults.cardColors(cor_modulo),
        border = BorderStroke(2.dp, Color.DarkGray),
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://editor.p5js.org/MisaelGo/sketches/$exercicioId"))
            context.startActivity(intent)

        }
    ){
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text("Exercício",
                fontSize = 50.sp,color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = Piexelify,)
        }

    }
}