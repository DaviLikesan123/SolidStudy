package solid.liskovsubstitutionprinciple

//Liskov Substitution Principle
//Superclass (Father Class) objects can be substituted by subclasses (children) objects
open class Bird(val name : String, val hunt: String?) {
    open fun canFly() {
        println("Can fly")
    }
}

class Penguin(name : String, hunt: String? = "") : Bird(name, hunt) {
    override fun canFly() {
        println("$name Can't fly $hunt")
    }
}

class Hawk(name: String, hunt: String?) : Bird(name, hunt) {
    override fun canFly() {
        println("$name Can fly ? $hunt")
    }
}

fun main(){

    val penguin = Penguin(name = "Penguin")
    penguin.canFly()

    val hawk = Hawk("Hawk", "Yes")
    hawk.canFly()

}