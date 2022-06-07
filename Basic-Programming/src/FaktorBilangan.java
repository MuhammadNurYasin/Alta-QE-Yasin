import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int inputBilangan = bilangan.nextInt();

        System.out.println("Faktor bilangan tersebut adalah: ");

        int pembagi = 0;
        for (int i = 0; i <= inputBilangan; i++){
            pembagi++;
            if (inputBilangan % pembagi == 0){
                System.out.println(pembagi + " ");
            }
        }
    }
}

