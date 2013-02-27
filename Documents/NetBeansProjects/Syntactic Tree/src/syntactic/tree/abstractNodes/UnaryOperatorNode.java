
package syntactic.tree.abstractNodes;

import syntactic.tree.Node;

public abstract class UnaryOperatorNode extends OperationalNode  {
    private Node center;

    public UnaryOperatorNode(Node center) {
        this.center = center;
    }

    public Node getCenter() {
        return center;
    }

    public void setCenter(Node center) {
        this.center = center;
    }
    
    @Override
    public abstract double evaluate();
    
}
