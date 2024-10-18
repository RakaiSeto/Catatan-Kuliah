package UTS;

public class Komputer {
    String merek, jnsProcessor;
    int kecProcessor, sizeMemory;

    public Komputer(String merek, String jnsProcessor, int kecProcessor, int sizeMemory) {
        this.merek = merek;
        this.jnsProcessor = jnsProcessor;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
    }

    public Komputer() {

    }

    public void tampilData() {
        System.out.println("Merek: " + merek);
        System.out.println("Jns Processor: " + jnsProcessor);
        System.out.println("Kec Processor: " + kecProcessor);
        System.out.println("Size Memory: " + sizeMemory);
    }
}
