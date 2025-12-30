package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_15Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "Xhrm262OkQg",
        titulo= "Exercício 6",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O vídeo apresenta um exercício em P5.js onde o objetivo é desenhar uma pizza usando formas básicas como arcos, círculos, retângulos e linhas. A ideia é aplicar tudo o que já foi aprendido sobre desenho por código.\n" +
                "\n" +
                "\uD83C\uDFAF O que foi feito\n" +
                "\n" +
                "Tela criada com createCanvas(600, 700) e fundo branco com background().\n" +
                "\n" +
                "noStroke() aplicado para remover contornos das formas.\n" +
                "\n" +
                "Base da pizza:\n" +
                "\n" +
                "Um arco grande com cor marrom-amarelada (borda).\n" +
                "\n" +
                "Outro arco interno mais claro (queijo).\n" +
                "\n" +
                "Fatia cortada: desenhada também com dois arcos nas mesmas posições da pizza inteira.\n" +
                "\n" +
                "Calabresas: círculos vermelhos posicionados pela pizza com circle().\n" +
                "\n" +
                "Temperos grandes (verdes): retângulos com rect() usando fill() verde escuro.\n" +
                "\n" +
                "Temperos finos: ao invés de retângulos inclinados, foram desenhadas linhas finas com stroke() e strokeWeight().\n" +
                "\n" +
                "Temperos vermelhos menores: marcados com pontos (point()) espessura 8 para dar destaque.\n" +
                "\n" +
                "\uD83D\uDCA1 Dicas importantes aprendidas no vídeo\n" +
                "\n" +
                "✔ Sempre desenhe de trás para frente: primeiro o fundo, depois a massa da pizza, depois os recheios.\n" +
                "✔ Use fill() antes de cada forma para garantir que a cor seja a certa.\n" +
                "✔ Use arc() para criar borda e queijo da pizza.\n" +
                "✔ Prefira círculos, arcos e retângulos — são as formas básicas mais úteis.\n" +
                "✔ Linhas com stroke() podem substituir retângulos inclinados.\n" +
                "✔ strokeWeight() define a espessura da linha ou ponto.\n" +
                "✔ noStroke() deve ser usado quando você não quer contorno nas formas.\n" ,
        destino_material = "",
        exercicioId = "VFC6aA7yMp"
    )
}