package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_6Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "oUxfT7Ri7q0",
        titulo= "Força de Atrito",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Nesta aula, você vai entender o que é a força de atrito, por que ela existe e como ela aparece no nosso dia a dia. A força de atrito é uma força que surge apenas quando há contato entre superfícies (como chão e sapato, pneu e asfalto, mão e corda). Ela é paralela à superfície e sempre atua contra o deslizamento ou contra a tendência de deslizar.\n" +
                "\n" +
                "✅ O que você vai aprender na aula:\n" +
                "\n" +
                "O que é atrito?\n" +
                "É uma força que aparece quando duas superfícies se encostam. Ela resiste ao movimento, tentando impedir ou diminuir o deslizamento.\n" +
                "\n" +
                "Exemplos mostrados no vídeo:\n" +
                "\n" +
                "Uma pessoa empurrando uma geladeira: a força de atrito aparece no sentido contrário.\n" +
                "\n" +
                "Alguém pendurado em uma corda: se a tendência é descer, o atrito atua para cima.\n" +
                "\n" +
                "Tipos de atrito:\n" +
                "1. Atrito estático:\n" +
                "\n" +
                "Age quando o objeto ainda está parado.\n" +
                "\n" +
                "Impede o movimento.\n" +
                "\n" +
                "Pode aumentar até um valor máximo.\n" +
                "\n" +
                "Fórmula: Fₐₑ = μₑ · N (coeficiente de atrito estático × normal).\n" +
                "\n" +
                "2. Atrito dinâmico (ou cinético):\n" +
                "\n" +
                "Atua quando o objeto já está se movendo.\n" +
                "\n" +
                "Não impede, mas diminui a velocidade.\n" +
                "\n" +
                "Fórmula: Fₐ\uD835\uDCB9 = μ\uD835\uDCB9 · N.\n" +
                "\n" +
                "Sempre é menor que o atrito estático máximo.\n" +
                "\n" +
                "Explicação com números:\n" +
                "Se você empurra com 10 N e a geladeira não se mexe, o atrito estático também vale 10 N.\n" +
                "Conforme você aumenta a força (20 N, 30 N...), o atrito aumenta junto — até atingir o limite máximo.\n" +
                "Se a força aplicada for maior que a força de atrito estático máxima, o objeto se move — e entra em ação o atrito dinâmico.\n" +
                "\n" +
                "Aplicação no P5.js (programação):\n" +
                "O professor mostra duas formas de simular o atrito no código:\n" +
                "✔ Forma completa (com massa, gravidade, normal, coeficientes μₑ e μ\uD835\uDCB9).\n" +
                "✔ Forma simplificada (multiplicando a velocidade por um fator de atrito como 0.9 a cada frame).\n" ,
        destino_material = "material3_6",
        exercicioId = ""
    )
}