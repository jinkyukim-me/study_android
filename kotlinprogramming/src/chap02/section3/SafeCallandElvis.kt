package chap02.section3

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}") // 세이프 콜과 엘비스 연산자 활용
}

// null이 아니면 왼쪽 값(Str?.length)을 null인 경우 오른쪽 값(-1)을 반환 ${str1?.length ?: -1}
// if (str1 != null) str1.length else -1 와 str1?.length ?: -1 는 동일 코드
