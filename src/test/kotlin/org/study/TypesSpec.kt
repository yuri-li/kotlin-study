package org.study

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNot
import io.kotest.matchers.shouldNotBe

class TypesSpec : StringSpec({
    "data class"{
        val user = User(id = "1001", age = 10)
        val temp = user.copy(age = 11)

        user.id.shouldBe(temp.id)
        user.age.shouldNotBe(temp.age)
        user.shouldNotBe(temp)
    }
    "const"{
        adultAge.shouldBe(18)
    }
    "测试不可变的参数"{
        fun add(a: Int, b: Int) = a + b
        add(1, 1).shouldBe(2)
    }
    "测试单子模式"{
        val s1 = Singleton
        val s2 = Singleton

        s1.shouldBe(s2)
        s1.randomNumber.shouldBe(s2.randomNumber)
    }
    "多态"{
        val pig: Animal = Animal.Pig()
        fun divide(a: Int, b: Int): Int = a / b
    }
})