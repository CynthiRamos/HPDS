
package syntactic.tree.UnaryOperationalNodes;

import syntactic.tree.Node;
import syntactic.tree.abstractNodes.UnaryOperatorNode;
public class SinUnaryOperatorNode extends UnaryOperatorNode{

    public SinUnaryOperatorNode(Node center) {
        super(center);
    }

    
    @Override
    public double evaluate() {
        return Math.sin(this.getCenter().evaluate());
    }
    
    
}
