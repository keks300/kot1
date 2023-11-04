fun main() {
    println("Введите 3 значения через пробел ")
    val str = readLine()
    var str2 = str?.split(" ")
    val a = str2!![0].toInt()
    val b = str2!![1].toInt()
    val s = str2!![2]
    var k = 0
    if (s== "-"){
        k = a - b
    }
    if (s == "+"){
        k = a + b
    }
    if (s == "/"){
        k = a / b
    }
    if (s == "*"){
        k = a * b
    }
    println(s)
}
