package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_16Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "dTRrArtw6-A",
        titulo= "Exercicio 13",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="\uD83D\uDCA5 Exercício: Canhão e Lançamento Oblíquo!\n" +
                "Neste desafio, você deve criar um cenário simples (sol, chão, cacto e canhão) e programar a bola de canhão realizando um lançamento oblíquo. Isso significa aplicar:\n" +
                "\n" +
                "MRU no eixo X (movimento horizontal)\n" +
                "\n" +
                "Lançamento vertical no eixo Y (velocidade inicial + ação da gravidade)\n" +
                "\n" +
                "A bolinha deve sair de dentro do canhão, seguir a trajetória curva e tocar o chão no ponto correto. Para isso, você usará variáveis de posição, velocidade e gravidade, atualizando tudo no draw().\n" ,
        destino_material = "material2_5",
        exercicioId = "jBFxkYy8P",

        )
}