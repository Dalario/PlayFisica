package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_15Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "bSyuVhZHZ9w",
        titulo= "Lançamento Oblíquo",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O vídeo explica o lançamento oblíquo, que é a combinação de dois movimentos que já conhecemos: o movimento horizontal uniforme e o lançamento vertical. A diferença é que, neste caso, o objeto é lançado com uma velocidade inicial inclinada, formando um ângulo com a horizontal.\n" +
                "\n" +
                "Essa velocidade inicial pode ser decomposta em duas componentes:\n" +
                "\n" +
                "Velocidade horizontal (x): constante durante todo o movimento, pois não há aceleração horizontal. É calculada como a velocidade inicial multiplicada pelo cosseno do ângulo de inclinação.\n" +
                "\n" +
                "Velocidade vertical (y): varia devido à gravidade. Quando o objeto sobe, a gravidade diminui a velocidade vertical até que ela se torne zero no ponto mais alto. Depois, a gravidade faz a velocidade vertical aumentar na direção para baixo, provocando a descida. A velocidade vertical é calculada como a velocidade inicial multiplicada pelo seno do ângulo de inclinação.\n" +
                "\n" +
                "No P5.js, o lançamento oblíquo pode ser simulado de duas maneiras:\n" +
                "\n" +
                "Usando funções trigonométricas: transforma o ângulo em radianos e aplica seno e cosseno para calcular as velocidades x e y.\n" +
                "\n" +
                "Forma simplificada: define diretamente valores para a velocidade x e y, sem precisar de seno, cosseno ou conversão de radianos. Isso torna a aplicação prática mais rápida e intuitiva.\n" +
                "\n" +
                "Para o movimento no P5.js, a cada quadro (frame):\n" +
                "\n" +
                "Posição x: atualizada somando a velocidade x (constante).\n" +
                "\n" +
                "Velocidade y: atualizada somando ou subtraindo a gravidade, dependendo do eixo definido.\n" +
                "\n" +
                "Posição y: atualizada usando a velocidade y.\n" +
                "\n" +
                "O vídeo também explica como ajustar:\n" +
                "\n" +
                "Velocidade inicial: quanto maior, mais o objeto se desloca horizontal e verticalmente.\n" +
                "\n" +
                "Gravidade: quanto maior, menor a altura máxima atingida pelo objeto.\n" +
                "\n" +
                "Para limitar o movimento dentro da tela, é usado um condicional que verifica a posição máxima do objeto e ajusta posição x e y se necessário.\n" +
                "\n" +
                "No final, a abordagem simplificada permite simular o lançamento oblíquo de forma direta e prática, sem precisar usar radianos, seno ou cosseno, apenas ajustando valores de velocidade e gravidade.\n" ,
        destino_material = "material2_15",
        exercicioId = ""
    )
}