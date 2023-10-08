package exirium.pe.fakestatus.core.navigation

import androidx.navigation.NavController
import exirium.pe.fakestatus.feature.status.view.navigation.ViewStatusNavigation

class NavigationManager(private val navController: NavController) : NavigationActions {
    override fun navigateToViewStatus(id: String) {
        navController.navigate(ViewStatusNavigation.createRoute(id))
    }

    override fun navigateBack() {
        navController.popBackStack()
    }
}