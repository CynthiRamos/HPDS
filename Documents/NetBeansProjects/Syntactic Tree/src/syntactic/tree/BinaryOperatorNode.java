
package syntactic.tree;

public abstract class BinaryOperatorNode extends OperationalNode {
    private Node left, right;

    public BinaryOperatorNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    @Override
    public abstract double evaluate();
}
