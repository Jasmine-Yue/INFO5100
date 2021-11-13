import java.util.Random;
public class TestRemoveDeleteLLSafe implements Runnable{
    @Override
    public void run() {
        boolean bAdd = true;
        Random rand = new Random();
        while(true){
            int test = rand.nextInt(2);
            if(test >= 1){
               Main.safeLinkedList.addAtPosition(0, rand.nextInt(10));
               // Main.unsafeLinklist.add(0, rand.nextInt(10));
            }else{
                Main.safeLinkedList.removeAtPosition(Main.safeLinkedList.size() -1);
               // Main.unsafeLinklist.remove(Main.unsafeLinklist.size() -1);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
