package ya.elmou.project.domain.budget

import ya.elmou.project.data.models.Expense

object BudgetCalculator {

    fun totalExpenses(expenses: List<Expense>): Double {
        return expenses.sumOf { it.amount }
    }

    fun remaining(budgetLimit: Double, expenses: List<Expense>): Double {
        return budgetLimit - totalExpenses(expenses)
    }
}
