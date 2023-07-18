/***
 * @Author Sumanta Kumar
 * This is an example to Quadratic Time Complexity
 * This is the worst time complexity.
 * */
public class DropNonDominatingTermsOnQuadraticTimeComplexity {
    public static void main(String[] args) {
        printNumbers(100);
    }

    /***
     * method printNumbers
     * arguments (int)
     * the printNumbers take Quadratic time due to the inner loop.
     * So, time complexity is O(n2+n).
     * O(n) * O(n) + O(n)
     * n * n + n = n^2+n
     * O(n^2+n)
     * */
    private static void printNumbers(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.println("i="+i+",\tj="+j);
            }
        }
        for(int k = 0; k <= n; k++){
            System.out.println(k);
        }
    }
}
