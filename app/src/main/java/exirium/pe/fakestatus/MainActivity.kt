package exirium.pe.fakestatus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import exirium.pe.fakestatus.core.navigation.FakeStatusNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FakeStatusNavGraph()
        }
    }
}