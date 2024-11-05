package br.senai.sp.jandira.transportaweb.screens.empresas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

@Composable
fun DetalhesViagensE(controleDeNavegacao: NavHostController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 25.dp, end = 25.dp)
            ) {
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
                Card(
                    modifier = Modifier
                        .padding(start = 15.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent,
                        ),
                ) {
                    Image(
                        painterResource(R.drawable.caixas),
                        contentDescription = "Caixa",
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .size(40.dp)
                            .padding(top = 5.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth()
                ) {
                    Row {
                        Text(
                            text = "Detalhes da viagem"
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(bottom = 0.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
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
            Row(
                modifier = Modifier
                    .padding(top = 30.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(Color(0xFFF61221), shape = RoundedCornerShape(10.dp))
            ) {
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
                    .height(174.dp)
            ) { }
            Box(
                modifier = Modifier
                    .padding(top = 24.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = Color(0xFFDADADA))
            ) { }
            Column {
                Row (
                    modifier = Modifier
                        .padding(top = 14.dp, start = 55.dp, end = 55.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Box(
                        modifier = Modifier
                            .size(46.dp)
                            .padding(0.dp)
                            .background(Color.Red, shape = RoundedCornerShape(12.dp)),
                    ){
                        Image(
                            painterResource(R.drawable.caixas),
                            contentDescription = "Caixa",
                            contentScale = ContentScale.Inside,
                            modifier = Modifier
                                .size(46.dp)
                                .padding(8.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .padding(top = 23.dp, start = 6.dp, end = 6.dp)
                            .width(55.dp)
                            .height(2.dp)
                            .background(color = Color(0xFFDADADA))
                    ){}
                    Box(
                        modifier = Modifier
                            .size(46.dp)
                            .padding(0.dp)
                            .background(Color.Red, shape = RoundedCornerShape(12.dp)),
                    ){
                        Image(
                            painterResource(R.drawable.caixas),
                            contentDescription = "Caixa",
                            contentScale = ContentScale.Inside,
                            modifier = Modifier
                                .size(46.dp)
                                .padding(8.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .padding(top = 23.dp, start = 6.dp, end = 6.dp)
                            .width(55.dp)
                            .height(2.dp)
                            .background(color = Color(0xFFDADADA))
                    ){}
                    Box(
                        modifier = Modifier
                            .size(46.dp)
                            .padding(0.dp)
                            .background(Color.Red, shape = RoundedCornerShape(12.dp)),
                    ){
                        Image(
                            painterResource(R.drawable.caixas),
                            contentDescription = "Caixa",
                            contentScale = ContentScale.Inside,
                            modifier = Modifier
                                .size(46.dp)
                                .padding(8.dp)
                        )
                    }
                }
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(top = 5.dp, start = 35.dp, end = 35.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Objeto Postado",
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Objeto Recebido",
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Objeto Entregue",
                        fontSize = 12.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .padding(top = 20.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(Color(0xFFF61221), shape = RoundedCornerShape(10.dp))
            ){
                Row (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                ){
                    Column (
                        modifier = Modifier
                            .width(160.dp)
                            .fillMaxHeight()
                    ){
                        Text(
                            text = "Material: ",
                            fontSize = 14.sp
                        )
                        Text(
                            text = "Valor da Carga: ",
                            fontSize = 14.sp
                        )
                        Text(
                            text = "Pagamento: ",
                            fontSize = 14.sp
                        )
                    }
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                    ){
                        Button(
                            modifier = Modifier
                                .width(127.dp)
                                .height(30.dp)
                                .padding(0.dp),
                            shape = RoundedCornerShape(4.dp),
                            colors = ButtonDefaults
                                .buttonColors(Color(0xFFFFFFFF)),
                            onClick = {}
                        ) {
                            Text(
                                text = "Em Progresso",
                                fontSize = 12.sp,
                                color = Color(0xFFF61221)
                            )
                        }
                    }
                }
            }
            Button(
                modifier = Modifier
                    .padding(top = 15.dp, start = 115.dp, end = 115.dp)
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
                    .padding(top = 14.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = Color(0xFFDADADA))
            ) { }
            Box(
                modifier = Modifier
                    .padding(top = 25.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(Color(0xFFF61221), shape = RoundedCornerShape(10.dp))
            ){

            }
        }
    }
}

@Preview
@Composable
fun DetalhesViagensPreview() {
    TransportaWebTheme {
        DetalhesViagensE(controleDeNavegacao = NavHostController(LocalContext.current))
    }
}