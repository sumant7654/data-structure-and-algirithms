/***
 * @Author Sumanta Kumar
 * This is an example for Space Complexity.
 *
 * */
public class SpaceComplexityLoop {

    public static void main(String[] args) {
        int i = pairSumSequences(3);
        System.out.println(i);
    }


    /***
     * method pairSumSequences
     * arguments (int)
     * So, the space complexity is constant i.e. O(1).
     * */

    private static int pairSumSequences(int n) {
        int total = 0;
        for(int i = 0; i <= n ; i++){
            total = total + pairSum(i, i+1);

        }
        return total;
    }

    private static int pairSum(int a, int b) {
        return a + b;
    }
}
