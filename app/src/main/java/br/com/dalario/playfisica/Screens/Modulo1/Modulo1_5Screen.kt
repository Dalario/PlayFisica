package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R


@Composable
fun Modulo1_5Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "mtgUuAMzBfY",
        titulo= "Exercício 1",
        cor_modulo = colorResource(R.color.modulo_1),

        descricao= "O vídeo mostra como desenhar um bonequinho no Processing usando os comandos circle() e ellipse(). Primeiro, é criada uma tela (800×600) com fundo amarelo. Depois, são desenhados:\n" +
    "\n" +
            "um círculo central para a cabeça;\n" +
            "\n" +
            "dois círculos menores para as orelhas;\n" +
            "\n" +
            "uma elipse para o pescoço;\n" +
            "\n" +
            "outra elipse maior para os ombros.\n" +
            "\n" +
            "Tudo é posicionado usando coordenadas no centro da tela.\n" +
            "\n" +
            "\uD83D\uDCA1 Dicas rápidas\n" +
            "\n" +
            "O centro da tela fica em (largura/2, altura/2).\n" +
            "\n" +
            "No Processing, o eixo X vai para a direita e o eixo Y vai para baixo.\n" +
            "\n" +
            "circle(x, y, d) → centro e diâmetro.\n" +
            "\n" +
            "ellipse(x, y, w, h) → centro, largura e altura.\n" +
            "\n" +
            "Testar posições e ajustar valores faz parte do processo.\n",

        destino_material = "\n",
        exercicioId = "bFI3g7P_d"
    )
}