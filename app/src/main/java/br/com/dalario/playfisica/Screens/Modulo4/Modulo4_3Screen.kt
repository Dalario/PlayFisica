package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_3Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "-KutcUpVjyo",
        titulo= "PmouseX e PmouseY",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Neste vídeo, exploramos as variáveis pmouseX e pmouseY do P5.js. Elas são fundamentais para entender a trajetória e o comportamento dinâmico de um objeto.\n" +
                "\n" +
                "O que elas fazem?\n" +
                "pmouseX (Previous X): Armazena a posição horizontal do mouse no quadro (frame) anterior.\n" +
                "\n" +
                "pmouseY (Previous Y): Armazena a posição vertical do mouse no quadro (frame) anterior.\n" ,
        destino_material = "material4_3",
        exercicioId = ""
    )
}