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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.quod.R
import br.com.fiap.quod.calcularResultadoCPF
import br.com.fiap.quod.ui.theme.FontPrincipal


@Composable
fun ScoreAntifraude(navController: NavController) {
    var CPFAntifraude by remember {
        mutableStateOf("")
    }

    var ResultadoCPF by remember {
        mutableStateOf("Resultado Score")
    }

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
                    text = "Score Antifraude",
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
                    .height(320.dp)
                    .background(Color.White)
            ) {
                //-----------------Fim header
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEEEEEE)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .height(180.dp)
                        .width(180.dp)
                        .background(Color.White)
                        .padding(20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icons8_grafico_96),
                        contentDescription = "Verificação score",
                        modifier = Modifier
                            .size(180.dp)
                            .padding(10.dp)
                    )
                }
                //-----------------Início Card
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEEEEEE)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .height(100.dp)
                        .width(350.dp)
                        .background(Color.White)
                        .padding(top = 20.dp)

                ) {
                    Text(
                        text = ResultadoCPF,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontPrincipal,
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            //-----------------Fim Card
            //-----------------Início Inserção CPF

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(Color.White)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(10.dp)
                ) {
                    OutlinedTextField(
                        value = CPFAntifraude,
                        onValueChange = {
                            CPFAntifraude = it
                        },
                        singleLine = true,
                        modifier = Modifier,
                        label = {
                            Text(
                                text = "Insira CPF",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal,
                                color = Color.Black
                            )
                        },
                        placeholder = {
                            Text(text = "000.000.000-00")
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedTextColor = Color(0xDA4F7BFF),
                            focusedBorderColor = Color(0xDA4F7BFF),
                            unfocusedContainerColor = Color(0xDAECECEE),
                            unfocusedTextColor = Color.Gray,
                            unfocusedBorderColor = Color(0xDA4F7BFF),
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number
                        ),
                        textStyle = TextStyle(
                            fontSize = 20.sp,
                        ),
                    )

                    Spacer(modifier = Modifier.height(25.dp))
                    Button(
                        onClick = {
                            ResultadoCPF = calcularResultadoCPF(CPFAntifraude)
                        },
                        modifier = Modifier

                            .size(
                                width = 200.dp,
                                height = 55.dp
                            ),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xDA0031C4)
                        )
                    ) {
                        Text(
                            text = "Verificar CPF",
                            fontSize = 20.sp,
                            fontFamily = FontPrincipal
                        )
                    }
                }
                //-----------------Início Botões - Simular Sucesso/ Simular Falha
                Spacer(modifier = Modifier.height(60.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(Color.White)
                        .padding(10.dp)
                ) {

                    Button(
                        onClick = {
                            navController.navigate("ErroScore")
                        },
                        modifier = Modifier
                            .size(
                                width = 200.dp,
                                height = 45.dp
                            ),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE0004C)
                        )
                    ) {
                        Text(
                            text = "Simular Falha",
                            fontSize = 20.sp,
                            fontFamily = FontPrincipal
                        )
                    }
                    Button(
                        onClick = {
                            navController.navigate("Resultados")
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
                            fontSize = 20.sp,
                            fontFamily = FontPrincipal
                        )
                    }
//-----------------Fim Botões - Simular Sucesso/ Simular Falha
                }
            }
        }
    }
}


