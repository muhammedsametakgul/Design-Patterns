package structuralpatterns.adapter;

public class CreditCardPaymentProcessor  implements  PaymentProcessor{
    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount +" with credit card");
    }
}
