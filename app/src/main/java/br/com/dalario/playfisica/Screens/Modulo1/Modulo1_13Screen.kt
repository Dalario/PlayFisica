package br.com.dalario.playfisica.Screens.Modulo1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo1_13Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "sEcHzCbO780",
        titulo= "Exercício 5",
        cor_modulo = colorResource(R.color.modulo_1),
        descricao="O vídeo mostra como desenhar um porquinho no P5.js, usando formas básicas como retângulos, círculos e elipses, além de explorar cores, camadas e contornos.\n" +
                "\n" +
                "\uD83C\uDFAF O que foi feito\n" +
                "\n" +
                "Plano de fundo: cor verde clara criada ajustando valores de fill() ou background(r, g, b).\n" +
                "\n" +
                "Construção por camadas: sempre do que está mais ao fundo para o que está na frente, na ordem:\n" +
                "\n" +
                "Background\n" +
                "\n" +
                "Pernas e pés\n" +
                "\n" +
                "Corpo (elipse)\n" +
                "\n" +
                "Orelhas\n" +
                "\n" +
                "Cabeça\n" +
                "\n" +
                "Olhos\n" +
                "\n" +
                "Focinho, narinas e boca\n" +
                "\n" +
                "Formas usadas:\n" +
                "\n" +
                "rect() para pernas e pés\n" +
                "\n" +
                "ellipse() para corpo, focinho e boca\n" +
                "\n" +
                "circle() para olhos e narinas\n" +
                "\n" +
                "Cores:\n" +
                "\n" +
                "Rosa do porquinho definida com fill(r, g, b).\n" +
                "\n" +
                "Preto para olhos, pés e narinas.\n" +
                "\n" +
                "Fundo em verde claro ajustando os valores de verde e azul.\n" +
                "\n" +
                "Semielipse da boca: criada com uma ellipse() e, por cima, um rect() com a cor do porquinho para “esconder” metade da elipse.\n" +
                "\n" +
                "Sobre contornos:\n" +
                "\n" +
                "noStroke() remove o contorno de todas as formas.\n" +
                "\n" +
                "stroke(1) foi colocado no início para garantir que todas as formas tivessem contorno padrão, e só remover onde necessário.\n" +
                "\n" +
                "\uD83D\uDCA1 Dicas importantes\n" +
                "\n" +
                "✔ Sempre desenhe de trás para frente (fundo → detalhes).\n" +
                "✔ Se uma cor sair errada, lembre que o fill() permanece ativo até você trocar.\n" +
                "✔ Use stroke() e noStroke() com atenção, pois eles afetam tudo o que vem depois.\n" +
                "✔ Para clarear uma cor, aumente os valores de RGB, principalmente o último parâmetro.\n" +
                "✔ A boca pode ser feita com elipse + retângulo para esconder a metade.\n" ,
        destino_material = "",
        exercicioId = "xVlIMeu5d"
    )
}