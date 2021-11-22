package Problem1;

public class BasicCar implements  ICar {
    public  String description;

    public  BasicCar(){
        this.description="Basic car. ";
    }
    @Override
    public void assemble() {
        System.out.println(description);
    }
}
