import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(String value){
        int i = 0;
        int j = value.length() - 1;

        while (i < j) {
            if (value.charAt(i) != value.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        }
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String value = text.next();
        value = value.toLowerCase();

        if (isPalindrome(value)){
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}



