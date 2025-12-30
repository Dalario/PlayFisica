package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_12Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "1FsY61SGVoo",
        titulo= "Formas de Energia",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Nesta aula, o professor faz uma revisão geral das principais formas de energia estudadas na mecânica, preparando o aluno para entender o próximo conteúdo: colisões.\n" +
                "\n" +
                "Ele explica que não se trata de energia elétrica, mas sim das energias presentes no movimento e no armazenamento de sistemas físicos. A aula segue explicando, de forma simples, os seguintes conceitos:\n" +
                "\n" +
                "⚙\uFE0F 1. Trabalho (W)\n" +
                "\n" +
                "É a energia transferida por uma força que provoca deslocamento.\n" +
                "\n" +
                "Fórmula básica: Trabalho = Força × Deslocamento.\n" +
                "\n" +
                "\uD83C\uDFC3 2. Energia Cinética (Ec)\n" +
                "\n" +
                "Energia que um corpo possui por estar em movimento.\n" +
                "\n" +
                "Quanto maior a massa e a velocidade, maior a energia cinética.\n" +
                "\n" +
                "Fórmula: Ec = m·v² / 2.\n" +
                "\n" +
                "\uD83C\uDFD4\uFE0F 3. Energia Potencial Gravitacional (Epg)\n" +
                "\n" +
                "Energia armazenada pela altura de um corpo.\n" +
                "\n" +
                "Fórmula: Epg = m·g·h.\n" +
                "\n" +
                "Quanto mais alto o corpo estiver, mais energia ele guarda.\n" +
                "\n" +
                "\uD83C\uDF00 4. Energia Potencial Elástica (Epe)\n" +
                "\n" +
                "Energia armazenada em objetos elásticos, como molas, arcos ou estilingues.\n" +
                "\n" +
                "Aumenta quando o objeto é esticado ou comprimido.\n" +
                "\n" +
                "Fórmula: Fel = –k·x, onde k é a constante elástica e x é a deformação.\n" +
                "\n" +
                "\uD83D\uDD04 5. Energia Mecânica (Em)\n" +
                "\n" +
                "Soma de todas as energias mecânicas de um sistema:\n" +
                "Em = Ec + Epg + Epe\n" +
                "\n" +
                "No mundo ideal (sem atrito nem ar), a energia mecânica se conserva.\n" +
                "\n" +
                "\uD83C\uDFA2 Exemplo explicado no vídeo:\n" +
                "\n" +
                "Um carrinho no topo de uma rampa tem apenas energia potencial.\n" +
                "\n" +
                "Conforme desce, essa energia vira energia cinética.\n" +
                "\n" +
                "Ao comprimir uma mola no final, essa energia vira energia potencial elástica.\n" +
                "\n" +
                "No mundo ideal: Em(início) = Em(fim).\n" ,
        destino_material = "material3_12",
        exercicioId = ""
    )
}