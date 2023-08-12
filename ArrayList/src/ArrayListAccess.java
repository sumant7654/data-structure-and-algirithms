import java.util.ArrayList;

public class ArrayListAccess {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Sumanta");
        stringList.add("Kumar");
        stringList.add(1, "Sahoo");
        System.out.println(stringList.get(1));
    }
}
