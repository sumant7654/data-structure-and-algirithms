import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        QuickSortExample obj = new QuickSortExample();
        int[] sortedArr = obj.doQuickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(sortedArr));
    }

    private int[] doQuickSort(int[] arr, int start, int end) {
        if(start < end){
            int pivot = partition(arr, start, end);
            doQuickSort(arr, start, pivot - 1);
            doQuickSort(arr, pivot + 1, end);
        }
        return arr;

    }

    public int partition(int[] arr, int start, int end){
        int pivot = end;
        int i = start - 1;
        for(int j = start; j <= end; j++){
            if(arr[j] <= arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
}
