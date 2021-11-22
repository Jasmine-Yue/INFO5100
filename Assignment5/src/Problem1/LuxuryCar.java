package Problem1;

public class LuxuryCar extends  CarDecorator {


    public LuxuryCar(ICar basicCar) {
        super(basicCar);
        this.newFeature="Luxury Car";
    }

}
