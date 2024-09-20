package kuis1;

public class HandPhoneDemo {
    public static void main(String[] args) {
        String nomorSeri = String.format("%010d", (int) (Math.random() * 10000000000L));
        HandPhone hp = new HandPhone(nomorSeri, "Iqoo z7x", "Android");
        hp.cetakInfo();
//        tes method saat power off
        hp.kurangVolume();
        hp.tambahVolume();
        hp.mute();
        hp.cetakInfo();
//        nyalakan hp
        hp.power();
//        tambah hingga 100
        hp.tambahVolume();
        hp.cetakInfo();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.cetakInfo();
//        pembuktian volume maksimal
        hp.tambahVolume();
        hp.cetakInfo();
//        pembuktian mute
        hp.mute();
        hp.cetakInfo();
        hp.mute();
        hp.cetakInfo();
//        pembuktian kurangi volume
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.cetakInfo();
        hp.kurangVolume();
        hp.cetakInfo();
    }
}
