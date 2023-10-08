package exirium.pe.fakestatus.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import exirium.pe.fakestatus.feature.status.create.navigation.CreateStatusNavigation
import exirium.pe.fakestatus.feature.status.create.navigation.addCreateStatusComposable
import exirium.pe.fakestatus.feature.status.view.navigation.addViewStatusComposable

@Composable
fun FakeStatusNavGraph(startDestination: String = CreateStatusNavigation.ROUTE) {
    val navController = rememberNavController()
    val navigationActions = remember(navController) { NavigationManager(navController) }

    NavHost(navController, startDestination) {
        addCreateStatusComposable(navigationActions)
        addViewStatusComposable(navigationActions)
    }
}