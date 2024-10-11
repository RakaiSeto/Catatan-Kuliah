class Car extends Vehicle {
    private boolean hasAirConditioning;

    public Car(String brand, int wheels, boolean hasAirConditioning) {
        super(brand, wheels);
        this.hasAirConditioning = hasAirConditioning;
    }

    public void turnOnAC() {
        if (hasAirConditioning) {
            System.out.println(brand + ": Air conditioning is turned on.");
        } else {
            System.out.println(brand + ": This car does not have air conditioning.");
        }
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting smoothly.");
    }
}