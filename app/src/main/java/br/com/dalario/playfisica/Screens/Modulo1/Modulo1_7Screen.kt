package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_7Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "W8FoSm7rdO4",
        titulo= "Exercício 2",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O vídeo ensina a desenhar um ursinho de pelúcia no P5.js, usando formas básicas como circle(), ellipse(), fill() e stroke().\n" +
                "A construção segue uma lógica de camadas:\n" +
                "\n" +
                "Plano de fundo (background).\n" +
                "\n" +
                "Formas que ficam atrás, como o ombro e as orelhas.\n" +
                "\n" +
                "Forma principal, a cabeça.\n" +
                "\n" +
                "Detalhes menores, como olhos, focinho e nariz.\n" +
                "\n" +
                "Aplicação de cores com fill() e contornos com stroke().\n" +
                "\n" +
                "\uD83D\uDCA1 Dicas importantes\n" +
                "\n" +
                "Sempre comece desenhando de trás para frente (fundo → formas grandes → detalhes).\n" +
                "\n" +
                "Use coordenadas centrais para facilitar o posicionamento (createCanvas(800, 600) → centro é (400, 300)).\n" +
                "\n" +
                "Agrupe os comandos no código por partes do corpo para manter tudo organizado.\n" +
                "\n" +
                "Testar valores, ajustar e visualizar faz parte do processo.\n" +
                "\n" +
                "Cores no fill() podem ser cinza com um só valor fill(150) ou RGB: fill(r, g, b).\n" ,
        destino_material = "",
        exercicioId = "cQRKHBii6"
    )
}