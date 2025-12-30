package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_9Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "UIeMNLA02PM",
        titulo= "Tração e Força Elástica",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Nesta aula, aprendemos dois tipos importantes de forças: tensão (ou tração) e força elástica.\n" +
                "\n" +
                "\uD83D\uDD39 1. O que é Tensão ou Tração?\n" +
                "\n" +
                "A tração é a força transmitida através de um material esticado, como cordas, cabos, fios ou correntes.\n" +
                "Ela aparece quando esses materiais estão esticados e servem para puxar ou transmitir força entre corpos.\n" +
                "\n" +
                "\uD83D\uDCCC Exemplo mostrado na aula:\n" +
                "Dois blocos estão presos por uma corda que passa por uma polia.\n" +
                "Sobre cada bloco atuam:\n" +
                "\n" +
                "Peso (P = m·g) para baixo;\n" +
                "\n" +
                "Tração (T) para cima.\n" +
                "\n" +
                "Se os blocos estão parados (em equilíbrio):\n" +
                "\n" +
                "A tração é igual ao peso: T = P,\n" +
                "\n" +
                "Isso só acontece se os dois blocos tiverem a mesma massa, porque assim o peso de um não “vence” o outro.\n" +
                "\n" +
                "Se um dos blocos for mais pesado:\n" +
                "\n" +
                "Eles começam a se mover;\n" +
                "\n" +
                "A tração deixa de ser igual ao peso;\n" +
                "\n" +
                "Usa-se a 2ª Lei de Newton: P – T = m·a para cada bloco.\n" +
                "\n" +
                "Esse exemplo é importante porque será simulado no próximo vídeo (exercício).\n" +
                "\n" +
                "\uD83D\uDD39 2. O que é Força Elástica?\n" +
                "\n" +
                "A força elástica é a força que uma mola (ou material elástico) faz para voltar à forma original quando é esticada ou comprimida.\n" +
                "\n" +
                "\uD83D\uDCCC Ela é explicada pela Lei de Hooke:\n" +
                "\n" +
                "Fel = –k·x\n" +
                "\n" +
                "Símbolo\tSignificado\n" +
                "Fel\tForça elástica (força da mola)\n" +
                "k\tConstante elástica da mola (rigidez)\n" +
                "x\tDeformação da mola (esticada ou comprimida)\n" +
                "–\tMostra que a força é sempre contrária à deformação\n" +
                "\n" +
                "\uD83D\uDC49 Se você estica a mola (x positivo), a força puxa de volta (Fel negativo).\n" +
                "\uD83D\uDC49 Se você comprime a mola (x negativo), a força empurra para fora (Fel positivo).\n" ,
        destino_material = "material3_9",
        exercicioId = ""
    )
}