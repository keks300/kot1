fun f(stro: String) {
    val c = HashMap<Char, Int>()
    for (count in stro) {
        if (c.containsKey(count)) {
            c[count] = c[count]!! + 1
        } else {
            c[count] = 1
        }
    }
    val end = c.keys.sorted()
    for (count in end) {
        println("$count - ${c[count]}")
    }
}
fun main () {
    println("Введите строку символов: ")
    val stro = readLine().toString()
    f(stro)
}