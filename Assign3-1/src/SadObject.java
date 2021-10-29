public class SadObject extends MoodyObject {





    @Override
    //returns string indicating sad
    public String getMood() {
        return   "sad";
    }


    @Override
    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    public void ExpressFeelings() {

        System.out.println(" waah boo hoo weep sob  ");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot";
    }
}
