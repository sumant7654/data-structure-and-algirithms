import java.util.Arrays;

public class TwoDimensionalArrayInsertion {
    int[][] int2DArray;
    public static void main(String[] args) {
        TwoDimensionalArrayInsertion object = new TwoDimensionalArrayInsertion(3,3);
        object.insertValueInThe2DArray(0,0,100);
        object.insertValueInThe2DArray(0,0,100);
        System.out.println(Arrays.deepToString(object.int2DArray));
    }

    // Constructor to set MIN_VALUE to each index
    public TwoDimensionalArrayInsertion(int numberOfRows, int numberOfColumns){
        int2DArray = new int[numberOfRows][numberOfColumns];
        for(int row = 0; row < numberOfRows; row++){
            for(int column = 0; column < numberOfColumns; column++){
                int2DArray[row][column] = Integer.MIN_VALUE;
            }
        }
    }


    // Inserting value in the Array

    public void insertValueInThe2DArray(int row, int column, int element){
        try{
            if(int2DArray[row][column] == Integer.MIN_VALUE) {
                int2DArray[row][column] = element;
            }else{
                System.out.println("Value already exist at index : "+row+","+column);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Bound");
        }
    }



}
