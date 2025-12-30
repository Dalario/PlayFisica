package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_11Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "x1RCk37uvcQ",
        titulo= "Exercício 18",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="As variáveis são como caixinhas onde o computador guarda informações. Dentro delas podemos colocar números, palavras ou qualquer valor que queremos usar no nosso desenho ou jogo. Cada variável tem um nome, para que o computador saiba o que está guardado lá dentro.\n" +
                "\n" +
                "Quando criamos uma variável, é como se disséssemos ao computador: “Guarde isso pra mim!”. Depois, podemos mudar o valor dessa caixinha sempre que quisermos. Por exemplo, se uma variável guarda a posição de um círculo, podemos mudar esse valor e o círculo vai se mover na tela.\n" +
                "\n" +
                "As variáveis servem para deixar os programas mais organizados e fáceis de entender. Elas ajudam o computador a lembrar de informações importantes, como tamanho, cor ou velocidade dos objetos.\n" +
                "\n" +
                "Com as variáveis, podemos criar desenhos e jogos que mudam e se movem, deixando tudo muito mais divertido!\n" ,
        destino_material = "",
        exercicioId = ""
    )
}