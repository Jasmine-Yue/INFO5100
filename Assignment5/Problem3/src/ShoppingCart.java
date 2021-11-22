import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shopingitems;
    public  ShoppingCart(){
        shopingitems= new ArrayList<>();
    }
    public void addItem(Item item) {
       shopingitems.add(item);
    }
    public void removeItem(Item item){
        shopingitems.remove(item);
    }
    public int  calculateTotal(){

         int payamount=0;
        for(Item item : shopingitems){
            payamount+=item.getPrice();
        }
        return payamount;
    }
    public void pay(PaymentStrategy paymentStrategy){
        int payamount=calculateTotal();
        paymentStrategy.pay(payamount);
    }

}
