public class Rectangle implements Shape {
    private final double width,height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
