public class TwoDimensionalArrayElementAccess {
    public static void main(String[] args) {
        int[][] int2DArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        TwoDimensionalArrayElementAccess object = new TwoDimensionalArrayElementAccess();
        object.accessCell(int2DArray, 1,4);

    }

    // Accessing cell value from given array
    public void accessCell(int[][] int2DArray, int row, int column) {
        try {
            System.out.println("Accessing Row " + row + ", Column " + column + ", Value is=" + int2DArray[row][column]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for 2DArray");
        }
    }
}
