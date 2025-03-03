package br.com.fiap.quod.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.quod.R
import br.com.fiap.quod.ui.theme.FontPrincipal


@Composable
fun Biometria_Digital(navController: NavController) {
    var fingerprintScanning by remember { mutableStateOf(false) }

    if (fingerprintScanning) {
        SimularDigital(onClose = { fingerprintScanning = false })
    } else {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .background(Color.White)
                .padding(top = 20.dp)
        ) {
            //-----------------Início header
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.White)
            ) {
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
                            .padding(start = 25.dp)
                    )

                    Text(
                        text = "Biometria Digital",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 15.dp, top = 8.dp),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Start,
                        color = Color.White,
                        fontFamily = FontPrincipal
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .background(Color.White)
                ) {
                    Text(
                        text = "Precione botão da digital!",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(top = 10.dp),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        fontFamily = FontPrincipal
                    )
                    //-----------------Fim header

                    //-----------------Início Card
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFEEEEEE)),
                        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                        border = BorderStroke(width = 1.dp, color = Color.White),
                        modifier = Modifier
                            .height(250.dp)
                            .width(250.dp)
                            .background(Color.White)
                            .padding(top = 20.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icons8_biometria_100),
                            contentDescription = "Captura da digital",
                            modifier = Modifier
                                .size(220.dp)
                                .padding(10.dp)
                                .padding(start = 15.dp)
                        )
                    }
                }
                //-----------------Fim Card
                //-----------------Início Botões - Scanear Digital
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                            .background(Color.White)
                            .padding(10.dp)
                    ) {
                        Button(
                            onClick = { fingerprintScanning = true },
                            modifier = Modifier
                                .size(
                                    width = 220.dp,
                                    height = 50.dp
                                ),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Blue
                            )
                        ) {
                            Text(
                                text = "Scanear Digital",
                                fontSize = 22.sp,
                                fontFamily = FontPrincipal
                            )
                        }


//-----------------Início Botões - Simular Sucesso/ Simular Falha
                        Spacer(modifier = Modifier.height(60.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .background(Color.White)
                                .padding(5.dp)
                        ) {

                            Button(
                                onClick = {
                                    navController.navigate("ErroDigital")
                                },
                                modifier = Modifier
                                    .padding(end = 2.dp)
                                    .size(
                                        width = 200.dp,
                                        height = 45.dp
                                    ),
                                shape = RoundedCornerShape(12.dp),
                                border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFE0004C)
                                )
                            ) {
                                Text(
                                    text = "Simular Falha",
                                    fontSize = 18.sp,
                                    fontFamily = FontPrincipal
                                )
                            }
                            Button(
                                onClick = {
                                    navController.navigate("Analise_Documentos")
                                },
                                modifier = Modifier
                                    .padding(start = 2.dp)
                                    .size(
                                        width = 200.dp,
                                        height = 45.dp
                                    ),
                                shape = RoundedCornerShape(12.dp),
                                border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),

                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xCD16C400)
                                )
                            ) {
                                Text(
                                    text = "Simular Sucesso",
                                    fontSize = 18.sp,
                                    fontFamily = FontPrincipal
                                )
                            }
//-----------------Fim Botões - Simular Sucesso/ Simular Falha
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SimularDigital(onClose: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(800.dp)
        ){
            Spacer(modifier = Modifier.height(250.dp))
            Text(
                text = "Simulando leitura da digital...",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.height(250.dp))
            Button(
                onClick = onClose,
                modifier = Modifier
                    .padding(start = 5.dp)
                    .size(
                        width = 200.dp,
                        height = 45.dp
                    ),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE0004C)
                )
            ) {
                Text(text = "Fechar", color = Color.White)
            }
        }
    }
}
