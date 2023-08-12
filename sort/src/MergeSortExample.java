import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6,10};
        MergeSortExample obj = new MergeSortExample();
        int[] sortedArr = obj.doMergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(sortedArr));
    }

    private int[] doMergeSort(int[] arr, int left, int right) {
        if(right > left){
            int m = (left + right) /2;
            doMergeSort(arr, left, m);
            doMergeSort(arr, m+1, right);
            merge(arr, left, m, right);
        }
        return arr;
    }

    private void merge(int[] A, int left, int middle, int right){
        int[] leftTempArray = new int[middle-left+2];
        int[] rightTempArray = new int[right - middle +1];
        for(int i = 0; i<=middle-left; i++){
            leftTempArray[i] = A[left+i];
        }
        for(int i = 0; i<right-middle; i++){
            rightTempArray[i] = A[middle+1+i];
        }

        leftTempArray[middle-left+1] = Integer.MAX_VALUE;
        rightTempArray[right-middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for(int k = left; k<=right; k++){
            if(leftTempArray[i] < rightTempArray[j]){
                A[k] = leftTempArray[i];
                i++;
            }else{
                A[k] = rightTempArray[j];
                j++;
            }
        }
    }
}

