package P2;

public class mahasiswa {
    String nim, nama, jurusan;

    public mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return this.nama;
    }

    public void info() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("Nama: " + this.nama);
    }
}
