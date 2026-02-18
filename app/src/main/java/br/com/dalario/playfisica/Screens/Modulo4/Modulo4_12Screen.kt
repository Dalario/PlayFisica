package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_12Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "lmW8HhCUxEw",
        titulo= "Mouse Dragged/Moved",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Aprenda a diferença entre mexer o mouse livremente e arrastar objetos pelo cenário.\n" +
                "O mouseMoved() avisa o código toda vez que o cursor passeia pela tela sem apertar nada.\n" +
                "Já o mouseDragged() só funciona quando você clica e segura para levar um item com você.\n" +
                "É a ferramenta secreta para criar laboratórios onde o aluno pode organizar pesos e polias.\n" ,
        destino_material = "material4_12",
        exercicioId = ""
    )
}