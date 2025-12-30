package br.com.dalario.playfisica.Screens


import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore


@Composable
fun NomeUsuario() {
    var nome by remember { mutableStateOf("Carregando...") }
    val db = FirebaseFirestore.getInstance()
    val usuarioAtual = FirebaseAuth.getInstance().currentUser

    androidx.compose.runtime.LaunchedEffect(Unit) {
        if (usuarioAtual != null) {
            db.collection("Usuarios")
                .document(usuarioAtual.uid)
                .get()
                .addOnSuccessListener { documento ->
                    nome = documento.getString("nome") ?: "Sem nome"
                }
                .addOnFailureListener {
                    nome = "Erro ao carregar"
                }
        } else {
            nome = "Usuário não logado"
        }
    }

    Text(
        nome,
        fontWeight = FontWeight.Bold,
        fontFamily = Piexelify,
        fontSize = 30.sp,
        color = colorResource(R.color.white),
        modifier = Modifier.border(
            2.dp,
            color = Color.DarkGray, shape = RoundedCornerShape(10.dp),
            ).background(
            colorResource(R.color.azul_logo),
            shape = RoundedCornerShape(10.dp)
            ).padding(horizontal = 10.dp)
    )
}

@Composable
fun HomeScreen(navController: NavController) {

    Box(modifier = Modifier
        .fillMaxSize()
    ){

        Image(
            painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo tela",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillHeight
        )


        Column(modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .statusBarsPadding(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Bem-vindo",
                        color = colorResource(R.color.azul_logo),
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Piexelify,
                    )
                    NomeUsuario()
                }
                Icon(
                    painterResource(R.drawable.molecula),
                    contentDescription = "Molecula",
                    modifier = Modifier
                        .size(90.dp)
                        .weight(1f),
                    tint = Color.White
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.quiz)),
                border = BorderStroke(1.dp,Color.White),
                onClick = {navController.navigate("quizzes")}
            ){
                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Quizzes",
                        fontSize = 50.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Icon(
                        painterResource(R.drawable.quiz3),
                        contentDescription = "Quizes",
                        tint = colorResource(R.color.white),
                        modifier = Modifier.size(60.dp),
                    )

                }
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.verde_molecula)),
                border = BorderStroke(1.dp,Color.White)
            ){
                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Ranking",
                        fontSize = 50.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Icon(
                        painterResource(R.drawable.ranking),
                        contentDescription = "Quizes",
                        tint = colorResource(R.color.white),
                        modifier = Modifier.size(60.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 10.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.vermelho_molecula)),
                border = BorderStroke(1.dp,Color.White)
            ){
                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Desafios",
                        fontSize = 50.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Icon(
                        painterResource(R.drawable.desafios),
                        contentDescription = "Quizes",
                        tint = colorResource(R.color.white),
                        modifier = Modifier.size(60.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 10.dp))
            Card(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.laranja_molecula)),
                border = BorderStroke(1.dp,Color.White)
            ){
                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Medalhas",
                        fontSize = 50.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Icon(
                        painterResource(R.drawable.medalhas),
                        contentDescription = "Quizes",
                        tint = colorResource(R.color.white),
                        modifier = Modifier.size(60.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 10.dp))
            Card(
                modifier = Modifier
                    .height(190.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF3949AB)),
                border = BorderStroke(1.dp,Color.White),
                onClick = {navController.navigate("modulos")}
            ){
                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Módulos",
                        fontSize = 50.sp,
                        fontFamily = Piexelify,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Icon(
                        painterResource(R.drawable.modulos2),
                        contentDescription = "Quizes",
                        tint = colorResource(R.color.white),
                        modifier = Modifier.size(60.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))

        }

    }
}