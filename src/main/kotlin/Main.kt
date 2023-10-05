import java.util.*


// тип Unit
fun calc(a: Int, b: Int) = a+b

fun main() {
    val (a, b, m, n) = readln().split(" ").map { it.toDouble() }
    println(if((a >= m && b >= n) || (a >= n && b >= m)) "YES" else "NO")
}


fun main2() {

    val sc = Scanner(System.`in`)
    val number = sc.nextInt()

    val (a,b,c,d) = readln().split(" ").map { it.toInt() }

    println("a=${a+200}, b=${b+calc(2,3)}")
    println("$a $b")

    for(i in 100 downTo 50 step 3) {

    }

    val nums = 1..10 // Range [1,10]
    for(i in nums) {
        println(i)
    }
    val arr = arrayOf(1,2,3,4,6,7,10)
    for(j in arr.indices) {
        println(arr[j])
    }

    val result = if(a>100) 10 else 20
    val result2 = when {
        a>100 -> println("123123")
        a==1 -> {
            //
        }
        else -> println("123123")
    }
    when(a) {
        1,2,3 -> println("123123")
        5 -> println("5")
    }
   /*while() {

    }
    do {

    }while()*/

    repeat(5) {

    }




    println("Hello world!")

    // Javac (javacompile)
    // Byte code
    // JVM - Java Virtual Machine
    // Linux (Unix), MacOS, Windows
    // MainKt.class - byte code
    // JDK - Java Development Kit
    // jdk 21 (17)
}