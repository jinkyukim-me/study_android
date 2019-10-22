package chap02.section4

fun main() {
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2
    println(number1)
    println(number2)
    number2 = number1 xor number2
    println(number1)
    println(number2)
    number1 = number1 xor number2
    println(number1)
    println(number2)

    println("number1 = " + number1)
    println("number2 = " + number2)
}

// 배타적합 연산자 xor는 두 비트 값을 비교하여 같으면 0을, 다르면 1을 반환
// or 연산자와 반대의 기능을 함
// xor의 성질을 이용하여 2개의 변수 값을 바꿀 수도 있다. 이런 기법을 스왑(Swap) 기법이라고 함

