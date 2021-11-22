public class PayPal implements  PaymentStrategy {
    private String email ;
    public PayPal(String email){
        this.email=email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal: "+email+" $"+amount);
    }
}
