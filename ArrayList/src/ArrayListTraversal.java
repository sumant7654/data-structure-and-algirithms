import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Sumanta");
        stringArrayList.add("Shadab");
        stringArrayList.add("Swastik");
        stringArrayList.add("Swagat");
        stringArrayList.add("Satya");
        /*for(int i = 0; i < stringArrayList.size(); i++){
            System.out.println(stringArrayList.get(i));
        }*/
        /*for(String each : stringArrayList){
            System.out.println(each);
        }*/

        Iterator<String> iterator = stringArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
