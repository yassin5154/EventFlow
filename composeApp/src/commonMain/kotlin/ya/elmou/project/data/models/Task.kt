package ya.elmou.project.data.models

data class Task(
    val id: Long,
    val title: String,
    val done: Boolean,
    val deadline: String
)
