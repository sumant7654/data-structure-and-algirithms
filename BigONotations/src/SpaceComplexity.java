/***
 * @Author Sumanta Kumar
 * This is an example for Space Complexity.
 *
 * */
public class SpaceComplexity {

    public static void main(String[] args) {
        int i = sumNumbers(3);
        System.out.println(i);
    }


    /***
     * method sumNumbers
     * arguments (int)
     * the sumNumbers is a recursion.
     * this method will store value n time in memory
     * So, the space complexity is constant i.e. O(n).
     * */

    private static int sumNumbers(int n) {
        if(n <= 0){
            return 0;
        }else{
            return n + sumNumbers(n - 1);
        }
    }
}
