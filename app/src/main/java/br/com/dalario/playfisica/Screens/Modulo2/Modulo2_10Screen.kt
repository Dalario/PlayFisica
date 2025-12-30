package br.com.dalario.playfisica.Screens.Modulo2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo2_10Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "FuQ3h0UJUIY",
        titulo= "Exercicio 10",
        cor_modulo = colorResource(R.color.modulo_2),
        descricao="O exercício consiste em criar uma paisagem e simular a queda livre de floquinhos de neve usando P5.js.\n" +
                "\n" +
                "\uD83C\uDFAF O que deve ser feito\n" +
                "\n" +
                "Desenhar o cenário: céu, chão, montanhas, árvores, casa, sol ou lua — como mostrado na imagem.\n" +
                "\n" +
                "Criar três fileiras de floquinhos de neve, usando círculos.\n" +
                "\n" +
                "Cada fileira representa várias bolinhas alinhadas descendo.\n" +
                "\n" +
                "Em vez de caírem com velocidade constante (MRU), elas caem com aceleração, representando a queda livre.\n" +
                "\n" +
                "\uD83C\uDF28\uFE0F Como o movimento funciona\n" +
                "\n" +
                "Cada fileira tem uma posição inicial diferente no eixo vertical (Y):\n" +
                "• A primeira já perto do topo da tela.\n" +
                "• A segunda começa mais acima, fora da tela.\n" +
                "• A terceira começa ainda mais distante, para dar o efeito de repetição.\n" +
                "\n" +
                "Todos os floquinhos aceleram conforme caem — ou seja, quanto mais tempo passa, mais rápido eles descem.\n" +
                "\n" +
                "Quando os floquinhos chegam perto do chão, param na altura certa, para não atravessarem a tela.\n" +
                "\n" +
                "\uD83E\uDDE0 Dicas importantes trabalhadas no vídeo\n" +
                "\n" +
                "Use variáveis separadas para a posição de cada fileira de neve.\n" +
                "\n" +
                "A velocidade é a mesma para todas, a diferença está só na posição inicial.\n" +
                "\n" +
                "Não é necessário criar cada floquinho individualmente — basta copiar a lógica da posição e alterar apenas o eixo X.\n" +
                "\n" +
                "A ideia pode ser adaptada depois para chuva, folhas caindo, estrelas, etc.\n" ,
        destino_material = "",
        exercicioId = "vModSHuUf",

        )
}