package br.com.dalario.playfisica.Componentes


import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify
import androidx.navigation.NavController
import coil.compose.AsyncImage


@Composable
fun Aulas(
    modifier: Modifier = Modifier,
    legenda: String,
    cor_cima: Color,
    cor_baixo: Color,
    navController: NavController,
    destino: String,
    thumbnailid: String,
    @DrawableRes imagemRes: Int,
) {
    Card(
        border = BorderStroke(1.dp, color = Color.White),
        elevation = CardDefaults.cardElevation(10.dp),
        modifier = Modifier
            .width(160.dp)
            .height(180.dp),
        onClick = { navController.navigate(route = destino) }
    ) {
        Column(modifier= Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(color = cor_cima),
                contentAlignment = Alignment.Center
            ) {
                Image(painterResource(R.drawable.fundo_estrelas),
                    contentDescription = "Fundo tela",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop )

                ThumbnailYoutube(videoId = thumbnailid)
                Icon(
                    painterResource(imagemRes),
                    contentDescription = "Icone da aula",
                    modifier = Modifier.padding(50.dp),
                    tint = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = cor_baixo)
                    .border(border = BorderStroke(1.dp, colorResource(R.color.white)))
                    .weight(1f)
                    .padding(10.dp)
            ){
                Text(
                    legenda,
                    color = Color.White,
                    fontFamily = Piexelify,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
@Composable
fun ThumbnailYoutube(videoId: String){
    val thumbnailUrl = "https://img.youtube.com/vi/$videoId/maxresdefault.jpg"

    AsyncImage(
        model = thumbnailUrl,
        contentDescription = "Thumnail",
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp),
        contentScale = ContentScale.Crop
    )
}