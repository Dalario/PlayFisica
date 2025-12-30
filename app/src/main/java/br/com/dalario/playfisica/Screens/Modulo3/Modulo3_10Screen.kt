package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_10Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "cXm2ZcC_qGo",
        titulo= "Exercício 17",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="\uD83C\uDFAF Exercício – Tração (corda, polia e dois blocos)\n" +
                "\n" +
                "No vídeo anterior, você aprendeu o que é tração e como ela aparece em sistemas com cordas, polias e pesos.\n" +
                "Agora, neste vídeo, vamos colocar em prática esse conceito.\n" +
                "\n" +
                "\uD83E\uDDE9 Desafio proposto:\n" +
                "\n" +
                "Desenhe o cenário com:\n" +
                "\n" +
                "Teto, polia (círculo com triângulo de suporte),\n" +
                "\n" +
                "Chão e dois blocos pendurados por uma corda;\n" +
                "\n" +
                "O bloco azul é mais pesado que o laranja → então ele desce, puxando o outro bloco para cima;\n" +
                "\n" +
                "Aplique as fórmulas vistas na aula:\n" +
                "\n" +
                "Peso (P = m·g);\n" +
                "\n" +
                "Força resultante do sistema (Fr = P₂ – P₁);\n" +
                "\n" +
                "Aceleração (a = (P₂ – P₁) / (m₁ + m₂));\n" +
                "\n" +
                "Atualização da posição com base na velocidade e aceleração.\n" ,
        destino_material = "",
        exercicioId = "FwYGL0QJ2"
    )
}