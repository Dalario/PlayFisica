package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_14Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "aZHVYb0y4dU",
        titulo= "Mouse Wheel/IsPressed",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Descubra como usar a rodinha do mouse ou gestos de deslize para controlar o zoom.\n" +
                "Com o mouseWheel(), você pode aumentar ou diminuir o tamanho dos objetos na tela.\n" +
                "A variável mouseIsPressed avisa se o dedo continua apertado para manter uma força ligada.\n" +
                "É perfeito para simular jatos de água ou campos magnéticos que precisam de tempo para agir.\n" +
                "Crie experiências profundas onde cada detalhe do seu toque muda o resultado da física!\n" ,
        destino_material = "material4_14",
        exercicioId = ""
    )
}