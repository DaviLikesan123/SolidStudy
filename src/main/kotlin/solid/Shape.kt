package solid

import kotlin.math.pow

//  Open-Closed Principle
interface Shape { fun calculateArea() : Double }

class Circle(private val radius: Double) : Shape {
    override fun calculateArea(): Double = Math.PI * radius.pow(2.0)
}

class Square(private val width: Double, private val height: Double) : Shape {
    override fun calculateArea(): Double = width * height
}

class Triangle(private val width: Double, private val height: Double) : Shape {
    override fun calculateArea(): Double = (width * height)/2
}