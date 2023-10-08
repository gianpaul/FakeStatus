package exirium.pe.fakestatus.feature.status.view.navigation

import android.net.Uri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import exirium.pe.fakestatus.core.navigation.NavigationActions
import exirium.pe.fakestatus.feature.status.view.ui.ViewStatusScreen

object ViewStatusNavigation {
    const val ID_PARAM = "id"
    const val ROUTE = "viewStatus/{$ID_PARAM}"

    fun createRoute(id: String): String {
        return NavDeepLinkRequest.Builder.fromUri(Uri.parse(ROUTE.replace("{$ID_PARAM}", id)))
            .build().uri.toString()
    }
}

fun NavGraphBuilder.addViewStatusComposable(navigationActions: NavigationActions) {
    composable(
        route = ViewStatusNavigation.ROUTE,
        arguments = listOf(navArgument(ViewStatusNavigation.ID_PARAM) {
            type = NavType.StringType
            nullable = false
        })
    ) { backStackEntry ->
        val id = backStackEntry.arguments?.getString(ViewStatusNavigation.ID_PARAM).orEmpty()
        ViewStatusScreen(id = id, navigationActions = navigationActions)
    }
}