package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_6Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "f5yU6toX_ds",
        titulo= "Fill e Stroke",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="No processamento de gráficos, os comandos fill e stroke definem a aparência dos objetos desenhados na tela. O comando fill serve para preencher o interior de formas como círculos, elipses e retângulos com uma cor. Ele recebe como parâmetro valores de cor em RGB, por exemplo: fill(255, 0, 0); preenche de vermelho.\n" +
                "\n" +
                "O comando stroke define a cor da borda do objeto. Assim como fill, ele também aceita valores RGB, por exemplo: stroke(0, 0, 0); cria uma borda preta. Caso você não queira borda, é possível usar noStroke(), e caso não queira preenchimento, pode usar noFill().\n" +
                "\n" +
                "Esses comandos devem ser colocados antes de desenhar a forma, para que o objeto seja desenhado com as cores desejadas. Por exemplo, se você colocar fill(0, 255, 0); stroke(0); ellipse(200, 200, 100, 150);, será desenhada uma elipse verde preenchida com borda preta.\n" ,
        destino_material = "material1_6",
        exercicioId = ""
    )
}