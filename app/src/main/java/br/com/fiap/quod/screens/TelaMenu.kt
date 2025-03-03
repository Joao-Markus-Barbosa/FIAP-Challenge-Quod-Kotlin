package br.com.fiap.quod.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.quod.R
import br.com.fiap.quod.ui.theme.FontPrincipal

@Composable
fun Menu(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(Color.White)
            .padding(top = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.Black)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.simbolo_quod),
                    contentDescription = "Simbolo",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(start = 20.dp)
                )

                Text(
                    text = "Fluxos de Autenticação",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(30.dp)
                        .padding(start = 15.dp, top = 8.dp),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    color = Color.White,
                    fontFamily = FontPrincipal

                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .background(Color.White)
                    .padding(start = 10.dp, end = 10.dp)
            ) {
//---------------------Início Biometria Facial
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xF5A3A3A3)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp)
                        .background(Color.White)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icons8_leitura_reconhecimento_facial_100),
                            contentDescription = "Biometria Facial",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Biometria Facial",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontFamily = FontPrincipal
                        )
                        Button(
                            onClick = {
                    navController.navigate("Biometria_Facial")
                            },
                            modifier = Modifier
                                .size(width = 120.dp, height = 38.dp),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xCD12B900)
                            )
                        ) {
                            Text(
                                text = "Realizar",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal
                            )
                        }
                    }
                }
//-----------------------FIM Biometria Facial

// ---------------------Início Biometria Digital
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xF5A3A3A3)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp)
                        .background(Color.White)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icons8_biometria_100),
                            contentDescription = "Biometria Digital",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Biometria Digital",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontFamily = FontPrincipal
                        )
                        Button(
                            onClick = {
                    navController.navigate("Biometria_Digital")
                            },
                            modifier = Modifier
                                .size(width = 120.dp, height = 38.dp),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xCD12B900)
                            )
                        ) {
                            Text(
                                text = "Realizar",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal
                            )
                        }
                    }

                }
                //---------------------Fim Biometria Facial

            }

            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .background(Color.White)
                    .padding(start = 10.dp, end = 10.dp)

            ) {

//---------------------Início Análise de documentos (Documentoscopia)
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xF5A3A3A3)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp)
                        .background(Color.White)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ididentitycarddriverlicense_109689),
                            contentDescription = "Análise de documento (Documentoscopia)",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Anál. Documentos",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontFamily = FontPrincipal
                        )
                        Button(
                            onClick = {
                    navController.navigate("Analise_Documentos")
                            },
                            modifier = Modifier
                                .size(width = 120.dp, height = 38.dp),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xCD12B900)
                            )
                        ) {
                            Text(
                                text = "Realizar",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal
                            )
                        }
                    }

                }
//---------------------FIM Análise de documento (Documentoscopia)

//-------------------- Inicio SIM SWAP
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xF5A3A3A3)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp)
                        .background(Color.White)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icons8_chip_cartao_sim_100),
                            contentDescription = "Análise SIM SWAP",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Anál. SIM SWAP",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontFamily = FontPrincipal
                        )
                        Button(
                            onClick = {
                    navController.navigate("SIMSWAP")
                            },
                            modifier = Modifier
                                .size(width = 120.dp, height = 38.dp),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),

                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xCD12B900)
                            )
                        ) {
                            Text(
                                text = "Realizar",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal
                            )
                        }
                    }
                }

            }
//-------------------- FIM SIM SWAP
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .background(Color.White)
                    .padding(start = 10.dp, end = 10.dp)

            ) {
//------------------- Início Autenticação Cadastral
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xF5A3A3A3)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp)
                        .background(Color.White)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(top = 10.dp)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icons8_documentos_100),
                            contentDescription = "Autenticação Cadastral",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Authn. Cadastral",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontFamily = FontPrincipal
                        )
                        Button(
                            onClick = {
                    navController.navigate("AutenticacaoCadastral")
                            },
                            modifier = Modifier
                                .size(width = 120.dp, height = 38.dp),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xCD12B900)
                            )
                        ) {
                            Text(
                                text = "Realizar",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal
                            )
                        }
                    }
                }
//---------------------- FIM  Autenticação CadastraL

//------------------------ Início Score Antifraude
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xF5A3A3A3)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp)
                        .background(Color.White)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icons8_grafico_96),
                            contentDescription = "Score Antifraude",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Score Antifraude",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontFamily = FontPrincipal
                        )
                        Button(
                            onClick = {
                    navController.navigate("ScoreAntifraude")
                            },
                            modifier = Modifier
                                .size(width = 120.dp, height = 38.dp),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),

                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xCD12B900)
                            )
                        ) {
                            Text(
                                text = "Realizar",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal
                            )
                        }
                    }
                }
//------------------------ FIM Score Antifraude

            }


        }
    }

}
