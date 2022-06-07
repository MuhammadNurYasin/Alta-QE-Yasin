
class Balok{
    void volumeBalok(int panjang, int lebar, int tinggi){
        double volume = panjang * lebar * tinggi;
        System.out.println("Balok: " + volume);
    }
}

class Kubus{
    void volumeKubus(int sisi){
        double volume = sisi * sisi * sisi;
        System.out.println("Kubus: " + volume);
    }
}

class Tabung{
    void volumeTabung(int r, int tinggi){
        double volume = 3.14 * r * r * tinggi;
        System.out.println("Tabung: " + volume);
    }
}

public class MenghitungVolume {
    public static void main(String[] args) {
        Balok balok = new Balok();
        Kubus kubus = new Kubus();
        Tabung tabung = new Tabung();

        System.out.println("Volume");
        balok.volumeBalok(3,6,10);
        kubus.volumeKubus(10);
        tabung.volumeTabung(7,10);
    }
}









