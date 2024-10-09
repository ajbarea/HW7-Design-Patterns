import src.SingletonMethod.Singleton;

public class Main {
    public static void main(String[] args) {
        // Factory Method
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.print();

        // Singleton Method
        Singleton singleton = Singleton.getInstance();
        singleton.print();
    }
}