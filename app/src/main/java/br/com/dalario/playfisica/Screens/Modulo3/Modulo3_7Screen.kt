package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_7Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "TCXg3PqnaG4",
        titulo= "Força de Arrasto",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Nesta aula, você vai entender o que é a força de arrasto, também chamada de resistência do ar, e como ela influencia os movimentos dos corpos.\n" +
                "\n" +
                "Quando um objeto se move no ar, como uma bolinha sendo solta, ele sofre duas forças principais:\n" +
                "\n" +
                "Força Peso, que puxa o objeto para baixo;\n" +
                "\n" +
                "Força de Arrasto, que surge por causa do ar e atua no sentido contrário ao movimento.\n" +
                "\n" +
                "A força de arrasto funciona como um “freio do ar”. Ela não ocorre entre superfícies, como o atrito comum, mas sim entre o objeto e o ar (ou outro fluido) ao redor dele.\n" +
                "\n" +
                "✅ Características da Força de Arrasto:\n" +
                "\n" +
                "Surge somente quando há movimento em um fluido (como ar ou água);\n" +
                "\n" +
                "Atua sempre no sentido contrário à velocidade do objeto;\n" +
                "\n" +
                "Seu valor aumenta conforme a velocidade aumenta;\n" +
                "\n" +
                "Pode ser calculada por:\n" +
                "Fₐ = –k · v, onde “k” é uma constante e “v” é a velocidade;\n" +
                "o sinal de “–” indica que a força é contrária ao movimento.\n" +
                "\n" +
                "⬇\uFE0F Velocidade Terminal – Um conceito muito importante\n" +
                "\n" +
                "À medida que o objeto cai, sua velocidade aumenta, e com ela, a força de arrasto também aumenta.\n" +
                "Chega um momento em que:\n" +
                "\uD83D\uDCCC Força de Arrasto = Força Peso\n" +
                "\uD83D\uDCCC Força Resultante = 0\n" +
                "\uD83D\uDCCC Aceleração = 0\n" +
                "\n" +
                "A partir daí, o objeto continua caindo, mas com velocidade constante.\n" +
                "Essa velocidade máxima é chamada de Velocidade Terminal.\n" ,
        destino_material = "material3_7",
        exercicioId = ""
    )
}