package ya.elmou.project.data.models

data class Guest(
    val id: Long,
    val name: String,
    val phone: String,
    val email: String,
    val rsvp: Boolean,
    val tag: String
)
