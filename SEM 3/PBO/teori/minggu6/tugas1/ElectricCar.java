class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int wheels, boolean hasAirConditioning, int batteryLevel) {
        super(brand, wheels, hasAirConditioning);
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        System.out.println(brand + ": Battery charged to " + batteryLevel + "%.");
    }

    @Override
    public void start() {
        if (batteryLevel > 20) {
            System.out.println(brand + " electric car is starting silently.");
        } else {
            System.out.println(brand + " electric car cannot start due to low battery.");
        }
    }
}