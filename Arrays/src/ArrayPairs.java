public class ArrayPairs {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                int value = arr[i] * 10 + arr[j];
                System.out.print(value+"\t");
            }
            System.out.println();
        }
    }
}
