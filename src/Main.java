import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        System.out.println(shape1);

        shape1 = new Shape("red", false);
        System.out.println(shape1);

        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1 = new Circle(5.6);
        System.out.println("Dien tich hinh tron = " + circle1.getArea());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println("Chu vi hinh chu nhat = " + rectangle1.getPerimeter());

        Square square1 = new Square();
        System.out.println(square1);





    }
}