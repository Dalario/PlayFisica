package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_11Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "YtvHAqq4ywo",
        titulo= "Quad e Triangle",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O triangle serve para desenhar um triângulo. Para isso, precisamos indicar os três pontos que formam o triângulo. É como ligar três pontinhos na tela e o computador desenha as linhas que unem esses pontos, formando o triângulo. Podemos escolher a cor do triângulo e a espessura das linhas para deixar o desenho mais bonito. Triângulos aparecem em muitos lugares, como na forma de telhados, bandeiras ou flechas.\n" +
                "\n" +
                "O quad serve para desenhar um quadrilátero, que é uma figura com quatro lados. Para usar o quad, precisamos indicar os quatro pontos que formam a figura. Depois, o computador liga esses pontos, formando o quadrado, retângulo ou qualquer outro quadrilátero que quisermos. Assim como o triângulo, podemos mudar a cor de dentro da figura ou a cor e a espessura das bordas.\n" +
                "\n" +
                "Esses comandos são muito divertidos porque podemos criar formas diferentes e montar desenhos maiores. Por exemplo, podemos desenhar casas usando quad para as paredes e triangle para o telhado. Eles ajudam a transformar ideias simples em desenhos coloridos e legais na tela!\n" ,
        destino_material = "material1_11",
        exercicioId = ""
    )
}