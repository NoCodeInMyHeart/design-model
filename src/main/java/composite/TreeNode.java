package composite;

import java.util.Vector;

/**
 * @author meng.yang
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector();

    TreeNode(String name){
        this.name = name;
    }

    public void add(TreeNode node){
        children.add(node);
    }

    public void delete(TreeNode node){
        children.remove(node);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
}
