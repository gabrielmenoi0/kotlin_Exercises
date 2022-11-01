class ManipulandoStrings(){

    fun str(){
        var str = "Kotlin"
        var str2 = "Kotlin é uma lingagem de programação"
        println("Tamanho da string:${str.length}")
        println("Posição (index)0:${str[0]}")
        println("Verificando inicio da string:${str.startsWith(prefix = "Kot")}")
        println("Verificando final da string:${str.endsWith(suffix = "in")}")
        println("Início da posição:${str.substring(startIndex = 2)}")
        println("Entre posições:${str.substring(2,4)}")
        println("Substituição da string:${str.replace(oldValue = "Kotlin", newValue = "Kotlin é top!")}")
        println("Caixa baixa:${str.lowercase()}")
        println("Caixa alta:${str.uppercase()}")
        println("Removendo espaços em branco:${str2.trim()}")

    }
}