package P1;

public class motor {
    int cc;
    String brand;
    String type;

    public motor(int cc, String brand, String type) {
        this.cc = cc;
        this.brand = brand;
        this.type = type;
    }

    public void gas() {
        System.out.println("Motor melaju");
    }

    public void rem() {
        System.out.println("Motor berhenti");
    }

    public void cetakInfo() {
        System.out.println("CC: " + cc);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}
