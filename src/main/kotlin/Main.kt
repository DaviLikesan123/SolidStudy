import solid.Circle
import solid.Square
import solid.User
import solid.UserRepository


fun main() {
    val repository = UserRepository()

    // S
    repository.addUser(User(1, "David"))
    repository.addUser(User(2, "Albon"))
    repository.addUser(User(3, "Max"))

    repository.removeUser(User(3, "Max"))

    repository.findUserById(3)

    val users = repository.getAllUsers()
    print(users)

    // O
    val circle = Circle(3.0)
    println(circle.calculateArea())

    val square = Square(3.0, 4.0)
    println(square.calculateArea())

}