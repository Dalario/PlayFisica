package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_7Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "3Ld0IT9ii-4",
        titulo= "MRU Variado",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O vídeo apresenta o Movimento Retilíneo Uniformemente Variado (MRUV), mostrando como a velocidade de um objeto muda de forma constante quando há aceleração. A bolinha na tela ilustra esse movimento, acelerando ou desacelerando conforme a aceleração aplicada.\n" +
                "\n" +
                "Cada quadro do programa calcula a nova velocidade e atualiza a posição da bolinha, criando a sensação de movimento contínuo. A aceleração positiva aumenta a velocidade, enquanto a negativa diminui.\n" +
                "\n" +
                "Também é mostrado como controlar a bolinha, fazendo-a parar ao atingir um limite, e como aplicar o conceito para movimentos horizontais, verticais ou diagonais, unindo física e programação de forma prática.\n" ,
        destino_material = "material2_7",
        exercicioId = ""
    )
}