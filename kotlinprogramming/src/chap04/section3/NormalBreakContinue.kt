package chap04.section3

//fun main() {
//    for (i in 1..5) {
//        if (i==3) continue //continue or break // for문 자체가 중단됨
//        print(i)
//    }
//    println()
//    println("outside")
//}

//fun main() {
//    println("labelBreak")
//    for (i in 1..5) {
//        second@ for (j in 1..5) {
//            if (j == 3) break
//            println("i:$i, j:$j")
//        }
//        println("after for j")
//    }
//    println("after for i")
//}

//fun main() {
//    println("labelBreak")
//    first@ for (i in 1..5) {
//        second@ for (j in 1..5) {
//            if (j == 3) break@first
//            println("i:$i, j:$j")
//        }
//        println("after for j")
//    }
//    println("after for i")
//}

fun main() {
    println("labelBreak")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}