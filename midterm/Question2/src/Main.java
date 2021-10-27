public class Main {

    public static void main(String[] args) {

        //   test Question2:
        Printer p1;
        p1= Printer.getInstance();

        p1.getConnection();

        //test Question3:
        Question3 q3= new Question3();
        int[] nums= {1,3,-1,3,4,-1};
        System.out.println("Question3 test:");
        System.out.println(q3.getRepeatedSum(nums));

        //test Question4:
        Question4 q4= new Question4();
        String s="abcabcbb";
        System.out.println("Question4 test:");
        System.out.println(q4.getLongestSubstring(s));
    }
}
