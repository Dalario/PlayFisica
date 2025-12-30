package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_13Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "m7hHSarABFI",
        titulo= "Efeito Bounce",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Nesta aula, eu explico o que é colisão e como aplicar esse conceito no P5.js. Colisão acontece quando dois corpos se chocam. Dependendo de quanta energia é perdida ou mantida, existem três tipos de colisões:\n" +
                "\n" +
                "Colisão perfeitamente elástica: nenhuma energia é perdida. O objeto volta com a mesma velocidade.\n" +
                "Exemplo: bola que bate no chão e volta para a mesma altura.\n" +
                "Coeficiente de restituição e = 1.\n" +
                "\n" +
                "Colisão parcialmente elástica: parte da energia é perdida em forma de som, calor ou deformação. A bola volta, mas cada vez mais baixo.\n" +
                "0 < e < 1.\n" +
                "\n" +
                "Colisão inelástica: os corpos se chocam e ficam grudados, se movendo juntos. Toda a energia de movimento praticamente se perde.\n" +
                "e = 0.\n" +
                "\n" +
                "Coeficiente de Restituição:\n" +
                "\n" +
                "O coeficiente de restituição mede quanto da velocidade é mantido depois da colisão.\n" +
                "\n" +
                "Fórmula geral:\n" +
                "e = (Vf2 - Vf1) / (Vi1 - Vi2)\n" +
                "\n" +
                "Onde:\n" +
                "Vi1 e Vi2 são velocidades dos corpos antes da colisão.\n" +
                "Vf1 e Vf2 são as velocidades depois da colisão.\n" +
                "\n" +
                "Caso especial: colisão com o chão ou parede\n" +
                "\n" +
                "Quando a colisão é com o chão ou parede, o objeto 2 (parede ou chão) tem velocidade zero antes e depois da colisão. Então a fórmula fica bem mais simples:\n" +
                "\n" +
                "Vf = -e * Vi\n" +
                "\n" +
                "O sinal negativo significa que a direção da velocidade é invertida.\n" +
                "\n" +
                "Se e for menor que 1, a velocidade diminui depois do impacto.\n" ,
        destino_material = "material3_13",
        exercicioId = ""
    )
}