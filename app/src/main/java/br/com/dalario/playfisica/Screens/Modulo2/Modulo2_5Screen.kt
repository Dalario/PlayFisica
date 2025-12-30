package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_5Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "dhf-9c3J9BM",
        titulo= "Exercicio 8",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O vídeo propõe um exercício no P5.js para criar um cenário de jogo com movimento. A ideia é desenhar os elementos principais da paisagem: céu, chão, montanhas, árvores, nuvens e plataformas. Não é necessário adicionar personagens, textos ou detalhes extras ainda.\n" +
                "\n" +
                "Depois do desenho, o foco é aplicar movimento retilíneo uniforme (MRU):\n" +
                "\n" +
                "☁ Nuvens\n" +
                "\n" +
                "Se deslocam na horizontal.\n" +
                "\n" +
                "Quando chegam a um limite de um lado, mudam de direção e voltam para o outro.\n" +
                "\n" +
                "Todas as partes da nuvem se movem juntas, mantendo o formato.\n" +
                "\n" +
                "\uD83D\uDFEB Plataformas móveis\n" +
                "\n" +
                "Duas plataformas se movimentam para a direita e para a esquerda.\n" +
                "\n" +
                "Uma plataforma sobe e desce.\n" +
                "\n" +
                "Todas seguem o mesmo princípio: posição vai mudando aos poucos e, quando atinge um limite, inverte o sentido do movimento.\n" +
                "\n" +
                "\uD83D\uDCA1 Ideias importantes aplicadas\n" +
                "\n" +
                "Pensar sempre do fundo para a frente: primeiro o cenário, depois os objetos que se movem.\n" +
                "\n" +
                "A posição de cada objeto muda aos poucos, criando a sensação de movimento contínuo.\n" +
                "\n" +
                "Quando a posição chega ao limite definido, o movimento inverte.\n" +
                "\n" +
                "A lógica é a mesma para nuvens e plataformas, só mudando se o movimento é para os lados ou para cima e para baixo.\n" ,
        destino_material = "",
        exercicioId = "4elwO4dd4",

    )
}