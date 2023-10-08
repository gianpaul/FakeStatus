package exirium.pe.fakestatus.feature.status.view.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import exirium.pe.fakestatus.core.navigation.NavigationActions

@Composable
fun ViewStatusScreen(id: String, navigationActions: NavigationActions) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = " $id View Status")
        Button(onClick = navigationActions::navigateBack) {
            Text(text = "Back")
        }
    }
}