package solid.singleresponsibilityprinciple

// Single Responsibility Principle
// Each class have your functions like:
//User, UserRepository, UserAuthentication

data class User(val id: Int, val name: String)

class UserRepository {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun removeUser(user: User) {
        users.remove(user)
    }

    fun findUserById(id: Int): User? {
        return users.find { it.id == id }
    }

    fun getAllUsers(): List<User> {
        return users.toList()
    }
}

fun main (){

    val user = User(23, "David")

    val repository = UserRepository()

    repository.addUser(user)

    print(repository.getAllUsers())

    print(repository.findUserById(23))

    print(repository.removeUser(user))
}




