package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_12Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "imcOIwE-qXY",
        titulo= "Exercício 4",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O vídeo mostra como desenhar uma paisagem simples no P5.js, usando apenas formas básicas e cores uniformes. A cena inclui céu, sol, mar, areia, árvore e passarinhos.\n" +
                "\n" +
                "\uD83C\uDFAF O que foi feito\n" +
                "\n" +
                "Tela criada com createCanvas(800, 600) e fundo azul claro com background().\n" +
                "\n" +
                "Contornos desativados com noStroke() para deixar os desenhos mais limpos.\n" +
                "\n" +
                "Sol desenhado com circle(x, y, tamanho) e cor amarela com fill().\n" +
                "\n" +
                "Passarinhos feitos com duas linhas em “V”, usando stroke() para reativar o contorno.\n" +
                "\n" +
                "Areia e mar construídos com retângulos (rect()), usando cores sólidas e leve transparência na areia.\n" +
                "\n" +
                "Tronco da árvore com retângulo marrom.\n" +
                "\n" +
                "Folhas feitas com vários círculos sobrepostos e cor verde com transparência para dar volume.\n" +
                "\n" +
                "\uD83D\uDCA1 Dicas importantes do vídeo\n" +
                "\n" +
                "✔ Desenhe do fundo para frente (background → formas grandes → detalhes).\n" +
                "✔ Use noStroke() e stroke(cor) sempre que alternar entre formas com ou sem contorno.\n" +
                "✔ Para cores com leve transparência, use fill(r, g, b, alpha).\n" +
                "✔ Mantenha simetria e organização usando coordenadas centrais.\n" +
                "✔ Não é necessário usar texto nem degradê, uma cor única funciona bem.\n" ,
        destino_material = "",
        exercicioId = "z3sq3eBM1"
    )
}