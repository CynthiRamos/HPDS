/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syntactic.tree.BinaryOperatorsNode;

import syntactic.tree.Node;
import syntactic.tree.abstractNodes.BinaryOperatorNode;

/**
 *
 * @author Cynthi
 */
public class SubtractBinaryOperatorNode extends BinaryOperatorNode {

    public SubtractBinaryOperatorNode(Node left, Node right) {
        super(left, right);
    }
    
    @Override
    public double evaluate() {
        return this.getLeft().evaluate() - this.getRight().evaluate();
    }
    
}
