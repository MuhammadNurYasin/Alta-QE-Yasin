public class ProblemXYZ {
    private static void DrawXYZ (int n){
        for (int i = 1; i <= n * n; i++){
            if (i % 3 == 0){              //Kelipatan 3
                System.out.print("X ");
            } else if (i % 2 == 1) {      //Kelipatan Ganjil
                System.out.print("Y ");
            }else {                       //Kelipatan Genap
                System.out.print("Z ");
            }

            if (i % n == 0){
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        DrawXYZ(5);
    }
}




