package P1;

public class demo {
    public static void main(String[] args) {
        motor motor1 = new motor(125, "Yamaha", "Mio");
        motor1.gas();
        motor1.rem();
        motor1.cetakInfo();

        System.out.println("=====================================");

        motorKopling motor2 = new motorKopling(150, "Honda", "CBR", 6, true);
        motor2.gas();
        motor2.rem();
        motor2.gigiNaik();
        motor2.gigiTurun();
        motor2.cetakInfo();

        System.out.println("=====================================");

        motorMatic motor3 = new motorMatic(125, "Yamaha", "NMax", true, "injeksi");
        motor3.gas();
        motor3.rem();
        motor3.nyalakanLampuHazard();
        motor3.gantiBeltCVT();
        motor3.cetakInfo();

        System.out.println("=====================================");

        gayung gayung1 = new gayung(2, "Tupperware", "Plastik");
        gayung1.isiAir();
        gayung1.tuangAir();
        gayung1.cetakInfo();

        System.out.println("=====================================");

        kipasAngin kipas1 = new kipasAngin(3, "Cosmos", "Plastik");
        kipas1.nyalakan();
        kipas1.matikan();
        kipas1.cetakInfo();

        System.out.println("=====================================");

        sepatu sepatu1 = new sepatu(42, "Nike", "Sneakers");
        sepatu1.pakai();
        sepatu1.lepas();
        sepatu1.cetakInfo();


    }
}
