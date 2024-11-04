package solid

// Single Responsibility Principle (Princípio da responsabilidade única)

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





