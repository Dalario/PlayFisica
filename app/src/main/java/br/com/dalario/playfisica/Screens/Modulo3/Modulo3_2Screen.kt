package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_2Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "UNPPgKmpFnA",
        titulo= "Exercício 14",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="\uD83D\uDE97\uD83D\uDCA5 Exercício – Lei da Inércia na prática!\n" +
                "Neste desafio, você deve criar um cenário com um carro em movimento, um boneco dentro dele e um obstáculo na estrada. Quando o carro bate e para de repente, o boneco continua em movimento — aplicando a Primeira Lei de Newton: um corpo tende a manter seu estado de movimento ou repouso, a menos que uma força externa atue sobre ele.\n" +
                "\n" +
                "Você irá programar:\n" +
                "\n" +
                "O movimento do carro em MRU (movimento retilíneo uniforme);\n" +
                "\n" +
                "O boneco sendo lançado para frente em lançamento horizontal (MRU + queda livre) após a batida;\n" +
                "\n" +
                "O cenário com estrada, montanhas, sol e obstáculos.\n" ,
        destino_material = "",
        exercicioId = "BttcVrwhh"
    )
}