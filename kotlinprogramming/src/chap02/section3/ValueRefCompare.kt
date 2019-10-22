package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    val b_ab = a === b
    println("a === b: $b_ab") // 자료형이 기본형인 int가 되어 값이 동일하기 때문에 true
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    val b_cd = c == d
    val b_cd1 = c === d
    val b_ce = c === e
    println("c == d: $b_cd") // 내용만 비교하는 경우 동일하므로 true
    println("c === d: $b_cd1") // 내용은 같지만 다른 객체(주소 다름)이므로 false
    println("c === e: $b_ce") // 내용은 같지만 같은 객체(주소 동일)이므로 true
}
