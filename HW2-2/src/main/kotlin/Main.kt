fun main() {
    val likes = 631

    val result = if (likes === 1 || likes % 10 === 1 && likes > 11) "человеку" else "людям"

    println("Понравилось $likes $result")
}