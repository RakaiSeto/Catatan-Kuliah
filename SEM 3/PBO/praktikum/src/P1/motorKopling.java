package P1;

public class motorKopling extends motor {
    int jumlahGigi;
    boolean punyaElectricStarter;

    public motorKopling(int cc, String brand, String type, int jumlahGigi, boolean punyaElectricStarter) {
        super(cc, brand, type);
        this.jumlahGigi = jumlahGigi;
        this.punyaElectricStarter = punyaElectricStarter;
    }

    public void gigiNaik() {
        System.out.println("Gigi naik");
    }

    public void gigiTurun() {
        System.out.println("Gigi turun");
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah gigi: " + jumlahGigi);
        System.out.println("Punya electric starter: " + punyaElectricStarter);
    }
}
