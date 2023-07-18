public class TwoDimensionalArraySearching {
    public static void main(String[] args) {
        int[][] int2DArray ={
                {11,13,5,9,1},
                {8,10,15,2,4},
                {14,6,12,3,7}
        };
        TwoDimensionalArraySearching object = new TwoDimensionalArraySearching();
        object.searchElementFrom2DArray(int2DArray, 15);
    }

    // Searching a single value from 2D Array
    private void searchElementFrom2DArray(int[][] int2DArray, int element) {
        for(int row = 0; row < int2DArray.length; row++){
            for(int column = 0; column < int2DArray[0].length; column++){
                if(int2DArray[row][column] == element){
                    System.out.println("Value is found at row="+row+" and column="+column);
                return;
                }
            }
        }
        System.out.println("Value is not present");
    }
}
