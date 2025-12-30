package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_3Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "68PfSUKZ62U",
        titulo= "Comandos CreateCanvas e Backgroud do P5.js",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O comando createCanvas() é o responsável por criar a tela onde tudo será desenhado no p5.js. Ele possui dois parâmetros, que indicam a largura e a altura da tela, medidos em pixels, as menores unidades que formam as imagens digitais. É como se fosse o momento de construir o palco onde o jogo ou animação vai acontecer. Esse comando deve ser colocado dentro da function setup(), pois faz parte da preparação inicial do ambiente.\n" +
                "\n" +
                "Já o comando background() define a cor do fundo dessa tela. Ele usa até quatro parâmetros: vermelho, verde, azul e alfa (transparência). Cada cor vai de 0 a 255, formando o sistema RGB, que mistura tons para criar qualquer cor. O background() pode ser usado na function setup() ou na function draw(), mas normalmente aparece na draw, pois ela é executada várias vezes por segundo, repintando o fundo continuamente.\n" +
                "\n" +
                "Podemos imaginar assim: o createCanvas() constrói o palco e o background() coloca o cenário. Enquanto o setup prepara tudo, o draw mantém o movimento e atualiza o que acontece na tela. Juntos, esses comandos fazem o p5.js transformar código em um ambiente visual pronto para ganhar vida.\n" ,
        destino_material = "material1_3",
        exercicioId = ""
    )
}