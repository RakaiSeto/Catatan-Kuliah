package P2;

public class dosen {
    String nip;
    String nama;

    public dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }


    public void info() {
        System.out.println("NIP: " + this.nip);
        System.out.println("Nama: " + this.nama);
    }
}
