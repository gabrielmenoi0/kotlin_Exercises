class let {
    fun ExempleLet(){
        val str:String? = null
        if (str != null){
            str.lowercase()
            str.length
        }
        // verifica o nullo e executa
        str.let{
            //it recebe assume a variavel
            it?.lowercase()
        }
    }
}