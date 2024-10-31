package br.senai.sp.jandira.transportaweb.screens.motoristas

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

@Composable
fun PerfilH(controleDeNavegacao: NavHostController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Box(
                modifier = Modifier
                    .
            ){

            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun PerfilPreview() {
    TransportaWebTheme {
        PerfilH(controleDeNavegacao = NavHostController(LocalContext.current))
    }
}