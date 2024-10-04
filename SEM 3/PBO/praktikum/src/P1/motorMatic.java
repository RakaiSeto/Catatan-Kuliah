package P1;

public class motorMatic extends motor {
    boolean punyaLampuHazard;
    String jenisMesin;

    public motorMatic(int cc, String brand, String type, boolean punyaLampuHazard, String jenisMesin) {
        super(cc, brand, type);
        this.punyaLampuHazard = punyaLampuHazard;
        this.jenisMesin = jenisMesin;
    }

    public void nyalakanLampuHazard() {
        if (punyaLampuHazard) {
            System.out.println("Lampu hazard dinyalakan");
        } else {
            System.out.println("Motor ini tidak memiliki lampu hazard");
        }
    }

    public void gantiBeltCVT() {
        System.out.println("Belt CVT diganti");
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Punya lampu hazard: " + punyaLampuHazard);
        System.out.println("Jenis mesin: " + jenisMesin);
    }
}
