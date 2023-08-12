public class SumAndProductOfElements {
    public static void main(String[] args) {
        int[] intArray = {11,22,33,1,2,34,5,6,7,8,9,};
        int sum = 0, product = 1;
        for(int i = 0; i < intArray.length; i++){
            sum += intArray[i];
            product *= intArray[i];
        }
    }
}
