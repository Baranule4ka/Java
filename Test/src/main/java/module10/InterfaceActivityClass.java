package module10;

public class InterfaceActivityClass {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}