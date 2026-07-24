import java.util.ArrayList;

public class TreeNode {
    private String data;
    private ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node){
        this.children.add(node);
    }

    public String print(int level){
        StringBuilder ret;
        ret = new StringBuilder("\t".repeat(level)+ data + "\n");
        for(TreeNode each : this.children){
            ret.append(each.print(level + 1));
        }
        return ret.toString();
    }
}
