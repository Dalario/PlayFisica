package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_13Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "NcPOPo6e5vI",
        titulo= "Lançamento Horizontal",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O vídeo explica o lançamento horizontal, que combina dois movimentos independentes: um movimento horizontal uniforme e um movimento vertical acelerado.\n" +
                "\n" +
                "No eixo horizontal (x), o objeto se move com velocidade constante, porque não há aceleração agindo nesse sentido. Isso é chamado de movimento retilíneo uniforme (MRU), onde o objeto percorre a mesma distância em intervalos de tempo iguais. A posição horizontal é calculada usando a fórmula: posição final igual a posição inicial mais velocidade vezes tempo.\n" +
                "\n" +
                "No eixo vertical (y), o movimento é como uma queda livre, ou seja, existe aceleração causada pela gravidade, que faz a velocidade vertical aumentar ao longo do tempo. A velocidade vertical é calculada como a velocidade inicial mais gravidade vezes tempo. Como o lançamento horizontal não dá velocidade vertical inicial, a gravidade faz o objeto acelerar para baixo.\n" +
                "\n" +
                "Para simular no P5.js, o programa atualiza as posições e velocidades a cada quadro (frame) da seguinte forma:\n" +
                "\n" +
                "Posição x: aumenta pela velocidade horizontal constante, simulando o MRU.\n" +
                "\n" +
                "Velocidade y: aumenta pela gravidade a cada quadro, simulando a aceleração.\n" +
                "\n" +
                "Posição y: aumenta pela velocidade vertical atualizada, reproduzindo a descida do objeto.\n" +
                "\n" +
                "São usadas cinco variáveis principais: posição x, velocidade x, posição y, velocidade y e gravidade. A posição inicial do objeto leva em conta o tamanho do círculo usado para desenhá-lo na tela.\n" +
                "\n" +
                "Para impedir que o objeto ultrapasse o chão ou a tela, é usado um condicional que verifica a posição y máxima. Se o objeto passar desse limite, a posição é ajustada para o valor correto. Para alinhar a posição horizontal final, são feitos testes até que o objeto caia no ponto certo.\n" +
                "\n" +
                "O vídeo também explica que a forma prática de aumentar a distância percorrida horizontalmente é alterar a velocidade de lançamento, já que a gravidade de um planeta não pode ser mudada. Pequenos detalhes visuais, como adicionar um chão ou cores diferentes, tornam a simulação mais clara e interessante.\n" ,
        destino_material = "material2_13",
        exercicioId = ""
    )
}