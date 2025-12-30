package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_17Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "t7nhtPJEKIs",
        titulo= "Estrutura If else",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O vídeo explica o uso do If e Else em programação, que serve para criar decisões no código. O If significa \"se\" e executa um bloco de código apenas se a condição for verdadeira. Se a condição for falsa, o código dentro do If não é executado. Por exemplo, se a posição x de um objeto for menor que a metade da tela, o fundo fica azul claro; se não for menor, o fundo não muda ou executa outro comando.\n" +
                "\n" +
                "O Else significa \"senão\" e cria uma alternativa quando a condição do If é falsa. Ou seja, se a condição do If não ocorre, o código dentro do Else é executado. Por exemplo, se a posição x for menor que 400, o fundo é azul claro. Se for maior ou igual a 400, o fundo é azul escuro.\n" +
                "\n" +
                "A diferença entre If e If Else é que usamos If sozinho quando não há alternativa para o caso falso e usamos If Else quando há uma escolha binária, ou seja, isso ou aquilo. Por exemplo, em um interruptor, se ele estiver ligado, a luz acende; se estiver desligado, a luz apaga.\n" +
                "\n" +
                "É possível usar um If dentro do Else para várias verificações, criando camadas de decisões, desde que a lógica faça sentido. Um exemplo é o semáforo: se o sinal é verde, avance; senão, verifique se é amarelo, então fique atento; senão, é vermelho, então pare.\n" +
                "\n" +
                "Na prática, podemos usar um If simples para ações que só precisam ocorrer quando a condição for verdadeira. Por exemplo, se a posição x de um objeto passar de 850, ele volta para -50. Nesse caso, não é necessário usar Else, pois só queremos que algo aconteça quando a condição for verdadeira.\n" ,
        destino_material = "material2_17",
        exercicioId = ""
    )
}