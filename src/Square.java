public class Square implements Shape {
    private final double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
