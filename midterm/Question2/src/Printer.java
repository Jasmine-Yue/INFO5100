public class Printer {


    private static  Printer instance;
    private  static  final  Object obj = new Object();
    private Printer() {
    }

    public static Printer getInstance(){
        
        if  (instance == null){
            synchronized (obj) {
                if (instance == null)
                    instance = new Printer();
            }
        }
        return instance;
    }

    public void getConnection(){
        System.out.println("Your Printer is working! ");
    }


}
