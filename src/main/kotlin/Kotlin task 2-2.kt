fun main() {
    println("Ведите количество лайков")
    val likes = readLine()?.toInt() ?: return
    val person = if ((likes % 10 == 1) && (likes != 11)) "человеку"
    else "людям"
    println("Понравилось $likes $person")

}