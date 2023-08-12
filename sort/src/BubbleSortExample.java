import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        BubbleSortExample obj = new BubbleSortExample();
        int[] sortedArr = obj.doBubbleSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private int[] doBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }



}
