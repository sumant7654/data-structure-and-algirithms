import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(100);
        arrayList.add(67);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);


        HashSet<Integer> integers = new HashSet<>(arrayList);
        System.out.println(integers);
    }

}
