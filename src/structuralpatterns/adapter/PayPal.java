package structuralpatterns.adapter;

public class PayPal {

    public void makePayment(float amount) {
        System.out.println("Paid "+ amount + " with PayPal.");
    }
}
