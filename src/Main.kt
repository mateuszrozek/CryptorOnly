/**
 * Created by lenovo on 2019-04-08.
 */
class Main {

    companion object{
        @JvmStatic fun main(args: Array<String>){
//            val text = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpRrSsTtUuWwVvXxYyZz"
//            val key = "12345678"

            val text = "Ptaki lataja kluczem.333"
            val key = "Tajemny "
            val cryptor = Encryptor(text, key)
            cryptor.encrypt()
        }
    }
}