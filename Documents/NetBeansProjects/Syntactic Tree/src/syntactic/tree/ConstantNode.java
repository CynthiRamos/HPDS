/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syntactic.tree;

public class ConstantNode extends Node {
    
    private double operating;

    public ConstantNode(double operating) {
        this.operating = operating;
    }

    @Override
    public double evaluate() {
       return this.operating;
    }

}
