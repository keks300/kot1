fun f(stro: String):String {
    val res = StringBuilder()
    var cnt = 1
    for (i in 1 until stro.length) {
        if(stro[i] == stro[i-1]){
            cnt++
        } else {
            res.append(stro[i-1])
            if (cnt > 1) {
                res.append(cnt)
            }
            cnt = 1
        }
    }
    res.append(stro[stro.length - 1])
    if (cnt > 1) {
        res.append(cnt)
    }
    return  res.toString()
}
fun main() {
    println("Введите строку символов ")
    val stro = readLine().toString()
    val end = f(stro)
    println(end)
}