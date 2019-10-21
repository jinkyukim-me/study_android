package chap02.section1

import com.gyugyu.edu.Person as User

fun main() {
    val user1 = User("gyugyu", 40)
    val user2 = Person("A123", "jinkyu")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)