/***
 * @Author Sumanta Kumar
 * This is an example to Linear Time Complexity
 * This is the average time complexity.
 * */
public class LinearTimeComplexity {
    public static void main(String[] args) {
        printNumbers(100000);
    }

    /***
     * method printNumbers
     * arguments (int)
     * the printNumbers take linear time i.e. depends on the value of n.
     * It will execute the loop n time(s).
     * So, the time complexity is linear i.e. O(n).
     * */
    public static void printNumbers(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
