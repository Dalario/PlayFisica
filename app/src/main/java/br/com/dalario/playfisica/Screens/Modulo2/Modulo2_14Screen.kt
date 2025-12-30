package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_14Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "mDpqXtlOssU",
        titulo= "Exercicio 12",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="Neste exercício, você deve desenhar o cenário de um tiro ao alvo (arco, flecha, alvo, chão, montanha, etc.) e programar o movimento da flecha aplicando o lançamento horizontal, que é a combinação de MRU no eixo X e queda livre no eixo Y.\n" +
                "A flecha deve sair do arco, seguir a trajetória curva e acertar o alvo. Você vai usar variáveis para posição, velocidade e gravidade, além de atualizar tudo no draw() para criar a animação.\n" ,
        destino_material = "",
        exercicioId = "nJiV92VlK",

        )
}