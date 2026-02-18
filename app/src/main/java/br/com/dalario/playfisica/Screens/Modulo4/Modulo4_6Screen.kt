package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_6Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "aI5vyqCb44I",
        titulo= "Exercício 23",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="\uD83D\uDE80 MISSÃO CIENTÍFICA: OLHOS ATENTOS!\n" +
                "Para virar um mestre da física, você precisa de super atenção! \n" +
                "Assista ao vídeo como se fosse um manual de astronauta e não \n" +
                "deixe nenhum detalhe escapar. \n" +
                "Se fizer o exercício direitinho e com calma, seu código vai \n" +
                "funcionar como mágica. Lembre-se: grandes inventores prestam \n" +
                "muita atenção antes de construir suas máquinas. \n" +
                "Boa sorte na sua missão!\n",
        destino_material = "",
        exercicioId = "zgvFkpKAv"
    )
}