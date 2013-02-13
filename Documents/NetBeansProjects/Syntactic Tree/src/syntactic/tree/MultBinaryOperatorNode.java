/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syntactic.tree;

/**
 *
 * @author Cynthi
 */
public class MultBinaryOperatorNode extends BinaryOperatorNode {

    public MultBinaryOperatorNode(Node left, Node right) {
        super(left, right);
    }
    
    @Override
    public double evaluate() {
        return this.getLeft().evaluate()*this.getRight().evaluate();
    }

}
