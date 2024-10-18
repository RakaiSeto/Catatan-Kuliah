package UTS;

public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac("Apple MacBook Pro", "M3", 4, 8, "B45", "PIN");
        Windows windows = new Windows("Microsoft Surface Pro", "Intel i7-1340u", 8, 16, "B45", "PIN");
        Pc pc = new Pc("Intel", "Intel i7-1340u", 8, 16, 1920);

        mac.tampilMac();
        System.out.println("=================");
        windows.tampilWindows();
        System.out.println("=================");
        pc.tampilPc();
        System.out.println("=================");
    }
}
