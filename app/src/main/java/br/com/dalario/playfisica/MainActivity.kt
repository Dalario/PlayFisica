package br.com.dalario.playfisica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.dalario.playfisica.Componentes.QuizScreen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_10Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_11Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_14Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_15Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_17Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_1Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_2Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_3Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_4Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_6Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo1.Material1_8Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_11Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_13Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_15Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_17Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_1Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_2Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_3Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_4Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_6Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_7Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo2.Material2_9Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_12Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_13Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_15Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_1Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_3Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_5Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_6Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_7Screen
import br.com.dalario.playfisica.MateriaisScreens.MateriaisModulo3.Material3_9Screen
import br.com.dalario.playfisica.Screens.CadastroScreen
import br.com.dalario.playfisica.Screens.ConfiguracoesScreen
import br.com.dalario.playfisica.Screens.HomeScreen
import br.com.dalario.playfisica.Screens.LoginScreen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_10Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_11Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_12Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_13Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_14Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_15Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_16Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_17Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_1Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_2Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_3Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_4Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_5Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_6Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_7Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_8Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_9Screen
import br.com.dalario.playfisica.Screens.Modulo1.Modulo1_Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_10Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_11Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_12Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_13Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_14Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_15Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_16Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_17Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_1Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_2Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_3Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_4Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_5Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_6Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_7Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_8Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_9Screen
import br.com.dalario.playfisica.Screens.Modulo2.Modulo2_Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_10Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_11Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_12Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_13Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_14Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_15Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_16Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_1Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_2Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_3Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_4Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_5Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_6Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_7Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_8Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_9Screen
import br.com.dalario.playfisica.Screens.Modulo3.Modulo3_Screen
import br.com.dalario.playfisica.Screens.ModulosScreen
import br.com.dalario.playfisica.Screens.QuizzesScreen
import br.com.dalario.playfisica.ui.theme.PlayFisicaTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.firebase.auth.FirebaseAuth


@Suppress("DEPRECATION")
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        val usuarioAtual = FirebaseAuth.getInstance().currentUser
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
      //  WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            PlayFisicaTheme {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute= navBackStackEntry?.destination?.route
                val hideBottomBarRoutes = listOf("cadastro", "login")
                var inicio = ""
                if(usuarioAtual != null){
                    inicio = "home"
                }
                else {
                    inicio = "login"
                }

                Scaffold(modifier = Modifier.fillMaxSize(),
                    bottomBar = {if(currentRoute !in hideBottomBarRoutes){BottomBar(navController)}},
                    containerColor = Color.Transparent,          //Pra deixar o fundo trasnparente
                    contentWindowInsets = WindowInsets(0)   //Dizer que não quero espaço reservado para status barnem para navigation
                ) {innerPadding ->
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = inicio,
                        modifier = Modifier.padding(innerPadding)
                    ){
                        composable(
                            route = "cadastro",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  { CadastroScreen(navController = navController)}

                        composable(
                            route = "login",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  { LoginScreen(navController = navController)}

                        composable(
                            route = "quizzes",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {QuizzesScreen(navController = navController) }

                        composable(
                            route = "quiz",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {QuizScreen(navController = navController) }

                        composable(
                            route = "home",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {HomeScreen(navController)}
                        composable(
                            route = "configuracoes",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {ConfiguracoesScreen(navController = navController)}

                        composable(route = "modulos",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {ModulosScreen(navController)}

                        composable(
                            route = "modulo1",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_Screen(navController)}

                        composable(
                            route = "modulo1_1",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_1Screen(navController= navController)}

                        composable(
                            route = "modulo1_2",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_2Screen(navController = navController)}

                        composable(
                            route = "modulo1_3",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_3Screen(navController = navController)}

                        composable(
                            route = "modulo1_4",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_4Screen(navController=navController)}

                        composable(
                            route = "modulo1_5",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_5Screen(navController= navController)}

                        composable(
                            route = "modulo1_6",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_6Screen(navController= navController)}

                        composable(
                            route = "modulo1_7",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_7Screen(navController= navController)}

                        composable(
                            route = "modulo1_8",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_8Screen(navController= navController)}

                        composable(
                            route = "modulo1_9",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_9Screen(navController= navController)}

                        composable(
                            route = "modulo1_10",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_10Screen(navController= navController)}

                        composable(
                            route = "modulo1_11",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_11Screen(navController= navController)}

                        composable(
                            route = "modulo1_12",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_12Screen(navController= navController)}

                        composable(
                            route = "modulo1_13",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_13Screen(navController= navController)}

                        composable(
                            route = "modulo1_14",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_14Screen(navController= navController)}

                        composable(
                            route = "modulo1_15",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_15Screen(navController= navController)}

                        composable(
                            route = "modulo1_16",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_16Screen(navController= navController)}

                        composable(
                            route = "modulo1_17",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo1_17Screen(navController= navController)}

                        composable(
                            route = "material1_1",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_1Screen(navController= navController)}

                        composable(
                            route = "material1_2",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_2Screen(navController= navController)}

                        composable(
                            route = "material1_3",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_3Screen(navController= navController)}

                        composable(
                            route = "material1_4",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_4Screen(navController= navController)}

                        composable(
                            route = "material1_6",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_6Screen(navController= navController)}


                        composable(
                            route = "material1_8",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_8Screen(navController= navController)}


                        composable(
                            route = "material1_10",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_10Screen(navController= navController)}

                        composable(
                            route = "material1_11",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_11Screen(navController= navController)}





                        composable(
                            route = "material1_14",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_14Screen(navController= navController)}

                        composable(
                            route = "material1_15",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_15Screen(navController= navController)}



                        composable(
                            route = "material1_17",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material1_17Screen(navController= navController)}



                        composable(
                            route = "modulo2",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_Screen(navController)}

                        composable(
                            route = "modulo2_1",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_1Screen(navController = navController)}

                        composable(
                            route = "modulo2_2",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_2Screen(navController = navController)}

                        composable(
                            route = "modulo2_3",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_3Screen(navController = navController)}

                        composable(
                            route = "modulo2_4",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_4Screen(navController = navController)}

                        composable(
                            route = "modulo2_5",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_5Screen(navController = navController)}

                        composable(
                            route = "modulo2_6",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_6Screen(navController = navController)}

                        composable(
                            route = "modulo2_7",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_7Screen(navController = navController)}

                        composable(
                            route = "modulo2_8",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_8Screen(navController = navController)}


                        composable(
                            route = "modulo2_9",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_9Screen(navController = navController)}

                        composable(
                            route = "modulo2_10",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_10Screen(navController = navController)}

                        composable(
                            route = "modulo2_11",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_11Screen(navController = navController)}

                        composable(
                            route = "modulo2_12",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_12Screen(navController = navController)}


                        composable(
                            route = "modulo2_13",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_13Screen(navController = navController)}

                        composable(
                            route = "modulo2_14",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_14Screen(navController = navController)}

                        composable(
                            route = "modulo2_15",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_15Screen(navController = navController)}

                        composable(
                            route = "modulo2_16",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_16Screen(navController = navController)}

                        composable(
                            route = "modulo2_17",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Modulo2_17Screen(navController = navController)}

                        composable(
                            route = "material2_1",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_1Screen(navController= navController)}

                        composable(
                            route = "material2_2",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_2Screen(navController= navController)}

                        composable(
                            route = "material2_3",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_3Screen(navController= navController)}

                        composable(
                            route = "material2_4",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_4Screen(navController= navController)}


                        composable(
                            route = "material2_6",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_6Screen(navController= navController)}

                        composable(
                            route = "material2_7",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_7Screen(navController= navController)}


                        composable(
                            route = "material2_9",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_9Screen(navController= navController)}

                        composable(
                            route = "material2_11",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_11Screen(navController= navController)}


                        composable(
                            route = "material2_13",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_13Screen(navController= navController)}


                        composable(
                            route = "material2_15",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_15Screen(navController= navController)}



                        composable(
                            route = "material2_17",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            }

                        )  {Material2_17Screen(navController= navController)}

                        composable(route = "modulo3",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        { Modulo3_Screen(navController) }

                        composable(route = "modulo3_1",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        { Modulo3_1Screen(navController) }

                        composable(route = "modulo3_2",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_2Screen(navController= navController) }

                        composable(route = "modulo3_3",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        { Modulo3_3Screen(navController) }

                        composable(route = "modulo3_4",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_4Screen(navController= navController) }

                        composable(route = "modulo3_5",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_5Screen(navController= navController) }

                        composable(route = "modulo3_6",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_6Screen(navController= navController) }

                        composable(route = "modulo3_7",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_7Screen(navController= navController) }

                        composable(route = "modulo3_8",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_8Screen(navController= navController) }

                        composable(route = "modulo3_9",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_9Screen(navController= navController) }

                        composable(route = "modulo3_10",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_10Screen(navController= navController) }

                        composable(route = "modulo3_11",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_11Screen(navController= navController) }

                        composable(route = "modulo3_12",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_12Screen(navController= navController) }

                        composable(route = "modulo3_13",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_13Screen(navController= navController) }

                        composable(route = "modulo3_14",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_14Screen(navController= navController) }

                        composable(route = "modulo3_15",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_15Screen(navController= navController) }

                        composable(route = "modulo3_16",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        {Modulo3_16Screen(navController= navController) }

                        composable(route = "material3_1",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })
                        { Material3_1Screen(navController) }

                        composable(route = "material3_3",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                            { Material3_3Screen(navController) }

                        composable(route = "material3_5",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                        { Material3_5Screen(navController)}

                        composable(route = "material3_6",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                        { Material3_6Screen(navController)}

                        composable(route = "material3_7",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                        { Material3_7Screen(navController)}

                        composable(route = "material3_9",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                        { Material3_9Screen(navController)}

                        composable(route = "material3_12",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                        { Material3_12Screen(navController)}

                        composable(route = "material3_13",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                        { Material3_13Screen(navController)}

                        composable(route = "material3_15",
                            enterTransition = {
                                slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
                            },
                            exitTransition = {
                                slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
                            },
                            popEnterTransition = {
                                slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
                            },
                            popExitTransition = {
                                slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
                            })

                        { Material3_15Screen(navController)}

                    }

                }
            }
        }
    }
}


