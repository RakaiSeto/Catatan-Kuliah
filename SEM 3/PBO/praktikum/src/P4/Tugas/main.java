package P4.Tugas;

public class main {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("JTI", "Jurusan Teknologi Informasi");
        Dosen dosen = new Dosen("123456789", "RUHUL");
        MataKuliah mataKuliah = new MataKuliah("MKTI_001", "BASIS DATA LANJUT", 2, dosen);
        Mahasiswa mahasiswa = new Mahasiswa("2341720135", "RAKAI SETO SEMBODO", jurusan);
        Nilai nilai = new Nilai(mataKuliah, mahasiswa, 94);
        nilai.tampilkanNilai();
    }
}
