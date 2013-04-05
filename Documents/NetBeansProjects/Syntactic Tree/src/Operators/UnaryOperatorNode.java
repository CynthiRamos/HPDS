
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
    
    public Object sin(){
    
        throw new UnsupportedOperationException("Not yet implemented");
   
    }
    public Object cos(){
    
        throw new UnsupportedOperationException("Not yet implemented");
   
    }
    
}
