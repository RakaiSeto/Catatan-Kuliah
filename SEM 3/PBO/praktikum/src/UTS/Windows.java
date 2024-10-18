package UTS;

public class Windows extends Laptop {
    String fitur;

    public Windows(String merek, String jnsProcessor, int kecProcessor, int sizeMemory, String jnsBatrei, String fitur) {
        super(merek, jnsProcessor, kecProcessor, sizeMemory, jnsBatrei);
        this.fitur = fitur;
    }

    public Windows() {
        super();
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur: " + fitur);
    }
}
