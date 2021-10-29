public class Main {

    public static void main(String[] args) {
	// write your code here

        PsychiatristObject psy1= new PsychiatristObject();
        MoodyObject moody1= new HappyObject();
        MoodyObject moody2= new SadObject();

        psy1.examine(moody1);
        System.out.println();
        psy1.observe(moody1);
        System.out.println();

        psy1.examine(moody2);
        System.out.println();
        psy1.observe(moody2);
        System.out.println();
    }
}
