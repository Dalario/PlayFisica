package br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2

import android.app.Activity
import android.content.pm.ActivityInfo
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import br.com.dalario.playfisica.R

@Composable
fun Material2_6Screen(navController: NavController) {
    val activity = LocalActivity.current as Activity
    var scale by remember { mutableStateOf(1f) }
    var offset by remember { mutableStateOf(Offset.Zero) }

    //  Bloqueia para landscape quando o Composable abre
    DisposableEffect(Unit) {
        activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        onDispose {
            //  volta para retrato quando sair da tela
            activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        }
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black) // opcional, melhora contraste
        .pointerInput(Unit) {
            detectTransformGestures { _, pan, zoom, _ ->
                // Atualiza escala (zoom) e deslocamento (arraste)
                scale = (scale * zoom).coerceIn(1f, 5f) // limita o zoom entre 1x e 5x
                offset += pan
            }
        }

    ){
        Image(
            painter = painterResource(R.drawable.material2_6),
            contentDescription = "Material modulo 2 aula 6",
            modifier = Modifier.fillMaxSize()
                .graphicsLayer(
                    scaleX = scale,
                    scaleY = scale,
                    translationX = offset.x,
                    translationY = offset.y
                ),
            contentScale = ContentScale.Fit
        )

    }

}