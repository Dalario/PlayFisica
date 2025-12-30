package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_1Screen(navController: NavController) {
    Conteudos(
        navController,
        videoId = "GT5JRtmZQ_U",
        cor_modulo = colorResource(R.color.modulo_3),
        titulo = "1° Lei de Newton",
        descricao =

            "A Primeira Lei de Newton se chama Lei da Inércia e nos conta um segredo sobre os objetos: eles gostam de continuar fazendo o que já estão fazendo!\n" +
                "\n" +
                "Se algo está parado, ele vai continuar parado. Se algo está se mexendo, ele vai continuar se mexendo na mesma direção e com a mesma velocidade. Nada muda sozinho; só uma força externa pode fazer o objeto acelerar, frear ou mudar de direção.\n" +
                "\n" +
                "Imagine empurrar uma caixa e alguém empurrar do outro lado com a mesma força: ela nem se mexe! Isso acontece porque as forças se cancelam.\n" +
                "\n" +
                "A inércia está em tudo ao nosso redor: carros, bicicletas, bolas e até brinquedos. Quando algo se move sem parar, está mostrando a Lei da Inércia na prática.\n" +
                "\n" +
                "Sem aceleração, a velocidade não muda e o movimento continua igual. É como se os objetos tivessem “preguiça” de mudar de estado.\n" +
                "\n" +
                "Entender essa lei nos ajuda a perceber melhor o mundo físico e como as forças atuam nos objetos. Cada vez que algo continua parado ou se move sem ninguém empurrar, você está vendo a inércia em ação.\n" +
                "\n" +
                "Aprender sobre ela é divertido e nos faz perceber o movimento de um jeito novo."+"\n",


        destino_material = "material3_1",
        exercicioId = ""
    )

}