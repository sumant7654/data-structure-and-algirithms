import java.util.ArrayList;

public class ArrayListInsertion {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2,4);
        arrayList.add(3);
        System.out.println(arrayList);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Sumanta");
        stringList.add("Kumar");
        stringList.add(1,"Sahoo");
        System.out.println(stringList);
    }
}
