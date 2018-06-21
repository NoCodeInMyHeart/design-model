package composite;

public class Tree {

    private TreeNode node;

    Tree(TreeNode node){
        this.node = node;
    }
    
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode("A");
        TreeNode node2 = new TreeNode("B");
        TreeNode node3 = new TreeNode("C");
        Tree tree = new Tree(node1);
        node1.add(node2);
        node2.add(node3);
        System.out.println(tree.node.getName());
        System.out.println(tree.node.getChildren());
    }
}
