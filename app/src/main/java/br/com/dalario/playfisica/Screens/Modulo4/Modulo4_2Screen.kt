package br.com.dalario.playfisica.Screens.Modulo4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo4_2Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "B0VSgCvfVu4",
        titulo= "Aplicação MouseX e MouseY",
        cor_modulo = colorResource(R.color.modulo_4),
        descricao="Neste vídeo, mostramos como transformar as coordenadas do cursor em ferramentas interativas para simulações de física. As variáveis mouseX e mouseY vão muito além de apenas desenhar na tela.\n" +
                "\n" +
                "Principais usos práticos:\n" +
                "Manipulação de Variáveis: Usar a posição horizontal (mouseX) para alterar em tempo real a massa ou a velocidade de um objeto.\n" +
                "\n" +
                "Sensores Visuais: Criar áreas de colisão ou gatilhos que ativam eventos quando o mouse passa por cima de um componente do gráfico.\n" +
                "\n" +
                "Criação de Vetores: Definir a direção e o sentido de forças (como gravidade ou empuxo) baseando-se na distância entre o objeto e o cursor.\n" +
                "\n" +
                "Leitura de Dados: Mapear os eixos do canvas para converter pixels em unidades físicas (metros, segundos, Newtons), permitindo que o usuário explore gráficos de forma dinâmica.\n" ,
        destino_material = "material4_2",
        exercicioId = ""
    )
}