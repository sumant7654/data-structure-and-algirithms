/***
 * @Author Sumanta Kumar
 * This is an example to Drop Constant on Linear Time Complexity
 * This is the average time complexity.
 * */
public class DropConstantOnLinearTimeComplexity {
    public static void main(String[] args) {
        printNumbers(100000);
    }

    /***
     * method printNumbers
     * arguments (int)
     * the printNumbers take linear time i.e. depends on the value of n.
     * It will execute the loop n time(s).
     * We have 2 loops, so it will take time twice.
     * So, time complexity is O(2n).
     * O(n) + O(n)
     * n + n = 2n
     * O(2n)
     * NOTE : If we are able to decrease the time complexity from O(2n) to O(n) then,
     * it is called Drop constants
     * */
    public static void printNumbers(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        for(int j = 1; j <= n; j++){
            System.out.println(j);
        }
    }
}

