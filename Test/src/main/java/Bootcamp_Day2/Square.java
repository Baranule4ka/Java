package Bootcamp_Day2;

public class Square extends Shape {

    private double side;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        return side * side;
    }
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 4 * side;
    }
}