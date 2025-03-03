package br.com.fiap.quod

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.quod.errosScreens.ErroAutCadastral
import br.com.fiap.quod.errosScreens.ErroDigital
import br.com.fiap.quod.errosScreens.ErroDocumento
import br.com.fiap.quod.errosScreens.ErroFacial
import br.com.fiap.quod.errosScreens.ErroSIMSWAP
import br.com.fiap.quod.errosScreens.ErroScore
import br.com.fiap.quod.screens.Analise_Documentos
import br.com.fiap.quod.screens.AutenticacaoCadastral
import br.com.fiap.quod.screens.Biometria_Digital
import br.com.fiap.quod.screens.Biometria_Facial
import br.com.fiap.quod.screens.Menu
import br.com.fiap.quod.screens.Resultados
import br.com.fiap.quod.screens.SIMSWAP
import br.com.fiap.quod.screens.ScoreAntifraude
import br.com.fiap.quod.screens.TelaInicial
import br.com.fiap.quod.ui.theme.QuODTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuODTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

//                    TelaInicial()
//                    Menu()
//                    Biometria_Facial()
//                    Biometria_Digital()
//                    Analise_Documentos()
//                    SIMSWAP()
//                    AutenticacaoCadastral()
//                    ScoreAntifraude()
//                    Resultados()



//                    ErroFacial()
//                    ErroDigital()
//                    ErroDocumento()
//                    ErroSIMSWAP()
//                    ErroAutCadastral()
//                    ErroScore()


                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "TelaInicial" ){
                        composable(route = "TelaInicial"){
                            TelaInicial(navController)
                        }

                        composable(route = "Menu"){
                            Menu(navController)
                        }
                        composable(route = "Biometria_Facial"){
                            Biometria_Facial(navController)
                        }
                        composable(route = "Biometria_Digital"){
                            Biometria_Digital(navController)
                        }
                        composable(route = "Analise_Documentos"){
                            Analise_Documentos(navController)
                        }
                        composable(route = "SIMSWAP"){
                            SIMSWAP(navController)
                        }

                        composable(route = "AutenticacaoCadastral"){
                            AutenticacaoCadastral(navController)
                        }
                        composable(route = "ScoreAntifraude"){
                            ScoreAntifraude(navController)
                        }
                        composable(route = "Resultados"){
                            Resultados(navController)
                        }

// ---------------------Telas simulação de erro-----------------------------------------------------
                        composable(route = "ErroFacial"){
                            ErroFacial(navController)
                        }
                        composable(route = "ErroDigital"){
                            ErroDigital(navController)
                        }
                        composable(route = "ErroDocumento"){
                            ErroDocumento(navController)
                        }
                        composable(route = "ErroSIMSWAP"){
                            ErroSIMSWAP(navController)
                        }
                        composable(route = "ErroAutCadastral"){
                            ErroAutCadastral(navController)
                        }
                        composable(route = "ErroScore"){
                            ErroScore(navController)
                        }

                    }

                }
            }
        }
    }
}

