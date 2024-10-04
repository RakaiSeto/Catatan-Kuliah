package P1;

public class sepatu {
    int ukuran;
    String brand;
    String jenis;

    public sepatu(int ukuran, String brand, String jenis) {
        this.ukuran = ukuran;
        this.brand = brand;
        this.jenis = jenis;
    }

    public void pakai() {
        System.out.println("Sepatu dipakai");
    }

    public void lepas() {
        System.out.println("Sepatu dilepas");
    }

    public void cetakInfo() {
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Brand: " + brand);
        System.out.println("Jenis: " + jenis);
    }
}
