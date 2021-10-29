public class HappyObject extends MoodyObject {



    @Override
    //returns string indicating sad
    public String getMood() {
        return "happy";
    }


    @Override
    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    public void ExpressFeelings() {
        System.out.println(" heeehee….hahahah…HAHAHA!! ");
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
