package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_8Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "4bC1ywtaABs",
        titulo= "StrokeWeight, noFill e noStroke",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O comando stroke() define a cor da borda do objeto. Se você quiser desenhar um círculo, um retângulo ou uma linha, a cor da borda será definida por esse comando. Já o fill() define a cor de preenchimento do objeto, ou seja, a cor que aparece dentro do contorno do objeto.\n" +
                "\n" +
                "O strokeWeight() permite definir a espessura da borda do objeto. Ele recebe um valor numérico em pixels, e quanto maior o número, mais grossa será a borda. Por exemplo, strokeWeight(5); deixa a borda bem grossa, enquanto strokeWeight(1); deixa-a fina.\n" +
                "\n" +
                "Se você não quiser que um objeto tenha preenchimento, pode usar o comando noFill(), e ele será desenhado apenas com a borda. Por outro lado, se você não quiser que o objeto tenha borda, pode usar o comando noStroke(), e ele será desenhado apenas com a cor de preenchimento.\n" ,
        destino_material = "material1_8",
        exercicioId = ""
    )
}