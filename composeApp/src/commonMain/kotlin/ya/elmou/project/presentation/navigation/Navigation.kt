package ya.elmou.project.presentation.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Guests : Screen("guests")
    object Tasks : Screen("tasks")
    object Budget : Screen("budget")
    object Seating : Screen("seating")
}
