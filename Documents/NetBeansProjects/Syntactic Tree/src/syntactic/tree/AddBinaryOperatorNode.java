
package syntactic.tree;

public class AddBinaryOperatorNode extends BinaryOperatorNode {

   
    public AddBinaryOperatorNode(Node left, Node right) {
        super(left, right);
    }

        
    @Override
    public double evaluate() {
        return this.getLeft().evaluate() + this.getRight().evaluate();
    }  
}
