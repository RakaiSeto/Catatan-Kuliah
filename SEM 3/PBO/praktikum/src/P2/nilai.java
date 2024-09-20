package P2;

public class nilai {
    mahasiswa mahasiswa;
    mataKuliah mataKuliah;
    dosen dosen;
    double nilaiAkhir;


    public nilai(mahasiswa mahasiswa, mataKuliah mataKuliah, dosen dosen, double nilaiAkhir) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.nilaiAkhir = nilaiAkhir;
    }


    public void info() {
        System.out.println("Mahasiswa: " + this.mahasiswa.getNama());
        System.out.println("Mata kuliah: " + this.mataKuliah.nama);
        System.out.println("Dosen: " + this.dosen.nama);
        System.out.println("Nilai mahasiswa: " + this.nilaiAkhir);
    }
}
