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
import br.com.fiap.quod.ui.theme.FontPrincipal


@Composable
fun AutenticacaoCadastral(navController: NavController) {
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
                    text = "Autenticação Cadastral",
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
                    .height(110.dp)
                    .background(Color.White)
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEEEEEE)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .background(Color.White)
                        .padding(top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icons8_documentos_100),
                        contentDescription = "Autenticação cadastral",
                        modifier = Modifier
                            .size(220.dp)
                            .padding(10.dp)
                    )
                }
            }
//-----------------Fim Card
//-----------------Início Inserção de dados do usuário
            var nome by remember {
                mutableStateOf("")
            }

            var cpf by remember {
                mutableStateOf("")
            }

            var cep by remember {
                mutableStateOf("")
            }

            var nResidencia by remember {
                mutableStateOf("")
            }

            var email by remember {
                mutableStateOf("")
            }

            var numeroTelefone by remember {
                mutableStateOf("")
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(420.dp)
                        .background(color = Color.White)
                        .padding(15.dp)
                ) {
//----------------------Início nome do usuário
                    OutlinedTextField(

                        value = nome,
                        onValueChange = { nomeDigitado ->
                            nome = nomeDigitado
                        },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = "NOME",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal,
                                color = Color.Black
                            )
                        },
                        placeholder =
                        {
                            Text(text = "Inserir Nome Completo")
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedTextColor = Color(0xDA4F7BFF),
                                focusedBorderColor = Color(0xDA4F7BFF),
                                unfocusedContainerColor = Color(0xDAECECEE),
                                unfocusedTextColor = Color.Gray,
                                unfocusedBorderColor = Color(0xDA4F7BFF),
                            ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Text
                        ),
                        textStyle = TextStyle(
                            fontSize = 20.sp,
                        ),
                    )
//----------------------FIM nome do usuário
//----------------------Início CPF do usuário
                    OutlinedTextField(
                        value = cpf,
                        onValueChange = { cpfDigitado ->
                            cpf = cpfDigitado
                        },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = "CPF",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal,
                                color = Color.Black
                            )
                        },
                        placeholder =
                        {
                            Text(text = "000.000.000-00")
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults
                            .colors(
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
//----------------------FIM CPF do usuário
//----------------------Início endereço do usuário
                    Row {
                        OutlinedTextField(
                            value = cep,
                            onValueChange = { cepDigitado ->
                                cep = cepDigitado
                            },
                            singleLine = true,
                            modifier = Modifier,
                            label = {
                                Text(
                                    text = "CEP",
                                    fontSize = 20.sp,
                                    fontFamily = FontPrincipal,
                                    color = Color.Black
                                )
                            },
                            placeholder =
                            {
                                Text(text = "00000 - 000")
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = OutlinedTextFieldDefaults
                                .colors(
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
// ----------------------Início Número residência
                        OutlinedTextField(
                            value = nResidencia,
                            onValueChange = { nResidenciaDigitado ->
                                nResidencia = nResidenciaDigitado
                            },
                            singleLine = true,
                            modifier = Modifier
                                .padding(start = 2.dp),
                            label = {
                                Text(
                                    text = "N⁰",
                                    fontSize = 20.sp,
                                    fontFamily = FontPrincipal,
                                    color = Color.Black
                                )
                            },
                            placeholder =
                            {
                                Text(text = "0000")
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = OutlinedTextFieldDefaults
                                .colors(
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
                    }
//---------------------- FIM Número residência
//----------------------FIM endereço do usuário

// ---------------------Início email

                    OutlinedTextField(
                        value = email,
                        onValueChange = { emailDigitado ->
                            email = emailDigitado
                        },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = "E-mail",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal,
                                color = Color.Black
                            )
                        },
                        placeholder =
                        {
                            Text(text = "@")
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedTextColor = Color(0xDA4F7BFF),
                                focusedBorderColor = Color(0xDA4F7BFF),
                                unfocusedContainerColor = Color(0xDAECECEE),
                                unfocusedTextColor = Color.Gray,
                                unfocusedBorderColor = Color(0xDA4F7BFF),
                            ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email
                        ),
                        textStyle = TextStyle(
                            fontSize = 20.sp,
                        ),
                    )
// ----------------- FIM email
// ----------------- Início número telefone

                    OutlinedTextField(
                        value = numeroTelefone,
                        onValueChange = { numeroDigitado ->
                            numeroTelefone = numeroDigitado
                        },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = "Número de Telefone",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal,
                                color = Color.Black
                            )

                        },
                        placeholder =
                        {
                            Text(text = "(99) 9 9999-9999")
                        },

                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults
                            .colors(
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
// -----------------FIM número telefone
                    Spacer(modifier = Modifier.height(15.dp))

                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                        .fillMaxWidth()

                    ){
                        Button(
                            onClick = {
                            },
                            modifier = Modifier
                                .padding(5.dp)
                                .size(
                                    width = 200.dp,
                                    height = 45.dp

                                ),
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),

                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xDA0031C4)
                            )
                        ) {
                            Text(
                                text = "Validar Dados",
                                fontSize = 20.sp,
                                fontFamily = FontPrincipal
                            )
                        }
                    }
                }
// --------------------- FIM Inserção de dados do usuário
//-----------------Início Botões - Simular Sucesso/ Simular Falha
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(Color.White)
                        .padding(10.dp)
                ) {

                    Button(
                        onClick = {
                            navController.navigate("ErroAutCadastral")
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
                            navController.navigate("ScoreAntifraude")
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