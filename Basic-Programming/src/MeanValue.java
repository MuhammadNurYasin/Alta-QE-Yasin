public class MeanValue {
    private static float Mean(float[] numbers){
        float sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];    //variable untuk total nilai dalam array
        }
        float mean = sum / numbers.length;  //rumus mencari mean
        return mean;
    }

    public static void main(String[] args) {
        float[] array = {1, 2, 3, 4};
        System.out.println(Mean(array));
    }
}




