package chap02.section4

fun main() {
    val number1 = 5
    val number2 = -5

    println(number1 shr 1)

    println(number1 ushr 1) // 변화 없음

    println(number2 shr 1)  // 부호비트가 1로 유지

    println(number2 ushr 1) // 부호비트가 0이 되면서 변경
}

// 비트 이동 연산자 ushr을 이용하면 제일 왼쪽 비트에 0을 밀어 넣으면서 오른쪽으로 비트가 이동합니다.