/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syntacticTreeBinaryOperators;

import junit.framework.Assert;
import org.junit.Test;
import syntactic.tree.BinaryOperatorsNode.AddBinaryOperatorNode;
import syntactic.tree.ConstantNode;

/**
 *
 * @author Cynthi
 */
public class AddBinaryOperatorNodeTests {
    
    @Test
    public void AddBinaryOperatorNodeTests_addZeroNumber() {
        ConstantNode adder1 = new ConstantNode(0);
        ConstantNode adder2 = new ConstantNode(10);
        AddBinaryOperatorNode addBinaryNode = new AddBinaryOperatorNode(adder1, adder2);
        Assert.assertEquals(10, addBinaryNode.evaluate(), 0.0);
    }
    @Test   
    public void AddBinaryOperatorNodeTests_addZeroZero() {
        ConstantNode adder1 = new ConstantNode(0);
        ConstantNode adder2 = new ConstantNode(0);
        AddBinaryOperatorNode addBinaryNode = new AddBinaryOperatorNode(adder1, adder2);
        Assert.assertEquals(0, addBinaryNode.evaluate(), 0.0);
    }
    @Test   
    public void AddBinaryOperatorNodeTests_addNormal() {
        ConstantNode adder1 = new ConstantNode(20);
        ConstantNode adder2 = new ConstantNode(70);
        AddBinaryOperatorNode addBinaryNode = new AddBinaryOperatorNode(adder1, adder2);
        Assert.assertEquals(90, addBinaryNode.evaluate(), 0.0);
    }
    @Test   
    public void AddBinaryOperatorNodeTests_addBigNumbers() {
        ConstantNode adder1 = new ConstantNode(123456789);
        ConstantNode adder2 = new ConstantNode(123456789);
        AddBinaryOperatorNode addBinaryNode = new AddBinaryOperatorNode(adder1, adder2);
        Assert.assertEquals(246913578, addBinaryNode.evaluate(), 0.0);
    }
    @Test   
    public void AddBinaryOperatorNodeTests_addNegativeNumbers() {
        ConstantNode adder1 = new ConstantNode(-598);
        ConstantNode adder2 = new ConstantNode(-592);
        AddBinaryOperatorNode addBinaryNode = new AddBinaryOperatorNode(adder1, adder2);
        Assert.assertEquals(-1190, addBinaryNode.evaluate(), 0.0);
    }
}
