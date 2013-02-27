
package syntactic.tree.UnaryOperationalNodes;

import syntactic.tree.Node;
import syntactic.tree.abstractNodes.UnaryOperatorNode;

public class CosUnaryOperatorNode extends UnaryOperatorNode {

    public CosUnaryOperatorNode(Node center) {
        super(center);
    }

    @Override
    public double evaluate() {
        return Math.cos(this.getCenter().evaluate());
    }
    
}
