public class ArrayTraversal {
    public static void main(String[] args) {
        int[] intArrays = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        try {
            for (int i = 0; i < intArrays.length; i++) {
                System.out.println(intArrays[i]);
            }
        }catch (Exception e){
            System.out.println("Array no longer exist.");
        }
    }
}
