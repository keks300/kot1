//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.

fun main() {
    println("Введите число в 10 с.с.")
    val k = readLine()?.toInt() // Считываем введенное число и преобразуем его в Int
    val z = k?.toString(2) // Преобразуем введенное число в двоичную систему счисления
    print(z)
}
