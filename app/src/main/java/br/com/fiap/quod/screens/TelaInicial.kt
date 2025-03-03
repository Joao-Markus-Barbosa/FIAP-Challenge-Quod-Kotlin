package br.com.fiap.quod.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun TelaInicial(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(Color.White)
            .padding(top = 20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.White)

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(Color.White)
                    .size(width = 120.dp, height = 80.dp)
                    .background(Color.Black)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.simbolo_quod),
                    contentDescription = "Simbolo",
                    modifier = Modifier
                        .size(320.dp)


                )
            }

            // Formulário
            Spacer(
                modifier = Modifier
                    .height(80.dp)
                    .fillMaxSize()
                    .background(Color.Black)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .background(Color.Black)
                    .padding(35.dp),
            ) {
                Text(
                    text = "Aplicativo Desenvolvido Para Demonstração De Soluções Antifraude.",
                    modifier = Modifier
                        .fillMaxSize(),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    color = Color.White,
                    lineHeight = 40.sp,// Ajuste conforme o tamanho da fonte
                    fontFamily = FontPrincipal
                )

            }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier

                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.Black)
            ) {
                Button(
                    onClick = {
                        navController.navigate("Menu")
                    },
                    modifier = Modifier
                        .size(width = 200.dp, height = 50.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(width = 1.dp, Color(0xCDCED6CD)),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xCD12B900)
                    )

                ) {
                    Text(
                        text = "Conhecer... ",
                        fontSize = 25.sp,
                        fontFamily = FontPrincipal

                    )

                }
            }


        }
    }
}


