package P2;

public class mataKuliah {
    String kode;
    String nama;

    public mataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public void info() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
    }
}
