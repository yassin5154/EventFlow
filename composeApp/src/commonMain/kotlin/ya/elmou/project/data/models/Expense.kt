package ya.elmou.project.data.models

data class Expense(
    val id: Long,
    val label: String,
    val amount: Double,
    val category: String
)
