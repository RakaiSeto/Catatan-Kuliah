package P4.Tugas;

public class MataKuliah {
    private String kodeMk, namaMk;
    private int sks;
    private Dosen dosen;

    public MataKuliah(String kodeMk, String namaMk, int sks, Dosen dosen) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
        this.dosen = dosen;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public void tampilkanDataMk() {
        System.out.println("KODE MK: " + kodeMk);
        System.out.println("NAMA MK: " + namaMk);
        System.out.println("SKS: " + sks);
        dosen.tampilkanInfoDosen();
    }
}
