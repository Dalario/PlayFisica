package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_1Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "JbxS5hvTsmo",
        titulo= "MouseX e MouseY",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="\uD83D\uDCCD MouseX e MouseY no P5.js\n" +
                "No P5.js, as variáveis mouseX e mouseY rastreiam constantemente a posição do cursor dentro do canvas. Elas são a base para criar qualquer interatividade visual.\n" +
                "\n" +
                "mouseX: Captura a coordenada horizontal (distância da borda esquerda).\n" +
                "\n" +
                "mouseY: Captura a coordenada vertical (distância da borda superior).\n" +
                "\n"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ,
        destino_material = "material4_1",
        exercicioId = ""
    )
}