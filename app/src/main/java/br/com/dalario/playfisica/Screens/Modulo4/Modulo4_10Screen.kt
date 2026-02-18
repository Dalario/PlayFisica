package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_10Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "vUDOojeVk6Y",
        titulo= "Mouse Pressed/Realeased",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Aprenda a identificar o momento exato em que você encosta e quando tira o dedo da tela.\n" +
                "O mousePressed() avisa o código sobre o início de uma ação, como ligar um motor potente.\n" +
                "Já o mouseReleased() é o comando perfeito para soltar uma mola ou disparar um projétil.\n" +
                "Diferente de apenas clicar, aqui você controla o tempo total que o botão fica apertado.\n" +
                "Domine esses gatilhos para criar controles profissionais e precisos para os seus experimentos!\n" ,
        destino_material = "material4_10",
        exercicioId = ""
    )
}