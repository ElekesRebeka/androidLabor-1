fun main(args: Array<String>) {
    val x = 2
    val y = 3
    add(x,y)
    task2()
    task3(1,30)
    task4("\nSomething to decode")
    var list: List<Int> = listOf(1,2,3,4,5,6,7,8,9)
    println("Even numbers: ${evenNumbers(list)}")
    task6()
    task7()
    task8()
}

fun add(x:Int, y:Int){
    println("$x + $y = ${x+y} ")
}

fun task2 () {
    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
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

fun task4 (text: String) {
    val decodedString: String = myDecode(text)
    println("\nDecoded string: $decodedString")
    val encodedString: String = myEncode(decodedString)
    println("Encoded string: $encodedString\n")
}

fun myDecode (text: String): String{
    var decode: String = ""
    for ( c in text){
        var plusC = c + 2
        decode += plusC
    }
    return decode
}

fun myEncode (text: String): String{
    var encode: String = ""
    for ( c in text){
        var minusC = c - 2
        encode += minusC
    }
    return encode
}

fun messageCoding(msg: String, func: (String) -> String): String{
    return func(msg)
}

fun evenNumbers(list: List<Int>): List<Int> = list.filter{it % 2 == 0}

@OptIn(ExperimentalStdlibApi::class)    //annotation for lowercase
fun task6() {
    var list: List<Int> = listOf(1,2,3,4,5,6,7,8,9)
    println("Double: ${list.map{it*2}}")
    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    var daysOfWeekCapitalized = daysOfWeek.map{it.uppercase()}
    println("Capitalize: $daysOfWeekCapitalized")
    println("First character: ${daysOfWeek.map{it[0].lowercase()}}")
    println("Length: ${daysOfWeek.map{it.length}}")
    println("Average: ${daysOfWeek.map{it.length}.average()}")
}

fun task7(){
    println("\nTask 7: ")
    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    var daysOfWeekMutable = daysOfWeek.toMutableList()
    daysOfWeekMutable.removeAll { it.contains('n') }
    println("Removed: $daysOfWeekMutable")
    for ((index, value) in daysOfWeekMutable.withIndex()) {
        println("Item at $index is $value")
    }
    daysOfWeekMutable.sort()
    println("Sorted list: $daysOfWeekMutable")
}

fun task8(){
    println("\nTask 8: ")
    var list: MutableList<Int> = mutableListOf()
    for (i in 1..10) list.add((0..100).random())
    println("List:  $list")
    //forEach print list
    list.sort()
    println("Sorted:  $list")
    println("Even numbers: ${evenNumbers(list)}")
    if(list.size == evenNumbers(list).size){
        println("All numbers are even.")
    }
    println("Average: ${list.average()}" )
}
