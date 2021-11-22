package Problem1;

public abstract  class CarDecorator implements  ICar {
    protected   ICar  basicCar;
    protected  String newFeature;

    public  CarDecorator(ICar basicCar){
        this.basicCar=basicCar;
    }


    @Override
    public void assemble() {
        basicCar.assemble();
        System.out.println("Adding features of "+newFeature);
      }
}
