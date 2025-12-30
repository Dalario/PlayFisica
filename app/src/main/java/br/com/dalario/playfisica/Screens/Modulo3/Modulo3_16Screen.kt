package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_16Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "ELIcCJKCIZQ",
        titulo= "Exercício 20",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="O exercício mostrado é sobre colisão entre dois blocos que se movem na horizontal e também podem bater nas paredes da tela. A ideia é aplicar dois tipos de colisão: blocos batendo entre si e blocos batendo nas paredes. Para isso, usamos tudo o que foi aprendido sobre conservação do momento linear e coeficiente de restituição.\n" +
                "\n" +
                "Primeiro são definidas as informações do bloco 1: massa, posição no eixo x, velocidade inicial e uma variável para a velocidade final. Depois são definidas as mesmas coisas para o bloco 2. A velocidade do segundo bloco começa negativa, porque ele está vindo da direita para a esquerda.\n" +
                "\n" +
                "Também é definido o coeficiente de restituição, por exemplo 0.9, que indica o quanto da velocidade volta após a colisão. Depois é criado o canvas de 800 por 400, desenhado o fundo e em seguida cada bloco é desenhado na sua posição. A posição de cada bloco é atualizada somando com sua velocidade, assim eles começam a se mover.\n" +
                "\n" +
                "A colisão entre os blocos só deve ser calculada no exato momento em que eles encostam. Para isso, é usado um if que verifica se a lateral direita do bloco 1 chegou na lateral esquerda do bloco 2. Isso é feito comparando se posição x1 mais 50 (que é o tamanho do quadrado) é maior ou igual a posição x2. Quando isso acontece, aí sim a colisão é aplicada.\n" +
                "\n" +
                "Na colisão, são usadas as fórmulas que combinam conservação de momento linear com o coeficiente de restituição. Essas fórmulas geram novas velocidades para os dois blocos. As velocidades finais são então atribuídas às variáveis de velocidade para continuar o movimento com o valor atualizado.\n" +
                "\n" +
                "Logo depois da colisão, a posição do bloco 2 é ajustada para ficar exatamente encostada no bloco 1. Isso evita que os blocos fiquem atravessando um ao outro por causa da soma de velocidades que acontece a cada quadro do programa.\n" +
                "\n" +
                "Além disso, também é aplicada a colisão com as paredes da tela. Se o bloco 1 ultrapassar o lado esquerdo (posição menor que zero), a posição é ajustada e a velocidade é invertida e multiplicada pelo coeficiente de restituição. Se o bloco 2 ultrapassar o lado direito da tela, que pode ser por exemplo posição maior que 650, a posição é corrigida e a velocidade também é invertida e reduzida.\n" +
                "\n" +
                "Não é necessário programar colisão do bloco 1 com a parede direita, nem colisão do bloco 2 com a parede esquerda, porque eles sempre irão se encontrar no meio antes de tocar essas paredes.\n" +
                "\n" +
                "O resultado é que os blocos se movimentam, batem entre si, trocam velocidades de acordo com suas massas e coeficiente de restituição, e ainda rebatem nas paredes, perdendo velocidade a cada impacto, exatamente como acontece no mundo real.\n" ,
        destino_material = "",
        exercicioId = "vXlCbXhgH" //ATUALIZAR
    )
}