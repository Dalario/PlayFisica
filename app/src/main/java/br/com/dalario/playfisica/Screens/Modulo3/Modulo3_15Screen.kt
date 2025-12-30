package br.com.dalario.playfisica.Screens.Modulo3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.Componentes.Conteudos
import br.com.dalario.playfisica.R

@Composable
fun Modulo3_15Screen (modifier: Modifier = Modifier, navController: NavController) {
    Conteudos(
        navController = navController,
        videoId= "P9pfxZaJExI",
        titulo= "Momento Linear",
        cor_modulo = colorResource(R.color.modulo_3),
        descricao="Momento linear é a quantidade de movimento que um corpo possui. Ele mostra o quanto é difícil parar ou mudar o movimento de um objeto. É calculado multiplicando a massa pela velocidade.\n" +
                "\n" +
                "Exemplo: um caminhão e uma bicicleta andando a 20 km/h. O caminhão tem muito mais massa, então tem mais momento linear e é mais difícil de parar. Outro exemplo é a bala de arma e a bola de futebol. A bala tem pouca massa, mas uma velocidade enorme, por isso o momento linear dela é grande e ela consegue perfurar objetos.\n" +
                "\n" +
                "O momento linear pode ser entendido como a força do movimento.\n" +
                "\n" +
                "Em uma colisão sem forças externas, como atrito ou empurrões, o momento linear total antes da colisão é igual ao momento linear total depois da colisão. O que um corpo perde de movimento, o outro ganha. Por isso dizemos que o momento linear se conserva.\n" +
                "\n" +
                "Mas conservar o momento não significa conservar a energia. Pode existir perda de energia em forma de calor, som ou deformação. Para saber quanto da velocidade é recuperada após a batida, usamos o coeficiente de restituição. Ele indica a fração da velocidade que volta depois da colisão.\n" +
                "\n" +
                "Se o coeficiente de restituição é 1, a colisão é perfeitamente elástica e não há perda de energia. Se está entre 0 e 1, é parcialmente elástica e parte da energia é perdida. Se é 0, os corpos se grudam depois do impacto, colisão inelástica.\n" +
                "\n" +
                "Juntando a conservação do momento linear com o coeficiente de restituição, conseguimos calcular a velocidade dos dois corpos depois de uma colisão entre eles. Isso é importante porque agora não estamos mais falando de colisão com parede ou chão, e sim de dois objetos que podem se mover depois de se chocarem.\n" ,
        destino_material = "material3_15",
        exercicioId = ""
    )
}