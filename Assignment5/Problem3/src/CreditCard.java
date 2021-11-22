public class CreditCard implements  PaymentStrategy {


    private  String cardNumber ;
    public  CreditCard(String cardNumber){
        this.cardNumber=cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard: "+cardNumber+" $"+amount);
    }
}
