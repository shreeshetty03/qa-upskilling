package day08;

public class Car extends Vehicles implements Drivable {
    Car(String brand){
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car started.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}
    
    

