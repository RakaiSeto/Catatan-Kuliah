public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle", 4);
        vehicle.start();
        vehicle.stop();

        Car car = new Car("Toyota", 4, true);
        car.start();
        car.turnOnAC();
        car.stop();

        ElectricCar electricCar = new ElectricCar("Tesla", 4, true, 30);
        electricCar.start();
        electricCar.chargeBattery(50);
        electricCar.start();
    }
}