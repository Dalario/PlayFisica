package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_4Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "N7MFMdN2LWQ",
        titulo= "Exercício 15",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="\uD83C\uDFCE\uFE0F\uD83D\uDCA8 Exercício – Segunda Lei de Newton na prática (F = m · a)\n" +
                "Neste desafio, você vai criar uma pista de corrida, desenhar dois carros e aplicar a mesma força em ambos. O carro azul tem menor massa, e o vermelho maior massa. Assim, pela Segunda Lei de Newton, eles terão acelerações diferentes:\n" +
                "➡ Mesma força + massas diferentes = acelerações diferentes\n" +
                "Logo, o carro azul acelera mais rápido e chega antes.\n" +
                "\n" +
                "Você deverá:\n" +
                "\n" +
                "Desenhar o cenário da pista;\n" +
                "\n" +
                "Criar os carros no código;\n" +
                "\n" +
                "Aplicar a força e calcular a aceleração com F = m · a;\n" +
                "\n" +
                "Atualizar a velocidade e a posição de cada carro na simulação.\n" ,
        destino_material = "",
        exercicioId = "K7DlMMwMm"
    )
}