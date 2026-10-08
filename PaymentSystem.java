abstract class Payment {
    abstract void payAmount();
    void paymentDetails() {
        System.out.println("Payment Details");
    }
}
class CreditCard extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made using Credit Card: Rs. 5000");
    }
}
class UPI extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made using UPI: Rs. 3000");
    }
}
public class PaymentSystem {

    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        Payment payment2 = new UPI();
        payment1.paymentDetails();
        payment1.payAmount();
        System.out.println("--------------------------");
        payment2.paymentDetails();
        payment2.payAmount();
    }
}