package day08;

public class Truck extends Vehicles implements Drivable {
    
    Truck(String brand) {
        super(brand);
        
    }

    @Override
    void start() {
        System.out.println("Truck started.");
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving.");
    }
}

