package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_19Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "wcQhPKlsJmE",
        titulo= "KeyPressed e KeyIsDown",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Entenda a diferença entre um toque único e a pressão contínua das teclas no seu código.\n" +
                "O keyPressed() é um evento que acontece uma só vez, ideal para disparar um tiro ou pular.\n" +
                "Já o keyIsDown() verifica se você continua segurando a tecla para um movimento suave.\n" ,
        destino_material = "material4_19",
        exercicioId = ""
    )
}