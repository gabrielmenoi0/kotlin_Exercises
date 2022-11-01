class ExempleWhen() {
    fun Exemple(number: Int):Int{
        return when(number){
            1->1
            2->2
            3->3
            else ->0
        }
    }
    fun ExempleIn(number: Int){
        when(number){
            in 1..10 -> println("Está no intervalo 1-10")
            else -> println("Não está no intervalo 1-10")
        }
    }
}