import java.util.ArrayList;

public class GraphAL {
    ArrayList<GraphNodeAL> nodeList = new ArrayList<>();
    public GraphAL(ArrayList<GraphNodeAL> nodeList) {
        this.nodeList = nodeList;
    }
    public void addUndirectedEdge(int i, int j){
        GraphNodeAL first = nodeList.get(i);
        GraphNodeAL second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< nodeList.size(); i++){
            sb.append(nodeList.get(i).name + ": ");
            for(int j = 0; j < nodeList.get(i).neighbors.size();j++){
                if(j == nodeList.get(i).neighbors.size()-1){
                    sb.append((nodeList.get(i).neighbors.get(j).name));
                }else{
                    sb.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
