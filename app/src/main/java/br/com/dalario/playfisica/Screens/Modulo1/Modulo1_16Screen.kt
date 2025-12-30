package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_16Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "AeGPr2a2hSE",
        titulo= "Rect e Square",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O rect serve para desenhar retângulos. Para isso, precisamos indicar onde o retângulo vai começar na tela, e depois dizer a largura e a altura dele. Assim, o computador desenha o retângulo na tela, e podemos escolher a cor de dentro, a cor da borda e a espessura das linhas. Retângulos aparecem em muitos lugares, como portas, janelas e quadros.\n" +
                "\n" +
                "O square serve para desenhar quadrados, que são um tipo especial de retângulo, onde todos os lados têm o mesmo tamanho. Ele é mais fácil de usar porque só precisamos dizer onde o quadrado começa e qual é o tamanho dos lados. Como os outros desenhos, podemos mudar a cor do quadrado, a cor da borda e a espessura das linhas para deixar o desenho mais bonito.\n" +
                "\n" +
                "Esses comandos são muito legais porque ajudam a criar figuras geométricas simples e montar desenhos maiores. Por exemplo, podemos desenhar uma casinha usando square para a parede principal e rect para a porta. Eles ajudam a transformar ideias simples em desenhos coloridos e divertidos na tela!\n" ,
        destino_material = "material1_16",
        exercicioId = ""
    )
}