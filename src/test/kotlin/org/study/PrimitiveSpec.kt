package org.study

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldHaveLength
import io.kotest.matchers.types.shouldBeInstanceOf
import io.kotest.property.forAll

class PrimitiveSpec : StringSpec({
    "字符 Char"{
        val a = 'a'
        a.shouldBe('a')
        a.code.shouldBe(97) //ASCII characters
        a.shouldBeInstanceOf<Char>()
    }
    "字符串"{
        val str = "hello world"
        str.shouldBe("hello world")
        str.shouldHaveLength(11)
        forAll<String, String> { a, b ->
            println("a:$a, b:$b")
            (a + b).length == a.length + b.length
        }
    }
    "数字"{
        val a = 1
        (a + 1).shouldBe(2)
    }
    "boolean"{
        true.shouldBeTrue()
    }
})