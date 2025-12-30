package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R


@Composable
fun Modulo1_17Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "c-eUGQ3HmYA",
        titulo= "Comando Arc",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O arc serve para desenhar partes de círculos, que chamamos de arcos. Diferente do círculo inteiro, ele desenha só um pedacinho da borda, como se fosse uma fatia de pizza.\n" +
                "\n" +
                "Para desenhar um arco, precisamos dizer onde ele vai ficar na tela (o centro), o tamanho dele e o ângulo que ele vai abrir. Podemos deixar o arco colorido por dentro, mudar a cor da borda e a espessura das linhas.\n" +
                "\n" +
                "Os arcos são muito legais para desenhar coisas curvas, como sorrisos, rodas de carrinho, sol ou até um guarda-chuva. Ele ajuda a criar formas diferentes sem precisar desenhar o círculo inteiro.\n" ,
        destino_material = "material1_17",
        exercicioId = ""
    )
}