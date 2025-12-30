package br.com.dalario.playfisica.Componentes

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify

@Composable
fun QuizScreen(modifier: Modifier = Modifier, navController: NavController) {
    var statecolor by remember{ mutableStateOf(value = R.color.correto) }


    Box(modifier = Modifier.fillMaxSize()){

    Image(
        painterResource(R.drawable.fundo_estrelas),
        contentScale = ContentScale.Crop,
        contentDescription = "Fundo de estrelas",
        modifier = Modifier.fillMaxSize()
    )
        Column(modifier = Modifier.fillMaxSize().statusBarsPadding()) {

            Row (modifier.fillMaxWidth().height(50.dp), horizontalArrangement = Arrangement.SpaceAround, ){

                Icon(
                    Icons.Default.KeyboardArrowLeft,
                    contentDescription = "voltar",
                    modifier = Modifier.size(50.dp),
                    tint = colorResource(R.color.white),
                )

                Text(
                    "1 de 15",
                    fontSize = 40.sp,
                    color = Color.White,
                   //fontFamily = Piexelify
                )

                Icon(
                    Icons.Default.KeyboardArrowRight,
                    contentDescription = "voltar",
                    modifier = Modifier.size(50.dp),
                    tint = colorResource(R.color.white),
                )
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp).padding(top = 5.dp)
                    .height(260.dp)
                    .border(1.dp, Color.White, shape = RoundedCornerShape(10.dp)),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz))
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(10.dp),
                    //verticalArrangement = Arrangement.S,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                        Text(
                            "Um objeto parado tende a permanecer parado, e um objeto em movimento tende a continuar em movimento, a menos que uma força externa atue sobre ele.\n\nIsso descreve: ",
                            fontSize = 25.sp,
                            color = Color.White,
                            textAlign = TextAlign.Justify
                        )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp)
                    .padding(top = 5.dp, bottom = 15.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(top = 10.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.quiz)),
                border = BorderStroke(color = Color.White, width = 1.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier
                            .fillMaxHeight().padding(start = 20.dp)
                            .width(width = 90.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,

                    ) {
                        Text("A.", fontSize = 60.sp, color = Color.White)
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text("A força resultante", fontSize = 20.sp, color = Color.White)
                    }
                }
            }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(top = 10.dp),
                    colors = CardDefaults.cardColors(colorResource(R.color.quiz)),
                    border = BorderStroke(color = Color.White, width = 1.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier
                                .fillMaxHeight().padding(start = 20.dp)
                                .width(width = 90.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,

                            ) {
                            Text("B.", fontSize = 60.sp, color = Color.White)
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Text("A inércia", fontSize = 20.sp, color = Color.White)
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(top = 10.dp),
                    colors = CardDefaults.cardColors(colorResource(R.color.quiz)),
                    border = BorderStroke(color = Color.White, width = 1.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier
                                .fillMaxHeight().padding(start = 20.dp)
                                .width(width = 90.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,

                            ) {
                            Text("C.", fontSize = 60.sp, color = Color.White)
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Text("O atrito", fontSize = 20.sp, color = Color.White)
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(top = 10.dp),
                    colors = CardDefaults.cardColors(colorResource(R.color.quiz)),
                    border = BorderStroke(color = Color.White, width = 1.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier
                                .fillMaxHeight().padding(start = 20.dp)
                                .width(width = 90.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,

                            ) {
                            Text("D.", fontSize = 60.sp, color = Color.White)
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Text("A gravidade", fontSize = 20.sp, color = Color.White)
                        }
                    }
                }
        }

        }
    }
}