package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_7Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "PwVHEquhr7E",
        titulo= "Mouse e Double/Clicked",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Mouse e Double/Clicked\n" +
                "Aprenda a diferença entre um clique simples e o clique duplo no seu projeto.\n" +
                "Use as funções mouseClicked() e doubleClicked() para criar comandos especiais.\n" +
                "Evite que o app faça ações por engano ao controlar o tempo de cada toque.\n" +
                "É a ferramenta perfeita para abrir menus ou mudar cores de forma rápida e divertida.\n" +
                "Transforme a tela em um laboratório onde cada batida do dedo faz uma mágica diferente!\n" ,
        destino_material = "material4_7",
        exercicioId = ""
    )
}