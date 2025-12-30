package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_1Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "3Ld0IT9ii-4",
        titulo= "O que é P5.js?",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O p5.js é uma biblioteca que ajuda a transformar código em arte visual e interativa. Com ele, podemos desenhar, criar animações e até jogos, tudo dentro do navegador. É como se o JavaScript ganhasse superpoderes para trabalhar com formas, cores e movimentos de maneira fácil e divertida.\n" +
                "\n" +
                "Quando usamos o p5.js, escrevemos comandos que dizem o que deve aparecer na tela — como círculos, linhas ou retângulos — e o computador obedece. Cada linha de código é uma instrução, e o resultado é algo que podemos ver e mexer.\n" +
                "\n" +
                "A biblioteca foi criada para tornar a programação mais acessível a artistas, estudantes e curiosos. Por isso, a linguagem é simples, visual e cheia de possibilidades criativas.\n" +
                "\n" +
                "Aprender p5.js é como aprender a desenhar com código. Em vez de lápis e papel, usamos lógica e comandos. É uma forma diferente de criar arte e entender como o mundo digital funciona. \n" ,
        destino_material = "material1_1",
        exercicioId = ""
    )
}