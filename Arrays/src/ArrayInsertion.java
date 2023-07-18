import java.util.Arrays;

public class ArrayInsertion {
    int[] intArrays;
    public static void main(String[] args) {
        ArrayInsertion arrayInsertion = new ArrayInsertion(5);
        System.out.println(Arrays.toString(arrayInsertion.intArrays));
        arrayInsertion.insert(0,1);
        arrayInsertion.insert(2,2);
        arrayInsertion.insert(2,3);
        arrayInsertion.insert(5,1);
    }

    public ArrayInsertion(int sizeOfArray){
        intArrays = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            intArrays[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try {
            if (intArrays[location] == Integer.MIN_VALUE) {
                intArrays[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array.");
        }
    }
}
