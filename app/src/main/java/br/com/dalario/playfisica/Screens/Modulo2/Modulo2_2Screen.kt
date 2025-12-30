package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_2Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "KCLq8rIOuDA",
        titulo= "Operações matemáticas, Comparativas e o If",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="As operações matemáticas servem para fazer contas no computador. Podemos somar, subtrair, multiplicar e dividir números, e o resultado dessas contas pode ser guardado em uma variável. Assim, o computador entende o que precisa calcular e guarda a resposta para usar depois.\n" +
                "\n" +
                "Existem também as operações de comparação, que servem para comparar dois valores. Elas respondem se algo é maior, menor, igual ou diferente. Quando o computador compara, ele sempre responde com “verdadeiro” ou “falso”, dependendo do resultado da comparação.\n" +
                "\n" +
                "A estrutura IF é usada para tomar decisões. Ela significa “SE” em inglês. Com ela, o computador pode escolher o que fazer dependendo da situação. Por exemplo: se uma condição for verdadeira, ele executa um comando; se for falsa, ele pula e continua o programa.\n" +
                "\n" +
                "Essas ideias são muito importantes, pois ajudam o computador a pensar e agir de forma lógica. Com as operações e o IF, é possível criar programas que fazem cálculos, comparam valores e tomam decisões — tudo de forma automática e inteligente!\n" ,
        destino_material = "material2_2",
        exercicioId = ""
    )
}