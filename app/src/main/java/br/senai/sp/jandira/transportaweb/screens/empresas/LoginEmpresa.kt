package br.senai.sp.jandira.transportaweb.screens.empresas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R
//import br.senai.sp.jandira.transportaweb.utilities.MotoristaRepository

@Composable
fun Login(controleDeNavegacao: NavHostController) {

//    val cr =  MotoristaRepository(LocalContext.current)

    var emailState = remember{
        mutableStateOf("")
    }

    var passwordState = remember{
        mutableStateOf("")
    }

    var mensagemErroState = remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize()

    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 44.dp)

        ) {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(100.dp)
                    .padding(start = 10.dp)
            ){
                Image(
                    painterResource(R.drawable.logoo),
                    contentDescription = "Logo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.height(64.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Text(
                    text = "SEJA BEM VINDO DE VOLTA!",
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,

                    )
                Text(
                    text = "Digite seu e-mail aqui:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 64.dp, end = 148.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    label = {

                        Text(
                            text = "E-mail",
                            modifier = Modifier
                                .padding(start = 0.dp)
                        )
                    }
                )
                Text(
                    text = "Digite sua senha aqui:",
                    modifier = Modifier
                        .padding(top = 64.dp, end = 148.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    value = "",
                    onValueChange = {},
                    label = {

                        Text(
                            text = "Senha",
                            modifier = Modifier
                                .padding(start = 0.dp)
                        )
                    }
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 44.dp, top = 5.dp, end = 44.dp)
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {},
                        colors = CheckboxDefaults.colors(Color(0xFFF61221))
                    )
                    Text(
                        text = "Lembrar de mim",
                        color = Color.DarkGray
                    )
                }
                Column (
                    modifier = Modifier
                        .padding(top = 24.dp)
                ){
                    Text(
                        text = "ESQUECI A SENHA",
                        fontWeight = FontWeight.Bold
                    )
                }
                Button(
                    modifier = Modifier
                        .width(280.dp)
                        .height(110.dp)
                        .padding(top = 60.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = Color(0xFFF61221)),
                    onClick = {
                        //if (emailState.value == "" || passwordState.value == ""){
                        //mensagemErroState.value = "Email ou senhas incorretos"
                        //} else {
                        //val motorista = cr.validarLogin(emailState.value, passwordState.value)

                        //if(motorista){
                        //controleDeNavegacao.navigate("historico")
                        //}
                        //}
                    }
                ){
                    Text(
                        text = "LOGIN",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun LoginPreview() {
    //Login()
}