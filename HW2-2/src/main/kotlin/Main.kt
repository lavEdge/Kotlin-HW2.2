fun main() {
    val likes = 211
    val result = if (likes === 1 || likes % 10 === 1 && (likes - 11) % 100 != 0 ) "человеку" else "людям"

    println("Понравилось $likes $result")
}