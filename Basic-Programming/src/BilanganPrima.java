import java.util.Scanner;
 public class BilanganPrima {
    private static boolean primeNumber (int number){
        boolean prime = true;
        if (number <= 1){
            prime = false;
            return prime;
        }
        else {
            for(int i = 2; i <= number/2; i++){
                if ((number % i) == 0){
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int number = bilangan.nextInt();
        boolean prime = primeNumber(number);
        if (prime){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}







