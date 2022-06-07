import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilaiMahasiswa = nilai.nextInt();

        if((nilaiMahasiswa >= 0) && (nilaiMahasiswa <= 34)){
            System.out.println("D");
        } else if ((nilaiMahasiswa >= 35) && (nilaiMahasiswa <= 49)) {
            System.out.println("C");
        } else if ((nilaiMahasiswa >= 50) && (nilaiMahasiswa <= 64)) {
            System.out.println("B");
        } else if ((nilaiMahasiswa >= 65) && (nilaiMahasiswa <= 79)) {
            System.out.println("B+");
        } else if ((nilaiMahasiswa >= 80) && (nilaiMahasiswa <= 100)) {
            System.out.println("A");
        }else{
            System.out.println("nilai yang dimasukkan invalid");
        }
    }
}





