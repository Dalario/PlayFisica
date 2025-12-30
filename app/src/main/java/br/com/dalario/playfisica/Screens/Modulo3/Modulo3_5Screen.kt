package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_5Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "YYmVHl8cNuk",
        titulo= "3° Lei de Newton",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Nesta aula você vai entender, com exemplos simples e animações, a Terceira Lei de Newton, também chamada de Lei da Ação e Reação. Ela diz que toda vez que um corpo exerce uma força sobre outro, recebe de volta uma força de mesma intensidade, na mesma direção, mas em sentido contrário.\n" +
                "\n" +
                "No vídeo, o professor mostra dois corpos: um vermelho parado e outro verde em movimento. Quando o corpo verde atinge o vermelho, ele aplica uma força (ação). No mesmo instante, o corpo vermelho aplica outra força de reação sobre o verde.\n" +
                "Essas forças:\n" +
                "\n" +
                "Têm mesmo módulo (valor),\n" +
                "\n" +
                "Têm mesma direção,\n" +
                "\n" +
                "Mas sentidos opostos,\n" +
                "\n" +
                "E atuam em corpos diferentes, por isso não se anulam.\n" +
                "\n" +
                "Ao se chocarem, o corpo que estava parado começa a se mover, e o que estava em movimento é empurrado de volta. Esse exemplo ajuda a entender por que, ao chutar uma bola, ela se move, mas sentimos a força de volta no pé; ou por que empurrar uma parede faz a mão doer.\n" ,
        destino_material = "material3_5",
        exercicioId = ""
    )
}