package br.com.fiap.quod.errosScreens


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
fun ErroDigital(navController: NavController) {
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
                    .height(400.dp)
                    .background(Color.White)
            ) {

//-----------------Fim header

//-----------------Início Card
                Spacer(modifier = Modifier.height(40.dp))
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEEEEEE)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .height(180.dp)
                        .width(180.dp)
                        .background(Color.White)
                        .padding(top = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icons8_erro_80),
                        contentDescription = "Alerta",
                        modifier = Modifier
                            .size(160.dp)
//                            .padding(10.dp)
                            .padding(start = 15.dp)
                    )
                }
                Text(
                    text = "Infelizmente houve um erro ao scanear sua digital, tente novamente ou retorne ao menu!",
                    modifier = Modifier
                        .fillMaxWidth()
//                        .height(70.dp)
                        .padding(top = 10.dp)
                        .padding(20.dp),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    fontFamily = FontPrincipal

                )
            }
//-----------------Fim Card
//-----------------Início Botões

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(Color.White)
                        .padding(10.dp)
                ) {
                    Button(
                        onClick = {
                            navController.navigate("Biometria_Digital")
                        },
                        modifier = Modifier
                            .size(
                                width = 220.dp,
                                height = 45.dp
                            ),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),

                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF00D103)
                        )
                    ) {
                        Text(
                            text = "Tentar Novamente",
                            fontSize = 20.sp,
                            fontFamily = FontPrincipal
                        )
                    }

                    Button(
                        onClick = {
                            navController.navigate("Menu")
                        },
                        modifier = Modifier
                            .padding(15.dp)
                            .size(width = 220.dp, height = 45.dp),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(width = 1.dp, Color.White),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFE0004C)
                        )
                    ) {
                        Text(
                            text = "Retornar ao Menu",
                            fontSize = 20.sp,
                            fontFamily = FontPrincipal
                        )
                    }
//-----------------FIM Botões
                }
            }
    }
}