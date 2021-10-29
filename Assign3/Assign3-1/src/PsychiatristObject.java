public class PsychiatristObject {

    //asks moody object about its mood
    public void examine(MoodyObject moody){
        System.out.println(" How are you feeling today? ");
        moody.queryMood();
    }
    //a moodyObject is observed to either laugh or cry
    public void observe(MoodyObject moody){
        moody.ExpressFeelings();
        System.out.println("Observation: "+moody);

    }
  /*  //returns message about self: “Subject laughs a lot”
    public String toString(){

    }*/

}
