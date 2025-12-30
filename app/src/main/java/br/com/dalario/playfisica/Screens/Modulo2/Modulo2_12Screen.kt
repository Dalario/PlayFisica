package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_12Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "oWe4Zxh33HY",
        titulo= "Exercicio 11",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O exercício reutiliza a mesma paisagem e o mesmo foguete do vídeo anterior. A única diferença é que agora o foguete sobe e depois desce, aplicando o conceito de lançamento vertical.\n" +
                "\n" +
                "\uD83D\uDE80 O que precisa ser feito\n" +
                "\n" +
                "Usar o mesmo cenário já construído: céu, sol, mar, areia, árvore, pássaros, etc.\n" +
                "\n" +
                "Usar o mesmo foguete feito com um retângulo e três triângulos.\n" +
                "\n" +
                "Aplicar no foguete o lançamento vertical para cima com desaceleração causada pela gravidade.\n" +
                "\n" +
                "Depois que a velocidade chega a zero no ponto mais alto, o foguete desce de volta, agora acelerado pela gravidade.\n" +
                "\n" +
                "Quando ele toca o solo, deve parar suavemente, como um pouso.\n" +
                "\n" +
                "\uD83D\uDCA1 Dicas aplicadas na lógica do movimento\n" +
                "\n" +
                "A velocidade não é constante, ela vai mudando ao longo do tempo.\n" +
                "\n" +
                "Na subida, a gravidade diminui a velocidade até parar.\n" +
                "\n" +
                "Na descida, a gravidade aumenta a velocidade para baixo.\n" +
                "\n" +
                "Quando o foguete estiver próximo do solo, a posição é travada para que ele pare no lugar certo, simulando o pouso.\n" ,
        destino_material = "",
        exercicioId = "k2X7GGO8_",

        )
}