package P4.Tugas;

public class Mahasiswa {
    private String nim, nama;
    private Jurusan jurusan;

    public Mahasiswa(String nim, String nama, Jurusan jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("NAMA: " + nama);
        System.out.println("JURUSAN: " + jurusan);
    }
}
