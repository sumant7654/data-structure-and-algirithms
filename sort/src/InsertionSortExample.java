import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        InsertionSortExample obj = new InsertionSortExample();
        int[] sortedArr = obj.doInsertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private int[] doInsertionSort(int[] arr) {  // 4,1,2,3
       for(int i = 1; i< arr.length; i++){
           int temp = arr[i], j = i;    // temp = 1, j = 1, temp=2, j = 2
           while(j > 0 && arr[j-1]> temp){ // true, 4 > 1 == true, 2 > 0 true, 4 > 2 true,
               arr[j] = arr[j-1];   //      4,4
               j--;
           }
           arr[j] = temp;       // 1, 2,4
           System.out.println(Arrays.toString(arr));
       }
       return arr;
    }
}
