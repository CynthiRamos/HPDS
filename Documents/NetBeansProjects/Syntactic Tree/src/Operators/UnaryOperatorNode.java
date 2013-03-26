
package Operators;

import syntactic.tree.Node;
import syntactic.tree.Type;

public abstract class UnaryOperatorNode extends Operation  {
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
    public abstract Type evaluate();
    
}
