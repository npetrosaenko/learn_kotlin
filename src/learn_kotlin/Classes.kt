package learn_kotlin

fun main(){
var a = Person("Nikolay",5)
    println(a.name)
}
//Primary Key
class Person(var name: String,var age: Int){
  var countChildren: Int = 6
    init{
        println("Person is created!!!")
    }
    constructor(name: String,  age: Int,  lastName: String): this(name, age){

    }
    constructor(): this("",0){

    }
}//data class автомотически создаютя toString hashcode and equals