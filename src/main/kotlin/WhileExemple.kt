class WhileExemple {
    fun Exemplewhile(){
        val s = "Kotlin"
        var i =0
        while(i< s.length){
            println("${s[i]}")
            i++
        }
        var j =100
        while (j<50){
            j--
            if (j==80){
                continue
            }
            println(j)
            if(j==50){
                break
            }
        }

    }
}