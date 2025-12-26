package ya.elmou.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform