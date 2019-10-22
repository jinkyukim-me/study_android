package chap02.section3

fun main() {
    val x : Any
    x = "Hello World~!!"
    if (x is String) {
        println(x)
        println(x.length)
    }
}