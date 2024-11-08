package solid.interfacesegregationprinciple

// Interface Segregation Principle
// Separate methods in specific interfaces than in a single generic one
class Payment : DebitPayment, CreditPayment{

    override fun debitPayment() : String {
        return "debit"
    }

    override fun creditPayment() : String {
        return "credit"
    }

}

interface DebitPayment {
   fun debitPayment() : String
}

interface CreditPayment {
   fun creditPayment() : String
}

fun main() {

}

