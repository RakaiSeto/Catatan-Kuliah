package P4.Tugas;

public class Dosen {
    private String nip, namaDosen;

    public Dosen(String nip, String namaDosen) {
        this.nip = nip;
        this.namaDosen = namaDosen;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void tampilkanInfoDosen() {
        System.out.println("NIP: " + nip);
        System.out.println("NAMA DOSEN: " + namaDosen);
    }
}
