package module10;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is started: engine is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped: engine is turned off");
    }
}