import java.util.LinkedList;

public class SafeLinkedList {
    private LinkedList<Integer> list;
    private static  Object obj;

    public SafeLinkedList(){
        list= new LinkedList<Integer>();
        obj= new Object();
    }

    public void addAtPosition(int index, int element) {
        synchronized (obj)
        {
            list.add(index, element);
        }
    }
    public void removeAtPosition(int index) {
        synchronized (obj)
        {
            if (size() == 0 || index > size() - 1  || index<0)
                return;
            list.remove(index);
        }
    }

    public int getFirst() {
        synchronized (obj) {
            return list.getFirst();
        }
    }

    public int getLast() {
        synchronized (obj)
        {
            return list.getLast();
        }
    }
    public int size(){
     synchronized (obj)
        {
            return list.size();
        }
    }
}
