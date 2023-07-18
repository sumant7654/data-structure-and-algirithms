import java.util.Arrays;

public class TwoDimensionalArrayCreation {
    public static void main(String[] args) {
        // Declare Array
        int[][] int2DArray;

        // Instantiate Array;
        int2DArray = new int[2][2];

        // Initialize Array
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        /*Our array like
        {1,2}
        {3,4}*/

        System.out.println(Arrays.deepToString(int2DArray));

        // Declaration, Instantiation and Initialization all together

        int[][] another2DArray = {
                {1, 2},
                {3, 4}
        };
        System.out.println(Arrays.deepToString(another2DArray));


    }
}
