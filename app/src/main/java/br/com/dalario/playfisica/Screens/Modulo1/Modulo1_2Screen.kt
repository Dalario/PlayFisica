package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_2Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "brYO770Ccv4",
        titulo= "Functions Setup e Draw do P5.js",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="A function setup() e a function draw() são as partes principais de um projeto no p5.js. Elas trabalham juntas para criar e animar tudo o que aparece na tela.\n" +
                "\n" +
                "A function setup() é executada uma única vez, logo no início do programa. É nela que configuramos o ambiente, definindo o tamanho da tela, as cores e os elementos iniciais. É como montar o palco antes do espetáculo começar.\n" +
                "\n" +
                "A function draw() acontece várias vezes por segundo. Ela é responsável por atualizar e redesenhar o cenário, criando o movimento e dando vida ao que foi configurado no setup. É como o espetáculo acontecendo, com os personagens se movendo e o cenário mudando.\n" +
                "\n" +
                "O setup prepara e o draw movimenta." +
                " Juntas, essas duas funções fazem o p5.js transformar o código em arte viva, cheia de ação e criatividade.\n" ,
        destino_material = "material1_2",
        exercicioId = ""
    )
}