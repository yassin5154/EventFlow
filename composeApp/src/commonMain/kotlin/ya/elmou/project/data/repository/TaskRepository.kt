package ya.elmou.project.data.repository

import ya.elmou.project.data.models.Task

class TaskRepository {

    private val tasks = mutableListOf<Task>()

    fun getTasks(): List<Task> = tasks

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun updateTask(taskId: Long, done: Boolean) {
        tasks.find { it.id == taskId }?.let {
            val index = tasks.indexOf(it)
            tasks[index] = it.copy(done = done)
        }
    }

    fun deleteTask(id: Long) {
        tasks.removeIf { it.id == id }
    }
}
