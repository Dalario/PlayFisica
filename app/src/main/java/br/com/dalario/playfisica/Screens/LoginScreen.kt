package br.com.dalario.playfisica.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.dalario.playfisica.R
import br.com.dalario.playfisica.ui.theme.Piexelify
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.firestore.FirebaseFirestore

@Composable
fun LoginScreen (modifier: Modifier = Modifier, navController: NavController) {
    val auth= FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var corUn by remember { mutableStateOf(value = R.color.white)}
    var corFo by remember { mutableStateOf(value = R.color.azul_logo)}
    var mensagemErro by remember { mutableStateOf("") }
    var cormensagem by remember { mutableStateOf(Color.Red) }
    Box(modifier= Modifier.fillMaxSize()

    ){
        Image(
            painterResource(R.drawable.fundo_estrelas),
            contentDescription = "Fundo tela",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.padding(vertical = 60.dp))
            Text(
                "PlayFísica",
                fontWeight = FontWeight.Bold,
                fontFamily = Piexelify,
                fontSize = 60.sp,
                color = colorResource(R.color.white),
                modifier = Modifier.border(
                    2.dp,
                    color = Color.DarkGray, shape = RoundedCornerShape(10.dp),
                ).background(
                    colorResource(R.color.azul_logo),
                    shape = RoundedCornerShape(10.dp)
                ).padding(horizontal = 10.dp)
            )
            Spacer(modifier = Modifier.padding(vertical = 30.dp))

            Text(
                "Login",fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,fontFamily = Piexelify
            )
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            Text(mensagemErro, color = cormensagem)
            Spacer(modifier = Modifier.padding(vertical = 2.dp))


            OutlinedTextField(
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                shape = RoundedCornerShape(10.dp),
                value = email,
                onValueChange = {it -> email = it},
                label = {Text("Insira o e-mail")},
                placeholder = {Text("@gmail")},
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).height(60.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedLabelColor = colorResource(R.color.white),
                    focusedBorderColor = colorResource(corFo),
                    unfocusedBorderColor =colorResource( corUn),
                    unfocusedLabelColor = colorResource(R.color.white)
                )
            )
            Spacer(modifier = Modifier.padding(vertical = 10.dp))
            OutlinedTextField(
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                shape = RoundedCornerShape(10.dp),
                value = senha,
                onValueChange = {it -> senha = it},
                label = {Text("Insira a senha")},
                placeholder = {Text("Senha")},
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).height(60.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedLabelColor = colorResource(R.color.white),
                    focusedBorderColor = colorResource(corFo),
                    unfocusedBorderColor = colorResource(corUn),
                    unfocusedLabelColor = colorResource(R.color.white),
                )
            )

            Button(modifier = Modifier.fillMaxWidth()
                .padding(vertical = 30.dp, horizontal = 80.dp)
                .height(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.azul_logo)),

                onClick = {
                    if(email.isEmpty()){
                        mensagemErro = "*Insira o email!*"
                    }
                    else if(senha.isEmpty()){
                        mensagemErro = "*Insira a sua senha!*"
                    }

                    else{
                        mensagemErro = ""
                        auth.signInWithEmailAndPassword(email, senha).addOnCompleteListener {
                            login->if(login.isSuccessful){
                            mensagemErro= "Sucessoa ao fazer login!"
                            cormensagem = Color.Green
                            navController.navigate(route = "home")
                        }
                        }.addOnFailureListener {
                            exception ->  val mesagemErro1 = when(exception) {
                            is FirebaseAuthUserCollisionException -> "Esta conta já foi cadastrada!"
                            is FirebaseNetworkException -> "Sem conexão com a internet!"
                            else -> "*Senha ou e-mail incorretos*"
                        }
                            corUn = R.color.vermelho
                            cormensagem = Color.Red
                            mensagemErro = mesagemErro1
                        }
                    }


            }) {
                Text("Entrar", fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White, fontFamily = Piexelify)
            }

            Button(modifier = Modifier.fillMaxWidth()
                .padding(vertical = 0.dp, horizontal = 80.dp)
                .height(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.azul_logo)),

                onClick = {
                navController.navigate(route = "cadastro")
            }) {
                Text("Cadastrar-se", fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontFamily =  Piexelify)
            }

        }
    }
}