
package syntactic.tree.UnaryOperationalNodes;

import syntactic.tree.Node;
import syntactic.tree.abstractNodes.UnaryOperatorNode;


public class IncreaseUnaryOperatorNode extends UnaryOperatorNode {

    public IncreaseUnaryOperatorNode(Node center) {
        super(center);
    }

    @Override
    public double evaluate() {
        return this.getCenter().evaluate()+1;
    }
    
}


