class ExempleFor {
    fun Exemple(){
        val str = "Kotlin"
        for (i in 1..10){
            println(i)
        }
        for (char in str){
            println(char)
        }
        for (i in 1..10 step 2){
            println(i)
        }
        for (i in 20 downTo 0){
            println(i)
        }
        for (i in 20 downTo 0 step 3){
            println(i)
        }
    }
}