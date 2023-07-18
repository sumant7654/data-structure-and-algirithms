import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperature?");
        int days = sc.nextInt();
        int[] temperatures = new int[days];

        // record temperature
        int sum = 0;
        for(int i = 0; i < days; i++){
            System.out.println("Enter highest temperature for day "+(i+1));
            temperatures[i] = sc.nextInt();
            sum +=temperatures[i];
        }
        double average = sum / days;
        System.out.println("Average Temperature is "+average);
        TemperatureCalculator object = new TemperatureCalculator();
        object.findDaysAboveAverageTemperature(temperatures, average);
    }

    private void findDaysAboveAverageTemperature(int[] temperatures, double average) {
        int above = 0;
        for(int i = 0; i < temperatures.length; i++){
            if(temperatures[i] > average){
                above++;
            }
        }
        System.out.println(above+" days above average temperature");
    }

}
