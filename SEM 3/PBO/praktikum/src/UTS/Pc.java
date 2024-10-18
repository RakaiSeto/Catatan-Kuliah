package UTS;

public class Pc extends Komputer {
    int ukuranMonitor;

    public Pc(String merek, String jnsProcessor, int kecProcessor, int sizeMemory, int ukuranMonitor) {
        super(merek, jnsProcessor, kecProcessor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public Pc() {
        super();
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor);
    }
}
