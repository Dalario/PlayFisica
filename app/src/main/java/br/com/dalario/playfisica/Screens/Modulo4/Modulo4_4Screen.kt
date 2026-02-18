package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_4Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "-y72Y8kZiSw",
        titulo= "Insterações com o mouse",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Não basta saber onde o mouse está; é preciso saber o que ele está fazendo! Neste vídeo, mostramos como usar os eventos de clique e pressão para criar experimentos de física interativos.\n" +
                "\n" +
                "Comandos principais:\n" +
                "mouseIsPressed: Uma variável booleana que identifica se algum botão do mouse está sendo pressionado no momento. Ideal para criar forças contínuas (como ligar um propulsor).\n" +
                "\n" +
                "mouseButton: Identifica qual botão foi clicado (ESQUERDO, DIREITO ou CENTRAL). Útil para atribuir funções diferentes, como \"atrair\" ou \"repelir\" cargas elétricas.\n" +
                "\n" +
                "Funções de Evento (mousePressed / mouseReleased): Funções que rodam apenas uma vez quando o clique acontece. Perfeitas para disparar um projétil ou resetar uma simulação.\n" ,
        destino_material = "material4_4",
        exercicioId = ""
    )
}