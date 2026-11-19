package Bootcamp_Day2;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle area: " + rectangle.calculateArea(5, 3, 0));
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter(5, 3, 0));
        Circle circle = new Circle();
        System.out.println("Circle area: " + circle.calculateArea(0, 0, 3));
        System.out.println("Circle perimeter: " + circle.calculatePerimeter(0, 0, 3));
        Square square = new Square(5);
        System.out.println("Square area: " + square.calculateArea(0, 0, 0));
        System.out.println("Square perimeter: " + square.calculatePerimeter(0, 0, 0));
    }
}