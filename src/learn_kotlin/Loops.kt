package learn_kotlin

fun main(){
    //диапозоны (интервалы) -> (..) или (until(не входит последнее значение))
    //step -> указание шага
    //for
    for(i in 1..5){
        println(i)
    }


    //for each
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for(number in numbers){
        println(number)
    }

    //while
    var i : Int = 0
    while (i <= 10){
        println(i)
        i++
    }

    //do-while
    var count: Int = 0
    do{
        count++
    }while (count <= 9)

    //when
    var value: Int = 10
    when(value){
        10 -> println("10")
        20 -> println("20")
    }
    val range
    = 1..10 step 2
}