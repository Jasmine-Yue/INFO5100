import java.util.LinkedList;
import java.util.List;

public class Main {

    public  static  SafeLinkedList safeLinkedList;
    public  static  LinkedList<Integer> unsafeLinklist;
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        unsafeLinklist= new LinkedList<>();
        safeLinkedList= new SafeLinkedList();
        Thread[] threads = new Thread[5];

        for(int i = 0 ; i < threads.length; i ++) {
            threads[i] = new Thread(new TestRemoveDeleteLLSafe());
            threads[i].start();
        }


    }
}
