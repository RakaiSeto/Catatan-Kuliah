package P1;

public class gayung {
    int volume;
    String brand;
    String material;

    public gayung(int volume, String brand, String material) {
        this.volume = volume;
        this.brand = brand;
        this.material = material;
    }

    public void isiAir() {
        System.out.println("Gayung diisi air");
    }

    public void tuangAir() {
        System.out.println("Gayung menuangkan air");
    }

    public void cetakInfo() {
        System.out.println("Volume: " + volume);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
    }
}
