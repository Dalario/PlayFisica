package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_8Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "TB9p5pHpUJs",
        titulo= "Exercício 16",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Neste vídeo, você vai colocar em prática o que aprendeu sobre força de arrasto. A proposta é comparar o movimento de dois objetos caindo:\n" +
                "\n" +
                "Um objeto em queda livre, sem resistência do ar;\n" +
                "\n" +
                "Outro com paraquedas, sofrendo força peso e força de arrasto.\n" +
                "\n" +
                "\uD83D\uDCA1 Antes de iniciar o exercício, o professor faz uma correção importante:\n" +
                "A forma simplificada de reduzir a velocidade multiplicando por um valor menor que 1 não representa corretamente a força de arrasto. Isso porque, na realidade, a força de arrasto muda a cada instante, à medida que a velocidade muda. Por isso, no código, a força deve ser recalculada dentro da função draw, frame a frame.\n" +
                "\n" +
                "\uD83D\uDEE0\uFE0F O que você deve fazer no exercício:\n" +
                "✔\uFE0F Desenhar o cenário (céu, nuvens, montanhas, chão);\n" +
                "✔\uFE0F Criar dois objetos (caixas):\n" +
                " • Um caindo apenas com a força peso;\n" +
                " • Outro com paraquedas, sofrendo peso e força de arrasto;\n" +
                "✔\uFE0F Aplicar a fórmula da força resultante e observar que, com o paraquedas, o objeto acelera no início e depois atinge velocidade constante (velocidade terminal).\n" ,
        destino_material = "",
        exercicioId = "myZI5hkbW"
    )
}