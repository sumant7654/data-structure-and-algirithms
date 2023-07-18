import java.util.Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] intArrays; // declaration
        intArrays = new int[3]; // instantiation
        intArrays[0] = 1; //initialization
        intArrays[1] = 2; //initialization
        intArrays[2] = 3; //initialization
        System.out.println(Arrays.toString(intArrays));

        int[] intArrays1 = {1,2,3}; // declaration + instantiation + initialization
        System.out.println(Arrays.toString(intArrays1));

    }
}
