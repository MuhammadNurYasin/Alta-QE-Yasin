import java.util.Scanner;

class Barang{
    void komponenBarang(int panjang, int lebar, int tinggi, float berat){
        double dimensi = panjang * lebar * tinggi;
        int harga = 5000;
        if (dimensi <= 50 && berat <= 1){
            System.out.println("Harga Ongkos Kirim: " + harga);
        }
        else {
            System.out.println("Harga Ongkos Kirim Belum Diketahui");
        }
    }
}
public class OngkosKirim {
    public static void main(String[] args) {
        Barang barang = new Barang();

        Scanner Panjang = new Scanner(System.in);
        System.out.println("Masukkan Panjang Barang (cm) : ");
        int panjang = Panjang.nextInt();
        Scanner Lebar = new Scanner(System.in);
        System.out.println("Masukkan Lebar Barang (cm) : ");
        int lebar = Lebar.nextInt();
        Scanner Tinggi = new Scanner(System.in);
        System.out.println("Masukkan Tinggi Barang (cm) : ");
        int tinggi = Tinggi.nextInt();
        Scanner Berat = new Scanner(System.in);
        System.out.println("Masukkan Berat Barang (kg) : ");
        float berat = Berat.nextFloat();

        barang.komponenBarang(panjang, lebar, tinggi, berat);


    }
}
