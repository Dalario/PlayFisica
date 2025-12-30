package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_14Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "nRZnp1Mys1M",
        titulo= "Exercício 19",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Nesta aula, eu apresento um exercício para aplicar o conteúdo de colisões estudado anteriormente. Na tela, aparece um círculo que se move tanto no eixo horizontal quanto no eixo vertical, ou seja, ele tem velocidade em X e velocidade em Y. A cada batida nas bordas da tela (paredes, teto e chão), ele perde parte da velocidade por causa do coeficiente de restituição.\n" +
                "\n" +
                "1. Ideia do exercício\n" +
                "\n" +
                "O círculo tem posição inicial em X e Y e possui velocidades nas duas direções.\n" +
                "\n" +
                "Ele se move livremente, sofre a ação da gravidade na vertical e bate nas bordas da tela.\n" +
                "\n" +
                "Toda vez que encosta no chão, teto ou paredes, a velocidade é invertida e multiplicada pelo coeficiente de restituição.\n" +
                "\n" +
                "Como esse coeficiente é menor que 1, o círculo vai perdendo energia com o tempo.\n" +
                "\n" +
                "2. Declaração das variáveis:\n" +
                "\n" +
                "posX = 100\n" +
                "posY = 100\n" +
                "velX = 20\n" +
                "velY = 20\n" +
                "gravidade = 1\n" +
                "coefRest = 0.9\n" +
                "\n" +
                "Esses valores iniciais podem ser alterados, mas foram usados para iniciar o movimento.\n" +
                "\n" +
                "3. Movimento do círculo\n" +
                "\n" +
                "No eixo X (horizontal):\n" +
                "Não existe aceleração. O movimento é uniforme.\n" +
                "posX = posX + velX\n" +
                "\n" +
                "No eixo Y (vertical):\n" +
                "Existe aceleração devido à gravidade.\n" +
                "velY = velY + gravidade\n" +
                "posY = posY + velY\n" +
                "\n" +
                "No início, a bolinha cai porque velY aumenta. Depois bate no chão, quica e sobe.\n" +
                "\n" +
                "4. Aplicação das colisões com as bordas\n" +
                "\n" +
                "Sempre que o círculo encosta em uma borda, acontecem duas coisas:\n" +
                "\n" +
                "A posição é corrigida para não sair da tela.\n" +
                "\n" +
                "A velocidade é invertida e multiplicada por -coefRest.\n" +
                "\n" +
                "Colisão nas paredes laterais (esquerda e direita):\n" +
                "\n" +
                "Se posX > 775:\n" +
                "posX = 775\n" +
                "velX = -velX * coefRest\n" +
                "\n" +
                "Se posX < 25:\n" +
                "posX = 25\n" +
                "velX = -velX * coefRest\n" +
                "\n" +
                "Colisão no chão e no teto (parte de baixo e de cima):\n" +
                "\n" +
                "Se posY > 325:\n" +
                "posY = 325\n" +
                "velY = -velY * coefRest\n" +
                "\n" +
                "Se posY < 25:\n" +
                "posY = 25\n" +
                "velY = -velY * coefRest\n" +
                "\n" +
                "5. O que acontece visualmente\n" +
                "\n" +
                "A bolinha começa se movendo com velocidade nos dois eixos.\n" +
                "\n" +
                "A gravidade puxa ela para baixo, então a trajetória é uma parábola.\n" +
                "\n" +
                "Quando toca no chão, quica e sobe perdendo velocidade.\n" +
                "\n" +
                "Quando encosta nas paredes ou no teto, também perde velocidade e inverte a direção do movimento.\n" +
                "\n" +
                "Isso acontece repetidamente até que o movimento fique muito pequeno.\n" ,
        destino_material = "material2_1",
        exercicioId = "RgDV--Mcb"
    )
}