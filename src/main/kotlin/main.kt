import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    val x = 2
    val y = 3
    add(x,y)
    task2()
    task3(1,30)
}

fun add(x:Int, y:Int){
    println("$x + $y = ${x+y} ")
}

fun task2 () {
    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
    for( day:String in daysOfWeek){
        println(day)
    }
    println("\nDays start with T: ")
    daysOfWeek
        .filter { it.startsWith("T") }
        .forEach { println(it) }

    println("\nDays containing the letter e: ")
    daysOfWeek
        .filter { it.contains("e") }
        .forEach { println(it) }

    println("\nDays length 6: ")
    daysOfWeek
        .filter { it.length == 6 }
        .forEach { println(it) }
}

fun isPrime(n:Int): Boolean {
    if ( n == 2 || n == 3 ) {
        return true
    }
    if( n <= 1 || n % 2 == 0 || n % 3 == 0){
        return false
    }
    var i = 5
    while (i * i <= n){
        if (n % i == 0 || n % (i + 2) == 0)
            return false
        i+=6
    }
    return true
}

fun task3 ( a:Int, b:Int ){
    println("\nIs prime: ")
    for (i in a..b){
        println ( "$i: "+ "${isPrime(i)}")
    }
}
