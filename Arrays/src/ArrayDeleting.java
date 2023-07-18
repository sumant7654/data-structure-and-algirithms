public class ArrayDeleting {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};

        deleteElementOfIndex(intArray, 1);
    }

    private static void deleteElementOfIndex(int[] intArray, int index) {
        try{
            intArray[index] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully. "+intArray[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not exist");
        }
    }
}
