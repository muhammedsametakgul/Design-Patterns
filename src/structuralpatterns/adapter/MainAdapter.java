package structuralpatterns.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        creditCardProcessor.pay(100.50f);

        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.pay(50.25f);
    }
}
