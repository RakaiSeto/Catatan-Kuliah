package UTS;

public class Mac extends Laptop{
    String security;

    public Mac(String merek, String jnsProcessor, int kecProcessor, int sizeMemory, String jnsBatrei, String security) {
        super(merek, jnsProcessor, kecProcessor, sizeMemory, jnsBatrei);
        this.security = security;
    }

    public Mac() {
        super();
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security: " + security);
    }
}
