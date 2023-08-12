import java.util.ArrayList;

public class ArrayListSearching {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Sumanta");
        stringArrayList.add("Shadab");
        stringArrayList.add("Swastik");
        stringArrayList.add("Swagat");
        stringArrayList.add("Satya");
        String target = "Swagat";
        /*for (String each : stringArrayList) {
            if(each.equals(target)){
                System.out.println("Element is found");
                break;
            }
        }*/

        int index = stringArrayList.indexOf(target);
        System.out.println("Index of target object is "+index);

    }
}
