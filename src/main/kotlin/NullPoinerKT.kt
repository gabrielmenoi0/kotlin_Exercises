class NullPoinerKT {
        fun nullExemple(){
            try {
                var s: String? = null
                println(s?.length)
            }catch (e:Exception){
                print(e)
            }
            catch (e:NullPointerException){
                print(e)
            }finally {
                print("finally sempre será executado")
            }
            // garantia println(s!!.length)
        }

}