package P4.Tugas;

public class Nilai {
    private MataKuliah mataKuliah;
    private Mahasiswa mahasiswa;
    private int nilai;

    public Nilai(MataKuliah mataKuliah, Mahasiswa mahasiswa, int nilai) {
        this.mataKuliah = mataKuliah;
        this.mahasiswa = mahasiswa;
        this.nilai = nilai;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public void tampilkanNilai() {
        System.out.println("JURUSAN: " + mahasiswa.getJurusan().getNamaJurusan());
        System.out.println("MATA KULIAH: " + mataKuliah.getNamaMk());
        System.out.println("DOSEN: " + mataKuliah.getDosen().getNamaDosen());
        System.out.println("MAHASISWA: " + mahasiswa.getNama());
        System.out.println("NILAI: " + nilai);
    }
}
