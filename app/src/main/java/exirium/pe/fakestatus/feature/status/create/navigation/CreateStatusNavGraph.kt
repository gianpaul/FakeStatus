package exirium.pe.fakestatus.feature.status.create.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import exirium.pe.fakestatus.core.navigation.NavigationActions
import exirium.pe.fakestatus.feature.status.create.ui.CreateStatusScreen

object CreateStatusNavigation {
    const val ROUTE = "createStatus"
}

fun NavGraphBuilder.addCreateStatusComposable(actions: NavigationActions) {
    composable(route = CreateStatusNavigation.ROUTE) {
        CreateStatusScreen(navigationActions = actions)
    }
}