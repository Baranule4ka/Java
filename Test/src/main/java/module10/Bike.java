package module10;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is started: start pedaling");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped: brakes are applied");
    }
}