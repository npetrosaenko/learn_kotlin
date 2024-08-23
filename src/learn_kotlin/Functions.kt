package learn_kotlin

fun main(){
    println(test())
    println(test1(5, 8))
    test2(z = 1,x = 2)
}
fun test(): String{
    return "Hello World!"
}
fun test1(x: Int,z: Int): Int{
    return x + z + 4
}
fun test2(x: Int,z: Int){
println(z + x)
}
//vararg
fun test3(vararg numbers: Int){
    numbers.forEach { e -> if(e % 2 == 0) println(e) }
}