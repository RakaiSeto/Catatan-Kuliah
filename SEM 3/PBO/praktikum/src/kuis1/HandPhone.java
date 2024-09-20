package kuis1;

public class HandPhone {
    String noSeri, model, versiOs;
    boolean on = false;
    int volume = 0;

    public HandPhone(String noSeri, String model, String versiOs) {
        this.noSeri = noSeri;
        this.model = model;
        this.versiOs = versiOs;
    }

    public void power() {
        on = !on;
    }

    public void tambahVolume() {
        if (on) {
            if (volume < 100) {
                if (volume + 10 > 100) {
                    volume = 100;
                } else {
                    volume += 10;
                }
            } else {
                System.out.println("Volume maksimal");
            }
        } else {
            System.out.println("Power off");
        }
    }

    public void kurangVolume() {
        if (on) {
            if (volume > 0) {
                if (volume - 10 < 0) {
                    volume = 0;
                } else {
                    volume -= 10;
                }
            } else {
                System.out.println("Volume minimal");
            }
        } else {
            System.out.println("Power off");
        }
    }


    private int volumeBeforeMute = 0;

    public void mute() {
        if (on) {
            if (volumeBeforeMute == 0 && volume > 0) {
                volumeBeforeMute = volume;
                volume = 0;
            } else if (volumeBeforeMute > 0) {
                volume = volumeBeforeMute;
                volumeBeforeMute = 0;
            }
        } else {
            System.out.println("Power off");
        }
    }

    public void cetakInfo() {
        System.out.println("====================");
        System.out.println("No. seri: " + noSeri);
        System.out.println("Model: " + model);
        System.out.println("Versi OS: " + versiOs);
        System.out.println("Power: " + (on ? "On" : "Off"));
        System.out.println("Volume: " + volume);
        System.out.println("====================");
    }
}
