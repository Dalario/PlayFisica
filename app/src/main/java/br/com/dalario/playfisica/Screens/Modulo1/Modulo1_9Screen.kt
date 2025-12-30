package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_9Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "yi5ivR4iQDI",
        titulo= "Exercício 3",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O vídeo mostra como desenhar uma imagem complexa no P5.js, usando apenas formas básicas como círculos e elipses, organizando o desenho por camadas e cores.\n" +
                "\n" +
                "\uD83C\uDFAF O que foi feito\n" +
                "\n" +
                "Criação do desenho por etapas, sempre desenhando uma parte, acelerando o vídeo e depois explicando.\n" +
                "\n" +
                "A construção começou pelo que está mais ao fundo (fundo da imagem e formas grandes).\n" +
                "\n" +
                "Foram usadas muitas elipses e círculos sobrepostos, sem contorno (noStroke()), para formar cada parte do desenho.\n" +
                "\n" +
                "Foi aplicada a ideia de transparência (fill(r, g, b, alpha)):\n" +
                "\n" +
                "Elementos de trás → mais transparentes.\n" +
                "\n" +
                "Elementos da frente → cor mais forte (menos transparência).\n" +
                "\n" +
                "Cores foram adicionadas por áreas: primeiro os tons neutros, depois vermelho, verde e amarelo.\n" +
                "\n" +
                "\uD83D\uDCA1 Dicas que o vídeo ensina na prática\n" +
                "\n" +
                "✔ Desenhe de trás para frente: plano de fundo → formas grandes → detalhes.\n" +
                "✔ Organize o código por partes, para cada cor ou região desenhada.\n" +
                "✔ Use sobreposição e transparência para criar profundidade e volume.\n" +
                "✔ Retire o contorno com noStroke() quando quiser um visual mais limpo.\n" +
                "✔ Tenha paciência: desenhos com muitas formas precisam de testes e ajustes.\n" ,
        destino_material = "",
        exercicioId = "e4vmAV-Ev"
    )
}