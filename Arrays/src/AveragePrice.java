public class AveragePrice {
    public static void main(String[] args) {
        int[] prices = {131200,
                131200,
                131600,
                131800,
                129600,
                131200,
                131100,
                125600,
                128600,
                128600,
                130000,
                131000,
                131500,
                131600,
                131500,
                131200,
                132300,
                133200,
                135000,
                135000,
                131200,
                136150,
                132300,
                132200
        };

        findMinMaxAverage(prices);

    }

    private static void findMinMaxAverage(int[] prices) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
            if(prices[i] < min){
                min = prices[i];
            }
            if (prices[i]>max){
                max = prices[i];
            }
        }
        double average = sum/prices.length;
        System.out.println("Average price = "+average);
        System.out.println("Minimum Price is "+min);
        System.out.println("Maximum Price is "+max);
    }


}
