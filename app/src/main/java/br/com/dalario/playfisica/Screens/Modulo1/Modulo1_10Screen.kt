package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_10Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "kyE3rNk0Htk",
        titulo= "Line e Point",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O line serve para desenhar uma linha. Para isso, precisamos dizer onde a linha começa e onde ela termina, usando pontos na tela. É como se você pegasse um lápis e ligasse dois pontinhos: o lápis vai traçar a linha entre eles. A linha pode ser fina ou grossa, e podemos mudar a cor dela para deixar o desenho mais bonito.\n" +
                "\n" +
                "O point é usado para desenhar um único pontinho na tela. É como colocar uma bolinha em um lugar específico. Podemos escolher a cor do pontinho e até deixá-lo maior ou menor, dependendo do que quisermos mostrar no desenho.\n" +
                "\n" +
                "Esses dois comandos são muito importantes porque ajudam a marcar lugares e a construir desenhos maiores. Por exemplo, podemos usar muitos points juntos para fazer um desenho cheio de detalhes, ou usar lines para formar figuras geométricas como quadrados, triângulos e estrelas. Eles são como peças de um quebra-cabeça: juntas, ajudam a criar desenhos completos e divertidos!\n" ,
        destino_material = "material1_10",
        exercicioId = "",
    )
}