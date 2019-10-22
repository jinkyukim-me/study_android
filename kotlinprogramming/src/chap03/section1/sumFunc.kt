package chap03.section1

fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun main(){
    val result1 = sum(3, 2) // IntelliJ IDEA에서 매개변수(a: 3, b: 2)를 보여줌
    val result2 = sum(6, 7) // IntelliJ IDEA에서 매개변수(a: 6, b: 7)를 보여줌

    println(result1)
    println(result2)
}

// 함수 호출과 프로그램의 실행 순서
// 프로그램의 진입점 main() 함수 - 함수의 호출과 함수의 인자 sum() - sum() 함수 호출


// 모든 함수는 fun이라는 키워드로 시작한다. function

// 함수의 이름은 카멜 표기법으로

// 함수 이름 오른쪽에 소괄호를 입력하고 그 안에 매개변수를 정의
// 매개변수는 함수에서 입력한 값을 받는 변수를 말함
// 쉼표(,)와 함께 여러 개를 지정할 수 있고 반드시 콜론(:)과 함께 자료형을 명시해 줘야 함

// 반환값의 자료형 명시 (): Int

// 함수의 본문 완성:함수의 기능을 담당하는 함수의 본문코드는 중괄호로 감싸 작성한다.

// 값 반환하기:return sum