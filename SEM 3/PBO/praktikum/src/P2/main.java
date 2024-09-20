package P2;

public class main {

    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("2341720135", "Rakai Seto Sembodo", "Teknik Informatika");
        dosen dsn = new dosen("567", "Aldi");
        mataKuliah mk = new mataKuliah("MK123", "Pemrograman Java");
        nilai nll = new nilai(mhs, mk, dsn, 90.5);
        nll.info();
    }
}
