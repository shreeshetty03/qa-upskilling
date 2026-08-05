package day08;

public abstract class Vehicles {
    String brand;
    Vehicles(String brand){
     this.brand=brand;
     System.out.println("Vehicle brand: "+brand);
    }

    abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}
