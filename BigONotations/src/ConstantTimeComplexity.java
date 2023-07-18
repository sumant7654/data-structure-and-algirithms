/***
 * @Author Sumanta Kumar
 * This is an example to Constant Time Complexity
 * This is the best time complexity.
* */

public class ConstantTimeComplexity {
    public static void main(String[] args) {
        System.out.println(multiplyNumber(9));
    }

    /***
     * method multiplyNumber
     * arguments (int)
     * the multiplyNumber take constant time.
     * So, the time complexity is constant i.e. O(1).
     * */
    public static int multiplyNumber(int n){
        return n * n;
    }
}
