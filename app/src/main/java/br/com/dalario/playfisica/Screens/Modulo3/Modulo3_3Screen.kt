package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_3Screen(navController: NavController) {
    Conteudos(
        navController,
        videoId = "tIfvN0NnYMg",
        cor_modulo = colorResource(R.color.modulo_3),
        titulo = "2° Lei de Newton",
        descricao =
            "A Segunda Lei de Newton nos ensina que força é igual à massa vezes a aceleração. Isso significa que, para um objeto começar a se mover ou mudar sua velocidade, é preciso aplicar uma força sobre ele. Quanto maior a força, maior a aceleração; quanto menor, menor a aceleração.\n" +
                    "\n" +
                    "A massa do objeto também importa: objetos mais pesados são mais difíceis de acelerar do que objetos leves. Por exemplo, empurrar uma garrafa é fácil, mas empurrar um guarda-roupa exige muito mais força. A aceleração de um objeto depende diretamente da força aplicada e inversamente da sua massa.\n" +
                    "\n" +
                    "Se aplicarmos a mesma força em dois objetos diferentes, o que tiver menor massa acelerará mais rápido, e o que tiver maior massa acelerará mais devagar. Assim, a fórmula força = massa × aceleração nos ajuda a prever como um objeto vai se mover quando uma força é aplicada.\n" +
                    "\n" +
                    "Com essa lei, podemos calcular a aceleração, atualizar a velocidade e descobrir a posição do objeto a cada instante. Ela está presente em muitas situações do dia a dia: carros, bolas, bicicletas e até brinquedos. Aprender a Segunda Lei de Newton nos permite entender melhor o movimento e perceber como forças e massas influenciam o mundo ao nosso redor.\n" +
                    "\n" +
                    "A ideia principal é: força faz os objetos acelerarem, a massa resiste à mudança, e a aceleração mostra como rápido o movimento muda. Com essa lei, conseguimos prever e controlar o movimento de objetos de maneira divertida e prática." + "\n",

        destino_material = "material3_3",
        exercicioId = ""
    )
}