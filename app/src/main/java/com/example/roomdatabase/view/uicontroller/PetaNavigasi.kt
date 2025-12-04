package com.example.roomdatabase.view.uicontroller


import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.roomdatabase.view.DetailSiswaScreen
import com.example.roomdatabase.view.EntrySiswaScreen
import com.example.roomdatabase.view.HomeScreen
import com.example.roomdatabase.view.route.DestinasiDetailSiswa
import com.example.roomdatabase.view.route.DestinasiHome
import com.example.roomdatabase.view.route.DestinyEntry


@Composable
fun SiswaApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    HostNavigasi(navController = navController, modifier = modifier)
}
/**
 * Navigation Graph utama aplikasi (Home <-> Entry)
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {

        // ================================
        // HOME SCREEN
        // ================================
        composable(route = DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinyEntry.route)
                },
                navigateToItemDetail = { itemId ->
                    navController.navigate("${DestinasiDetailSiswa.route}/$itemId")
                }
            )
        }

        // ================================
        // ENTRY SCREEN
        // ================================
        composable(route = DestinyEntry.route) {
            EntrySiswaScreen(
                navigateBack = { navController.popBackStack() }
            )
        }

        // ================================
        // DETAIL SCREEN
        // ================================
        composable(
            route = DestinasiDetailSiswa.routeWithArgs,
            arguments = DestinasiDetailSiswa.arguments
        ) {
            DetailSiswaScreen(
                navigateBack = { navController.navigateUp() },
                navigateToEditItem = {
                    // Implement navigation to edit screen if needed
                }
            )
        }
    }
}
