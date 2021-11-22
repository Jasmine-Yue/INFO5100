package Problem1;

public class SportsCar extends  CarDecorator {
    public SportsCar(ICar basicCar) {
        super(basicCar);
        this.newFeature=" Sports Car";
    }
}
