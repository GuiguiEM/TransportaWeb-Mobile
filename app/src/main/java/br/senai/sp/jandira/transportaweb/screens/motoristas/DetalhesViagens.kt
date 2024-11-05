package br.senai.sp.jandira.transportaweb.screens.motoristas

import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

@Composable
fun DetalhesViagensM(controleDeNavegacao: NavHostController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 25.dp, end = 25.dp)
            ){
                Button(
                    modifier = Modifier
                        .size(46.dp)
                        .padding(0.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFFF61221)),
                    onClick = {}
                ) {

                }
                Card (
                    modifier = Modifier
                        .padding(start = 15.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent,
                        ),
                ){
                    Image(
                        painterResource(R.drawable.caixas),
                        contentDescription = "Caixa",
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .size(40.dp)
                            .padding(top = 5.dp)
                    )
                }
                Column (
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth()
                ){
                    Row {
                        Text(
                            text = "Detalhes da viagem"
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(bottom = 0.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "Postado as 09:30",
                            textAlign = TextAlign.Center,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF515151),

                        )
                        Text(
                            text = " | ",
                            textAlign = TextAlign.Center,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF515151),
                        )
                        Text(
                            text = "Entregue as 10:30",
                            textAlign = TextAlign.Center,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF515151),
                        )
                    }
                }
            }
            Row (
                modifier = Modifier
                    .padding(top = 30.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(Color(0xFFF61221), shape = RoundedCornerShape(10.dp))
            ){
                Text(
                    text = "3333",
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
            }
            Card(
                modifier = Modifier
                    .padding(top = 30.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(200.dp)
            ) { }
            Box(
                modifier = Modifier
                    .padding(top = 24.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = Color(0xFFDADADA))
            ){ }
            Column (
                modifier = Modifier
                    .padding(top = 30.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(Color(0xFFF61221), shape = RoundedCornerShape(10.dp))
            ){
                Row {
                    Text(
                        text = "Detalhes da viagem"
                    )
                }
                Row {
                    Text(
                        text = "Detalhes da viagem"
                    )
                }
                Row {
                    Text(
                        text = "Detalhes da viagem"
                    )
                }
            }
            Button(
                modifier = Modifier
                    .padding(top = 35.dp, start = 115.dp, end = 115.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults
                    .buttonColors(Color(0xFF2ECC71)),
                onClick = {}
            ) {
                Text(
                    text = "Contato",
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .padding(top = 35.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = Color(0xFFDADADA))
            ){ }
            Button(
                modifier = Modifier
                    .padding(top = 65.dp, start = 45.dp, end = 45.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                shape = RoundedCornerShape(10   .dp),
                colors = ButtonDefaults
                    .buttonColors(Color(0xFFF61221)),
                onClick = {}
            ) {
                Text(
                    text = "Reserver Viagem",
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                )
            }
        }
    }
}

@Preview
@Composable
fun DetalhesViagensPreview() {
    TransportaWebTheme {
        DetalhesViagensM(controleDeNavegacao = NavHostController(LocalContext.current))
    }
}