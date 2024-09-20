package P2;

public class PercobaanTryCatch {
    public static void main(String[] args) {
        System.out.println("Awal program");
        int x = 10;
        try {
            x = x / 0;
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
