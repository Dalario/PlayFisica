package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_5Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "av28aDGlpfU",
        titulo= "Comando Random",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Aprenda a gerar valores aleatórios para simular a imprevisibilidade da natureza no seu código.\n" +
                "Use o random() para criar nuvens de partículas, faíscas ou variações em experiências reais.\n" +
                "Define intervalos específicos para que o \"caos\" seja controlado e útil para a sua lógica física.\n" +
                "É fundamental para testar a resistência de sistemas e criar cenários que nunca se repetem.\n" +
                "Dê vida aos seus projetos adicionando diversidade visual e comportamental em cada execução.\n" ,
        destino_material = "material4_5",
        exercicioId = ""
    )
}