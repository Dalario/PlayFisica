package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_16Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "w5p92ZXAk7E",
        titulo= "Request/Exit PointerLock",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Transforme o seu projeto em um jogo profissional escondendo e travando o cursor na tela.\n" +
                "Com o requestPointerLock(), o mouse fica preso no canvas para movimentos sem limites.\n" +
                "Isso permite girar câmeras ou controlar robôs sem que a seta escape pelas bordas do app.\n" +
                "Para voltar ao normal, basta usar o exitPointerLock() e o cursor reaparece na hora.\n" +
                "É o segredo dos grandes simuladores para garantir que você tenha foco total na missão!\n" ,
        destino_material = "material4_16",
        exercicioId = ""
    )
}