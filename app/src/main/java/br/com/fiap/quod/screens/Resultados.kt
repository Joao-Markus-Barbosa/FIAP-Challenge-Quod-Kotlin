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
fun Resultados(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(Color.White)
            .padding(top = 20.dp)
    )
    {
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
                    text = "  Resultado",
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
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(410.dp)
                    .background(Color.White)
            ) {
                Text(
                    text = "Parabéns!",
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
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEEEEEE)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .height(300.dp)
                        .width(370.dp)
                        .background(Color.White)
                        .padding(top = 20.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {

                            Text(
                                text = "Conclusão de todos os requisitos",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(40.dp)
                                    .padding(top = 10.dp),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                color = Color.Black,
                                fontFamily = FontPrincipal

                            )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = " - Biometria Facial",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(35.dp)
                                .padding(top = 10.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            fontFamily = FontPrincipal
                        )
                        Text(
                            text = " - Biometria Digital",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(35.dp)
                                .padding(top = 10.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            fontFamily = FontPrincipal
                        )
                        Text(
                            text = " - Análise de Documentos",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(35.dp)
                                .padding(top = 10.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            fontFamily = FontPrincipal
                        )
                        Text(
                            text = " - SIM SWAP",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(35.dp)
                                .padding(top = 10.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            fontFamily = FontPrincipal
                        )
                        Text(
                            text = " - Autenticação Cadastral",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(35.dp)
                                .padding(top = 10.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            fontFamily = FontPrincipal
                        )
                        Text(
                            text = " - Score Antifraude",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(35.dp)
                                .padding(top = 10.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            fontFamily = FontPrincipal
                        )

                    }


                }
            }
//-----------------Fim Card



//-----------------Início Botão
                Spacer(modifier = Modifier.height(60.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(Color.White)
                        .padding(5.dp)
                ) {


                    Button(
                        onClick = {
                            navController.navigate("TelaInicial")
                        },
                        modifier = Modifier
                            .size(
                                width = 270.dp,
                                height = 55.dp
                            ),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),

                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xCD16C400)
                        )
                    ) {
                        Text(
                            text = "Terminar Simulação",
                            fontSize = 25.sp,
                            fontFamily = FontPrincipal
                        )
                    }
//-----------------Fim Botão
                }

        }
    }
}