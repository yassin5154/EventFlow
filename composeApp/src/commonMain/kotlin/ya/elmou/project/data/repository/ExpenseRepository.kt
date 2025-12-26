package ya.elmou.project.data.repository

import ya.elmou.project.data.models.Expense

class ExpenseRepository {

    private val expenses = mutableListOf<Expense>()

    fun getExpenses(): List<Expense> = expenses

    fun addExpense(expense: Expense) {
        expenses.add(expense)
    }

    fun deleteExpense(id: Long) {
        val index = expenses.indexOfFirst { expense ->
            expense.id == id
        }
        if (index != -1) {
            expenses.removeAt(index)
        }
    }


    fun totalAmount(): Double {
        return expenses.sumOf { it.amount }
    }
}
