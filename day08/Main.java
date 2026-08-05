package day08;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Toyota");
        car.start();
        car.drive();
        car.stop();

        Bike bike = new Bike("Honda");
        bike.start();
        bike.drive();
        bike.stop();

        Truck truck = new Truck("Volvo");
        truck.start();
        truck.drive();
        truck.stop();
    }
    
}
