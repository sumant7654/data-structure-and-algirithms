public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        LinearSearchExample obj = new LinearSearchExample();
        int index = obj.doLinearSearch(arr, 9);
        System.out.println("Element found at position="+(index+1));
    }

    private int doLinearSearch(int[] arr, int item) {
        for(int i = 0; i < arr.length; i++){
            if(item == arr[i]){
                return i;
            }
        }
        return -2;
    }
}
