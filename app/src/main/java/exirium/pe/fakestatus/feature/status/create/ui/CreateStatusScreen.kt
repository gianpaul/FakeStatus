package exirium.pe.fakestatus.feature.status.create.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import exirium.pe.fakestatus.core.navigation.NavigationActions

@Composable
fun CreateStatusScreen(navigationActions: NavigationActions) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Create Status")
        Button(onClick = { navigationActions.navigateToViewStatus("1") }) {
            Text(text = "Go Status")
        }
    }
}