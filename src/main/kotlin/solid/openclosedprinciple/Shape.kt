package solid.openclosedprinciple

import kotlin.math.pow

//  Open-Closed Principle

//A class, method, function can be open to extend but cannot be modified by itself

interface Shape {
    fun calculateArea() : Double
}

class Circle(private val radius: Double) : Shape {
    override fun calculateArea(): Double = Math.PI * radius.pow(2.0)
}

class Square(private val width: Double, private val height: Double) : Shape {
    override fun calculateArea(): Double = width * height
}

class Triangle(private val width: Double, private val height: Double) : Shape {
    override fun calculateArea(): Double = (width * height)/2
}

fun main() {

    val circle = Circle(2.40)
    println(circle.calculateArea())

    val square = Square(2.0,4.0)
    println(square.calculateArea())

    val triangle = Triangle(4.0, 3.0)
    println(triangle.calculateArea())
}