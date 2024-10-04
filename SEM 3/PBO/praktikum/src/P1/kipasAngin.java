package P1;

public class kipasAngin {
    int watt;
    String brand;
    String type;

    public kipasAngin(int watt, String brand, String type) {
        this.watt = watt;
        this.brand = brand;
        this.type = type;
    }

    public void nyalakan() {
        System.out.println("Kipas angin dinyalakan");
    }

    public void matikan() {
        System.out.println("Kipas angin dimatikan");
    }

    public void cetakInfo() {
        System.out.println("Watt: " + watt);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}