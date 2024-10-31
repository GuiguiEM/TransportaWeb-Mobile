package br.senai.sp.jandira.transportaweb.screens.motoristas

import android.inputmethodservice.Keyboard
import android.view.Surface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R
import br.senai.sp.jandira.transportaweb.model.Viagem
import br.senai.sp.jandira.transportaweb.screens.LoginM
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun HomeM(controleDeNavegacao: NavHostController) {

    //val poppins = FontFamily(Font(R.font.poppins))

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF61221)
    ) {
        Column {
            Column(
                modifier = Modifier
                    .height(225.dp)
                    //.padding(bottom = 625.dp)
                    .background(
                        Color.White, shape =
                        RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
                    )
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                ){
                    Row(
                        modifier = Modifier.padding(top = 30.dp, start = 0.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .width(175.dp)
                                .height(55.dp)
                                .padding(top = 0.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.logoo),
                                contentDescription = "Logo",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                        }
                        Row(
                            modifier = Modifier
                                .height(55.dp)

                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(top = 16.dp, start = 70.dp),
                                text = "Jamal"
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(end = 26.dp)
                        ) {
                            Card(
                                modifier = Modifier
                                    .padding(0.dp)
                                    .size(55.dp),
                                shape = CircleShape,
                                border = BorderStroke(2.dp, Color.White)
                            ) {

                            }
                            Row(
                                modifier = Modifier
                                    .padding(top = 12.dp)
                                    .background(
                                        Color(0xFFF61221),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                            ) {
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.SemiBold,
                                    text = "Status",
                                    color = Color.White
                                )
                            }
                        }
                    }
                    Row (
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier
                            .padding(start = 32.dp, top = 16.dp)
                    ){
                        Text(
                            text = "Home",
                            fontWeight = FontWeight.Bold,
                            fontSize = (20.sp),
                            color = Color(0xFFF61221)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .padding(top = 8.dp, start = 24.dp, end = 24.dp)
                            .fillMaxWidth()
                            .height(2.dp)
                            .background(color = Color(0xFFDADADA))
                    ){

                    }
                    Row (
                        modifier = Modifier
                            .padding(top = 14.dp, bottom = 14.dp)
                    ){
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "À serviço da Vanderley Transportes.",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.SemiBold,
                            //fontFamily = FontFamily.,
                            color = Color(0xFF868686)
                        )
                    }
                }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp, start = 18.dp, end = 18.dp)
                    .height(110.dp)
                    .background(Color.White, shape = RoundedCornerShape(20.dp)),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color.Transparent,
                    ),
            ){
                Row (
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    Column (
                        modifier = Modifier
                            .width(250.dp)
                            .fillMaxHeight()
                            .background(Color.Transparent)
                    ){
                        Row (
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp, start = 24.dp),
                        ){
                            Box(
                                modifier = Modifier
                                    .width(80.dp)
                                    .height(25.dp)
                                    .background(Color.Gray, shape = RoundedCornerShape(4.dp))
                            ){
                                Text(
                                    "Na espera",
                                    textAlign = TextAlign.Center,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                )
                            }
                            Text(
                                "#412-639-JTO",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 8.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(top = 14.dp, start = 24.dp)
                                .fillMaxWidth()
                                .height(2.dp)
                                .background(color = Color(0xFFDADADA))
                        ){

                        }
                        Row (
                            horizontalArrangement = Arrangement.SpaceAround,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(20.dp)
                                .padding(top = 4.dp, start = 20.dp)
                        ){
                            Text(
                                "De:  DHL Jandira",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = "-"
                            )
                            Text(
                                "Para: GM Guarulhos",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Row (
                            horizontalArrangement = Arrangement.SpaceAround,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp)
                        ){
                            Text(
                                "15/08/2025",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                "15/08/2025",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                    Image(
                        painterResource(R.drawable.box),
                        contentDescription = "Caixa",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()

                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 760.dp)
                .background(
                    Color.White, shape =
                    RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                )
        ){
            Column {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp)
                        .padding(start = 20.dp, top = 10.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Image(
                        painterResource(R.drawable.caminhao),
                        contentDescription = "Caminhao",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(40.dp)
                            .padding(start = 0.dp)
                    )
                    Image(
                        painterResource(R.drawable.perfil),
                        contentDescription = "Caminhao",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(42.dp)
                            .padding(start = 0.dp)
                    )
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(start = 20.dp, top = 0.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Text(
                        text = "Viagens",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFF61221),
                        modifier = Modifier
                            .padding(end = 6.dp)
                    )
                    Text(
                        text = "Perfil",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFF61221),
                        modifier = Modifier
                            .padding(end = 10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ViagemCard (viagem: Viagem) {

    val context = LocalContext.current

    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 18.dp, end = 18.dp)
            .height(110.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp)),
        colors = CardDefaults
            .cardColors(
                containerColor = Color.Transparent,
            ),
    ){
        Row (
            modifier = Modifier
                .fillMaxSize()
        ){
            Column (
                modifier = Modifier
                    .width(250.dp)
                    .fillMaxHeight()
                    .background(Color.Transparent)
            ){
                Row (
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 24.dp),
                ){
                    Box(
                        modifier = Modifier
                            .width(80.dp)
                            .height(25.dp)
                            .background(Color.Gray, shape = RoundedCornerShape(4.dp))
                    ){
                        Text(
                            "Na espera",
                            textAlign = TextAlign.Center,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            modifier = Modifier
                                .align(Alignment.Center)
                        )
                    }
                    Text(
                        "#412-639-JTO",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(top = 14.dp, start = 24.dp)
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(color = Color(0xFFDADADA))
                ){

                }
                Row (
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                        .padding(top = 4.dp, start = 20.dp)
                ){
                    Text(
                        "De:  DHL Jandira",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "-"
                    )
                    Text(
                        "Para: GM Guarulhos",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row (
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp)
                ){
                    Text(
                        "15/08/2025",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        "15/08/2025",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            Image(
                painterResource(R.drawable.box),
                contentDescription = "Caixa",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    TransportaWebTheme {
        HomeM(controleDeNavegacao = NavHostController(LocalContext.current))
    }
}

@Preview
@Composable
fun ViagemCardPreview() {
    TransportaWebTheme {
        ViagemCard(Viagem())
    }
}

//@Preview(showBackground = true)
//@Composable
//fun LoginPreview() {
//    TransportaWebTheme {
//        ViagemCard(Viagem())
//    }
//}


