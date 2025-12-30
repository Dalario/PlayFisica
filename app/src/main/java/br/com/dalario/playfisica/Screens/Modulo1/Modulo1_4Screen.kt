package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_4Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "kMvgZRXhzw8",
        titulo= "Comandos Circle e Ellipse",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="No vídeo, aprendemos sobre coordenadas cartesianas e como elas se aplicam na programação. No plano cartesiano, o eixo X representa as abscissas e o eixo Y as ordenadas, com a origem em (0,0). No computador, a diferença é que o eixo Y cresce para baixo. A unidade de medida é o pixel, e todos os pontos na tela são definidos por coordenadas (X, Y).\n" +
                "\n" +
                "O comando circle desenha círculos na tela e possui três parâmetros: a coordenada X do centro, a coordenada Y do centro e o diâmetro em pixels. Já o comando ellipse desenha elipses e possui quatro parâmetros: X do centro, Y do centro, largura e altura. Para desenhar um círculo usando ellipse, basta definir a largura igual à altura.\n" +
                "\n" +
                "No código de um jogo, a função setup cria a tela com createCanvas e define o ambiente inicial, enquanto a função draw atualiza o cenário, pintando o fundo com background e desenhando os elementos com circle e ellipse. Como não há movimentos, tudo aparece estático.\n" ,
        destino_material = "material1_4",
        exercicioId = ""
    )
}
