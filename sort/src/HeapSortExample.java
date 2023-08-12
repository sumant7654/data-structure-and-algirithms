import java.util.Arrays;
/**
 * @see <a href="https://www.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/lecture/25093106#overview">...</a>
 * */

public class HeapSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        BubbleSortExample obj = new BubbleSortExample();
        int[] sortedArr = null;//obj.doHeapSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
