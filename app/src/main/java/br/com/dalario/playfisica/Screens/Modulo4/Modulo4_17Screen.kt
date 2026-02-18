package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_17Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "037co_TGc7A",
        titulo= "KeyIsPressed, Key e KeyCode",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Abra as portas para o controle total usando o teclado nas suas simulações de física!\n" +
                "A variável keyIsPressed funciona como um sensor que avisa se alguma tecla está apertada.\n" +
                "Com o key, você identifica letras específicas, e com o keyCode, comandos como as setas.\n" +
                "É a ferramenta perfeita para pilotar robôs ou mudar variáveis sem precisar usar o mouse.\n" +
                "Transforme o seu teclado em um verdadeiro painel de controle para os seus experimentos!\n" ,
        destino_material = "material4_17",
        exercicioId = ""
    )
}