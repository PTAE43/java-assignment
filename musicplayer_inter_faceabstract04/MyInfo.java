package javaassignment.musicplayer_inter_faceabstract04;

interface Playable {
    void play();
}

abstract class MusicDevice {
    String brand;

    MusicDevice(String brand) {
        this.brand = brand;
    }

    void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }

    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {
    CDPlayer(String brand) {
        super(brand);
    }

    void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }

    public void play() {
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

class Smartphone extends MusicDevice implements Playable {
    Smartphone(String brand) {
        super(brand);
    }

    void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }

    public void play() {
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        CDPlayer cd = new CDPlayer("Panasonic");
        Smartphone phone = new Smartphone("iPhone");

        cd.connect();
        cd.info();
        cd.play();

        System.out.println("-----");

        phone.connect();
        phone.info();
        phone.play();
    }

}
