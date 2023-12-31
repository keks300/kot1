//Создать приложение, с помощью которого пользователь, 
// введя целое число n и основание степени x узнает, 
// существует ли целочисленный показатель степени y для которого выполняется равенство xy = n. 
// В случае, если показатель существует – вычислить его и вывести. 
// В противном случае вывести текст – «Целочисленный показатель не существует».

import kotlin.math.pow

fun main() {
    println("Введите данные x: ")
    val x = readLine()!!.toDouble()  // считываем ввод пользователя и преобразуем введенное значение в тип Double
    println("Введите данные n: ")
    val n = readLine()!!.toDouble()  // считываем ввод пользователя и преобразуем введенное значение в тип Double

    var y = 0  // инициализируем переменную y
    while (x.pow(y) != n) {  // выполняем цикл, пока не найдем значение y, для которого x^y будет равно n
        if (x.pow(y) > n) {  // если значение x^y станет больше n
            println("Такого значения нет") // выводим сообщение о том, что такого значения нет
            return  // завершаем выполнение программы
        }
        y++  // увеличиваем значение y
    }
    println("y должен быть равен - $y")  // выводим найденное значение y
}
