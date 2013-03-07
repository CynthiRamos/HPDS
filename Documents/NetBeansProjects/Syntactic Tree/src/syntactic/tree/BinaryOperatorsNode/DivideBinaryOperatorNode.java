
package syntactic.tree.BinaryOperatorsNode;

import syntactic.tree.Node;
import syntactic.tree.abstractNodes.BinaryOperatorNode;

public class DivideBinaryOperatorNode extends BinaryOperatorNode{

    public DivideBinaryOperatorNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        
        if (this.getRight().evaluate() == 0.0) {
            throw new RuntimeException("indeterminate");
        }    
        return (this.getLeft().evaluate())/(this.getRight().evaluate());
    }
    
}


