package UTS;

public class Laptop extends Komputer {
    String jnsBatrei;

    public Laptop(String merek, String jnsProcessor, int kecProcessor, int sizeMemory, String jnsBatrei) {
        super(merek, jnsProcessor, kecProcessor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }

    public Laptop() {
        super();
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jns Batrei: " + jnsBatrei);
    }
}
