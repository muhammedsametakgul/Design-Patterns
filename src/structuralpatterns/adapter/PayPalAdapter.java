package structuralpatterns.adapter;

public class PayPalAdapter implements  PaymentProcessor{

    private PayPal payPal;


    public PayPalAdapter(PayPal payPal){
        this.payPal=payPal;
    }
    @Override
    public void pay(float amount) {
        payPal.makePayment(amount);
    }
}
