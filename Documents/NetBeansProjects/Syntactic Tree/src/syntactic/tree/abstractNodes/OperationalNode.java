package syntactic.tree.abstractNodes;

import syntactic.tree.Node;

public abstract class OperationalNode extends Node{

    public OperationalNode() {
        
    }
    
    @Override
    public abstract double evaluate();
    
}
