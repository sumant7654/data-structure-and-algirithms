import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDelete {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Sumanta","Shadab","Swastik","Swagat","Satya","Sumanta"));
        System.out.println(stringArrayList);
        stringArrayList.remove(3);
        stringArrayList.remove("Sumanta");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(3));
        System.out.println(stringArrayList.get(4));
    }
}
