
package syntactic.tree.BinaryOperatorsNode;

import syntactic.tree.Node;
import syntactic.tree.abstractNodes.BinaryOperatorNode;


public class MultBinaryOperatorNode extends BinaryOperatorNode {

    public MultBinaryOperatorNode(Node left, Node right) {
        super(left, right);
    }
    
    @Override
    public double evaluate() {
        return this.getLeft().evaluate()*this.getRight().evaluate();
    }

}
