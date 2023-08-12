import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        BucketSortExample obj = new BucketSortExample();
        int[] sortedArr = obj.doBucketSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    // Bucket Sort Impl
    private int[] doBucketSort(int[] arr) {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length)); // Find out the bucket size i.e. sqrt(array size)

        // get the max value
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        // Create list of Buckets
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];

        // Assign empty bucket object to each index
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int bucketNumber = (int) Math.ceil((float) arr[i] * numberOfBuckets / (float) maxValue);
            buckets[bucketNumber - 1].add(arr[i]);
        }
        System.out.println("Printing Buckets before sorting");
        printBucket(buckets);

        // Sort the Buckets
        for(int i = 0; i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        System.out.println("\nPrinting Bucket after sorting");
        printBucket(buckets);

        int index = 0;

        for(int i = 0; i < buckets.length; i++){
            for(int j = 0; j < buckets[i].size(); j++){
                arr[index] = buckets[i].get(j);
                index++;
            }
        }

        return arr;

    }

    // Print Bucket
    private void printBucket(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("Bucket#" + (i + 1));
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
