package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_9Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "kwynRNl_0ys",
        titulo= "Moved X e Y",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Entenda como medir o quanto o mouse se mexeu, independente da sua posição fixa na tela.\n" +
                "As variáveis movedX e movedY calculam a diferença de movimento entre um frame e outro.\n" +
                "É a ferramenta perfeita para controlar câmeras ou girar objetos em 3D sem sair do lugar.\n" +
                "Diferente do MouseX, aqui o foco é a velocidade e a direção do deslize do seu dedo.\n" +
                "Aprenda a criar controles super precisos para os seus simuladores\n" ,
        destino_material = "material4_9",
        exercicioId = ""
    )
}