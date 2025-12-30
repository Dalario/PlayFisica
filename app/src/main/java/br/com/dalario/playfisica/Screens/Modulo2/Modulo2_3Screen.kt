package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_3Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "U5pWI95cydM",
        titulo= "Movimento Retilíneo Uniforme",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O Movimento Retilíneo Uniforme, ou MRU, acontece quando um objeto se move em linha reta e com a mesma velocidade o tempo todo. Isso quer dizer que ele não acelera nem diminui o ritmo, apenas continua andando igualzinho.\n" +
                "\n" +
                "Imagine um carrinho que anda sempre 10 metros por segundo. A cada segundo ele percorre a mesma distância, sem mudar a velocidade. Esse tipo de movimento é chamado de “uniforme” porque nada muda: nem a direção, nem a rapidez.\n" +
                "\n" +
                "A fórmula do MRU é S = S₀ + V × T, onde:\n" +
                "\n" +
                "S é a posição final,\n" +
                "\n" +
                "S₀ é o ponto de partida,\n" +
                "\n" +
                "V é a velocidade,\n" +
                "\n" +
                "T é o tempo.\n" +
                "\n" +
                "Com essa fórmula, conseguimos descobrir onde o objeto vai estar depois de um certo tempo. Se ele anda sempre igual, é fácil prever sua posição!\n" +
                "\n" +
                "O MRU está em muitos lugares: um carro andando em linha reta com velocidade constante, uma bola rolando sem frear ou até um trem que segue seu caminho sem parar. Esse movimento mostra como o mundo pode ser simples e previsível quando nada muda a velocidade.\n" ,
        destino_material = "material2_3",
        exercicioId = ""
    )
}