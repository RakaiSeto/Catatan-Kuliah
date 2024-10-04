package P4.Percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("Spongebob Squarepants", "1234");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

        System.out.println(keretaApi.info());
    }
}
