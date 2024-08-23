package learn_kotlin
fun main(){
    var a: String = "Hello"
//    a = null -> NPE исключён в kotlin
// но если он нужен
    var b: String? = "Hello"
    //методы на премую не вызываются
    println(b?.length)
    //elvis operator -> ?:
    println(b?.length ?: -1)
    b = if((0..10).random() > 5) "hello" else null
    //!! - выбрасывает NPE
    println(b!!.length)

}