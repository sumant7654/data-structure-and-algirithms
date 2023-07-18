public class TwoDimensionalArrayDeleting {
    public static void main(String[] args) {
        int[][] int2DArray ={
                {11,13,5,9,1},
                {8,10,15,2,4},
                {14,6,12,3,7}
        };
        TwoDimensionalArrayDeleting object = new TwoDimensionalArrayDeleting();
        object.deleteElementFrom2DArray(int2DArray, 2,2);

    }

    private void deleteElementFrom2DArray(int[][] int2DArray, int row, int column) {
        try{
            System.out.println("Element deleted successfully "+int2DArray[row][column]);
            int2DArray[row][column] = Integer.MIN_VALUE;
            System.out.println("Element deleted successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
    }
}
