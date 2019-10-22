package chap02.section4

fun main() {
    var num1 = 10
    var num2 = 10
    val result1 = ++num1 // num 값 증가 후 대입 (++ 항의 값에 1 증가)
    val result2 = num2++ // 먼저 num 값 대입 후 증가

    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")
}

// 항 앞에 증가, 감소 연산자를 붙이면 연산을 마친 다음 그 값을 대입합니다.
// 하지만 항 뒤에 증가, 감소 연산자를 붙이면 먼저 그 값을 대입한 다음 연산을 수행합니다.