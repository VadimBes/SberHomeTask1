public class Triangle implements Shape {
    private final double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
