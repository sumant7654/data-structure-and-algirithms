public class ArraySearching {
    public static void main(String[] args) {
        int[] intArrays = {13,11,9,10,1,2,3,4,5,15,12,6,7,8,};

        searchElement(intArrays, 11);
    }

    private static void searchElement(int[] intArrays, int element) {
        for(int i = 0; i < intArrays.length; i++){
            if(intArrays[i] == element){
                System.out.println("Value is found at the index of "+i);
                return;
            }
        }
        System.out.println("Value is not found");
    }
}
