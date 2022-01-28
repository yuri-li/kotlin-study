package org.study

sealed class Animal {
    data class Pig(val name: String = "Peggy") : Animal()
    data class Cat(val name: String = "Kitty") : Animal()
}
