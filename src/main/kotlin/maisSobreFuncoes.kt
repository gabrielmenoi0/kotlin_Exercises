class MoreFunctions{

    fun ExempleMore(){
//        Any, Unit e Nothing
//        Any aceita qualuquer valor
//        Unit função sem retorno
//        Nothing retorna nada, porem exige retorno(usado para retornar Exeções)
        valores(true)
        values(false)
        semRetorno()
        media(2f,3f,4f, "", false)
    }
    fun valores(value:Any){

    }
    fun<T>values(value:T){

    }
    fun semRetorno():Unit{

    }
    fun retornaNada():Nothing{

    }
//    chamar varios paramentros na mesma função (vararg) "deve sempre ser chamada no final dos parametros"
    fun<T>media(vararg notas:T){
        val media = 0f
        for (n in notas){
            if (n is String){

            }if(n is Boolean){

            }else{
                media+=n
            }
        }
        media / notas.size
    }

}