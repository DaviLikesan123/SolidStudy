import solid.User
import solid.UserRepository


fun main() {
    val repository = UserRepository()

    repository.addUser(User(1, "David"))
    repository.addUser(User(2, "Albon"))
    repository.addUser(User(3, "Max"))

    repository.removeUser(User(3, "Max"))

    repository.findUserById(3)

    val users = repository.getAllUsers()
    print(users)



}