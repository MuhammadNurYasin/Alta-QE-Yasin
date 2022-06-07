import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner alas = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga: ");
        float inputAlas = alas.nextFloat();

        Scanner tinggi = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        float inputTinggi = tinggi.nextFloat();

        double luas = 0.5 * inputAlas * inputTinggi;
        System.out.println("Luas segitiganya adalah: " + luas);
    }
}








