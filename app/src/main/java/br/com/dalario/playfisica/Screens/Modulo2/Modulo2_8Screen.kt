package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_8Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "W01xLl65P3c",
        titulo= "Exercicio 9",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O exercício consiste em reutilizar o cenário de uma aula anterior e adicionar dois novos elementos com movimento retilíneo uniformemente variado (MRUV):\n" +
                "\n" +
                "Um foguete subindo com aceleração constante (MRUV para cima).\n" +
                "\n" +
                "Três círculos de fumaça descendo com MRUV.\n" +
                "\n" +
                "\uD83D\uDE80 O que precisa ser feito\n" +
                "\n" +
                "Usar o mesmo cenário já criado anteriormente (céu, sol, mar, areia, árvore, pássaros etc.).\n" +
                "\n" +
                "Criar o foguete usando um retângulo e três triângulos.\n" +
                "\n" +
                "Criar a fumaça com três círculos posicionados abaixo do foguete.\n" +
                "\n" +
                "Fazer o foguete subir com aceleração (a velocidade aumenta enquanto sobe).\n" +
                "\n" +
                "Fazer a fumaça descer com aceleração diferente da do foguete.\n" +
                "\n" +
                "\uD83C\uDFAF Ideias importantes usadas no vídeo\n" +
                "\n" +
                "MRUV significa que a velocidade muda ao longo do tempo por causa da aceleração.\n" +
                "\n" +
                "Para o foguete subir, a posição em Y diminui com o passar do tempo.\n" +
                "\n" +
                "Para a fumaça descer, a posição em Y aumenta.\n" +
                "\n" +
                "A velocidade começa em zero e vai aumentando aos poucos por conta da aceleração.\n" +
                "\n" +
                "O movimento do foguete e da fumaça não é em linha reta constante como no MRU — agora existe variação de velocidade.\n" ,
        destino_material = "",
        exercicioId = "H07hr9xtm",

        )
}