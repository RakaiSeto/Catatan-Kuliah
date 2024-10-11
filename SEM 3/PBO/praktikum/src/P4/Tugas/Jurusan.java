package P4.Tugas;

public class Jurusan {
    private String kodeJurusan, namaJurusan;

    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Jurusan: " + kodeJurusan);
        System.out.println("Nama Jurusan: " + namaJurusan);
    }
}
