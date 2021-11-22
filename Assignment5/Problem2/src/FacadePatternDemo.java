public class FacadePatternDemo {

    public static void main(String[] args) {
	// write your code here
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
