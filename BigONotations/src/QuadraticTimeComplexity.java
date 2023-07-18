/***
 * @Author Sumanta Kumar
 * This is an example to Quadratic Time Complexity
 * This is the worst time complexity.
 * */
public class QuadraticTimeComplexity {
    public static void main(String[] args) {
        printNumbers(100);
    }

    /***
     * method printNumbers
     * arguments (int)
     * the printNumbers take Quadratic time due to the inner loop.
     * So, time complexity is O(n2).
     * O(n) * O(n)
     * n * n = n^2
     * O(n^2)
     * */
    private static void printNumbers(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.println("i="+i+",\tj="+j);
            }
        }
    }
}
