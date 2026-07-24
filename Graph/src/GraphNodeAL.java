import java.util.ArrayList;

public class GraphNodeAL {
    public String name;
    private int index;
    public ArrayList<GraphNodeAL> neighbors = new ArrayList<>();

    public GraphNodeAL(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
