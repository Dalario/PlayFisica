package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_6Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "14JftxNx5go",
        titulo= "MRU na Diagonal",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="Neste vídeo, aprendemos sobre o movimento na diagonal, onde um círculo se move ao mesmo tempo nos dois sentidos: para o lado e para cima ou para baixo. Isso acontece porque ele tem uma velocidade no eixo X e outra no eixo Y.\n" +
                "\n" +
                "Quando o círculo anda, essas duas velocidades se somam e formam um caminho em diagonal, como se ele estivesse subindo ou descendo de ladinho. Quando chega ao limite da tela, o computador muda o sinal das velocidades, fazendo o círculo voltar pelo caminho contrário.\n" +
                "\n" +
                "Com isso, ele fica indo e voltando, criando um movimento constante e bonito. Esse tipo de movimento mostra como dois movimentos simples podem se combinar para formar algo diferente.\n" +
                "\n" +
                "É uma forma divertida de entender como o computador cria animações e como o Movimento Retilíneo Uniforme pode acontecer em mais de uma direção ao mesmo tempo!\n" ,
        destino_material = "material2_6",
        exercicioId = ""
    )
}