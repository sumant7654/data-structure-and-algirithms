public class TwoDimensionalArrayTraversal {
    public static void main(String[] args) {

        int[][] int2DArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15}
        };

        TwoDimensionalArrayTraversal object = new TwoDimensionalArrayTraversal();
        object.traverse2DArray(int2DArray);
        
    }
    
    // Traverse 2D Array
    
    public void traverse2DArray(int[][] int2DArray){
        for(int row = 0; row < int2DArray.length; row++){
            for(int column = 0; column <int2DArray[0].length; column++){
                System.out.print(int2DArray[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
