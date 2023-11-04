import kotlin.math.pow

fun main() {
    println("Введите данные 1: ")
    val n1 = readln().toInt()
    println("Введите данные 2: ")
    val n2 = readln().toInt()

    if ((n1 + n2) % 2 != 0)
        println("Создать нечетное число возможно")
    else if ((n1 - n2) % 2 != 0)
        println("Создать нечетное число возможно")
    else if ((n2 - n1) % 2 != 0)
        println("Создать нечетное число возможно")
    else if ((n1 * n2) % 2 != 0)
        println("Создать нечетное число возможно")
    else if ((n1 / n2) % 2 != 0)
        println("Создать нечетное число возможно")
    else if ((n2 / n1) % 2 != 0)
        println("Создать нечетное число возможно")
    else if (n1.toDouble().pow(n2) % 2 != 0.toDouble())
        println("Создать нечетное число возможно")
    else if (n2.toDouble().pow(n1) % 2 != 0.toDouble())
        println("Создать нечетное число возможно")
    else
        println("Создать нечетное число невозможно")
}