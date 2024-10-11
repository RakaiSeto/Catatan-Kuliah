public class Vehicle {
    protected String brand;
    protected int wheels;

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public void start() {
        System.out.println(brand + " is starting with " + wheels + " wheels.");
    }

    public void stop() {
        System.out.println(brand + " is stopping.");
    }
}
