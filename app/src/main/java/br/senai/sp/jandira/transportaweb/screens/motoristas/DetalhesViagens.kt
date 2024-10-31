package br.senai.sp.jandira.transportaweb.screens.motoristas

import android.view.Surface
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

@Composable
fun DetalhesViagensH(controleDeNavegacao: NavHostController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column {
            Row {
                Button(
                    modifier = Modifier
                        .height(15.dp)
                        .padding(0.dp),
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFFF61221)),
                    onClick = {}
                ) {

                }
            }
        }
    }
}

@Preview
@Composable
fun DetalhesViagensPreview() {
    TransportaWebTheme {
        DetalhesViagensH(controleDeNavegacao = NavHostController(LocalContext.current))
    }
}