

class Penjumlahan{
    void operasiPenjumlahan(int angka1, int angka2){
        double hasil = angka1 + angka2;
        System.out.println("Penjumlahan: " + hasil);
    }
}

class Pengurangan{
    void operasiPengurangan(int angka1, int angka2){
        double hasil = angka1 - angka2;
        System.out.println("Pengurangan: " + hasil);
    }
}

class Perkalian{
    void operasiPerkalian(int angka1, int angka2){
        double hasil = angka1 * angka2;
        System.out.println("Perkalian: " + hasil);
    }
}

class Pembagian{
    void operasiPembagian(int angka1, int angka2){
        double hasil = angka1 / angka2;
        System.out.println("Pembagian: " + hasil);
    }
}
public class Kalkulator {
    public static void main(String[] args) {
        Penjumlahan penjumlahan = new Penjumlahan();
        Pengurangan pengurangan = new Pengurangan();
        Perkalian perkalian = new Perkalian();
        Pembagian pembagian = new Pembagian();

        System.out.println("Hasil: ");

        penjumlahan.operasiPenjumlahan(3,4);
        pengurangan.operasiPengurangan(15,4);
        perkalian.operasiPerkalian(10,10);
        pembagian.operasiPembagian(12,3);
    }
}





