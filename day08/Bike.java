package day08;

public class Bike extends Vehicles implements Drivable {
    
    public Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Bike started.");
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving.");
    }
}
    

