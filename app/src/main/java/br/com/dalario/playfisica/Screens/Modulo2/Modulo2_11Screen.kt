package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_11Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "lg0845LBNxQ",
        titulo= "Lançamento Vertical",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O vídeo aborda o conceito de lançamento vertical, que ocorre quando um objeto é lançado para cima com uma velocidade inicial diferente de zero. Diferentemente da queda livre, onde a velocidade inicial é nula, no lançamento vertical o objeto começa com uma velocidade positiva. A gravidade, que sempre atua para baixo, se opõe ao movimento ascendente do objeto, promovendo uma desaceleração gradual até que a velocidade atinja zero no ponto mais alto. Neste instante, o objeto fica momentaneamente parado antes de começar a descer. Durante a descida, a gravidade passa a acelerar o objeto, aumentando sua velocidade em direção ao solo.\n" +
                "\n" +
                "Para exemplificar o fenômeno de forma prática, o vídeo utiliza P5.js para simular o movimento. A cada quadro do programa, a velocidade do objeto é atualizada subtraindo a gravidade, enquanto a posição vertical é atualizada subtraindo a velocidade, permitindo que o objeto suba. Quando a velocidade se torna negativa, a subtração resulta em aumento da posição vertical, simulando a descida. Esse cálculo contínuo reproduz o efeito real de aceleração e desaceleração no movimento vertical.\n" +
                "\n" +
                "O código utiliza três variáveis principais: posição y, velocidade y e gravidade. A posição inicial é ajustada de acordo com o tamanho do objeto para que ele comece no ponto correto da tela. Além disso, é implementada uma condição para limitar a posição do objeto ao atingir o “chão” (ou uma posição mínima), garantindo que ele não ultrapasse o limite da tela. Para criar um efeito visual contínuo de subida e descida repetida, a velocidade é reinicializada com um valor positivo sempre que o objeto atinge o solo, simulando múltiplos lançamentos verticais de forma automática.\n" +
                "\n" +
                "O vídeo também demonstra pequenas melhorias visuais, como desenhar um retângulo representando o chão e modificar cores para destacar o efeito do movimento. Por fim, é destacado que ajustando os valores de velocidade inicial e gravidade é possível simular diferentes ambientes ou intensidades de lançamento, tornando a experiência mais realista e flexível.\n" ,
        destino_material = "material2_11",
        exercicioId = ""
    )
}