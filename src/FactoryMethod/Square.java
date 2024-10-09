public class Square implements Shape {
    private double sideLength;

    public Square() {
        this(1);
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void print() {
        System.out.println("\nSquare: sideLength=" + getSideLength() + ", area=" + area() + ", perimeter=" + perimeter());
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}