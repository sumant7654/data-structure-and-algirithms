import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] intArray = {10,14,16,54,5,6};
        int length = intArray.length;
        for(int i = 0; i < length / 2; i++){
            int temp = intArray[length-1 - i];
            intArray[length-1 - i] = intArray[i];
            intArray[i] = temp;

        }
        System.out.println(Arrays.toString(intArray));
    }
}
