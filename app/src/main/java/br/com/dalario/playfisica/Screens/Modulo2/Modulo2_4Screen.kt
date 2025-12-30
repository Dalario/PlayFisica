package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_4Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "qh-2ebjl5cw",
        titulo= "Mais Aplicações do MRU",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="Neste vídeo, aprendemos como fazer um círculo se mover na tela, indo e voltando de um lado para o outro. Esse movimento é um exemplo do Movimento Retilíneo Uniforme, quando algo se desloca em linha reta com a mesma velocidade.\n" +
                "\n" +
                "O círculo começa em uma posição e, a cada instante, a sua posição X muda um pouquinho, somando a velocidade. Assim, ele vai andando até chegar ao final da tela. Quando isso acontece, o programa muda o sinal da velocidade, e o círculo começa a voltar.\n" +
                "\n" +
                "Usando o comando if, o computador verifica se o círculo chegou no limite da tela. Se chegou, ele inverte a direção. Isso faz com que a bolinha fique indo e voltando sem parar.\n" +
                "\n" +
                "Depois, o mesmo raciocínio é aplicado ao eixo Y, para o círculo subir e descer. Assim, ele pode se mover tanto na horizontal quanto na vertical, e até em diagonal.\n" +
                "\n" +
                "Essas ideias ajudam a entender melhor como o movimento acontece e como o computador pode usar as fórmulas do MRU para animar objetos na tela. É um jeito divertido de aprender física e programação ao mesmo tempo!\n" ,
        destino_material = "material2_4",
        exercicioId = ""
    )
}