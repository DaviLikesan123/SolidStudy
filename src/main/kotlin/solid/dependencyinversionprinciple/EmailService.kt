package solid.dependencyinversionprinciple

import java.awt.List

// Dependency Inversion Principle

// Separate Business rules models with low level modules (implementation)
interface IEmailService {
    fun sendEmail(destiny: String, subject: String, body: String)
}

data class Order(val orderId : Int, val productName: String, val orderItem : List)
class EmailService: IEmailService {
    override fun sendEmail(destiny: String, subject: String, body: String) {

    }
}

class OrderService(private val emailService: EmailService) {
    fun checkOrder(order: Order) {

    }

}