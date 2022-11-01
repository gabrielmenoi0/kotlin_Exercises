class Condicionais {
    fun conditionals(idade: Int){
        if (idade>18){
            println("Maior de idade:${idade}")

        }
        else if (idade == 18){
            println("Maioridade completa:${idade}")
        }
            else {
            println("Menor de idade:${idade}")
        }
    }
}