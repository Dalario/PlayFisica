package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_21Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "DFIe76rjLF4",
        titulo= "KeyTyped e KeyReleased",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Aprenda a capturar cada letrinha digitada e o momento exato em que você solta uma tecla.\n" +
                "\n" +
                "O keyTyped() é excelente para registrar nomes ou valores sem repetir a ação por engano.\n" +
                "\n" +
                "Já o keyReleased() avisa o código para parar um motor ou desligar uma força na hora certa.\n" +
                "\n" +
                "Com esses comandos, você ganha o controle total sobre o início e o fim de cada movimento.\n" ,
        destino_material = "material4_21",
        exercicioId = ""
    )
}