import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        SelectionSortExample obj = new SelectionSortExample();
        int[] sortedArr = obj.doSelectionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
    public int[] doSelectionSort(int[] arr) {
        for(int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
