fun main() {
    println("===================== Início ======================")
    println("Soma:" +sum(1,2))
    println("Subtração:" +sub(1,2))
    println("Multiplicação:" +multi(1,2))
    println("Divisão:" +div(1,2))
    println("Resto:" +rest(1,2))
    println("===================== Fim ======================")
}
fun sum(a: Int, b:Int):Int{
    return a+b
}
fun sub(a: Int, b:Int):Int{
    return a-b
}
fun multi(a: Int, b:Int):Int = a*b

fun div(a: Int, b:Int):Int= a/b

fun rest(a: Int, b:Int):Int= a%b