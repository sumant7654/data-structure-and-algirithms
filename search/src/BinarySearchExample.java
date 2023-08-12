public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,9,13,15,23,25,30};
        BinarySearchExample obj = new BinarySearchExample();
        int index = obj.doBinarySearch(arr, 1);
        System.out.println("Element found at position="+(index+1));
    }

    private int doBinarySearch(int[] arr, int item) {
        int start = 0, end = arr.length-1;
        int middle = (start+end)/2;
        System.out.println(start+"\t"+middle+"\t"+end);
        while (arr[middle] != item && start < end){
            if(item < arr[middle]){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
            middle = (start+end)/2;
            System.out.println(start+"\t"+middle+"\t"+end);
        }
        if(arr[middle] == item){
            return middle;
        }else{
            return -2;
        }
    }
}
