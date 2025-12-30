package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_9Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "Hkta5bcReeE",
        titulo= "Queda Livre",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O vídeo apresenta o conceito de queda livre, explicando que é o movimento de um objeto sob a influência exclusiva da gravidade. A gravidade é tratada como uma aceleração constante, geralmente aproximada para 10 m/s², que atua sempre na direção para baixo. Durante a queda, a velocidade do objeto aumenta continuamente, partindo de zero, e a cada instante a distância percorrida é maior devido à aceleração constante.\n" +
                "\n" +
                "No exemplo prático em P5.js, o código simula a queda livre de um círculo azul. A cada quadro, a velocidade do objeto é atualizada somando o valor da gravidade, e a posição vertical é atualizada somando a velocidade. Esse cálculo contínuo cria a sensação de aceleração. Além disso, é demonstrado como limitar a posição do objeto para que ele pare ao atingir o “chão”, evitando que ultrapasse os limites da tela, simulando a colisão de forma simples e visual.\n" +
                "\n" +
                "O vídeo também sugere ajustes nos valores da gravidade para simular diferentes ambientes, como a Terra ou a Lua, mostrando como a aceleração influencia diretamente na velocidade e na posição do objeto durante a queda.\n" ,
        destino_material = "material2_9",
        exercicioId = ""
    )
}