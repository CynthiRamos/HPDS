
package syntacticTreeBinaryOperators;

import junit.framework.Assert;
import org.junit.Test;
import syntactic.tree.BinaryOperatorsNode.MultBinaryOperatorNode;
import syntactic.tree.ConstantNode;

public class MultBinaryOperatorNodeTests {
    @Test
    public void MultBinaryOperatorNodeTests_multZeroZero() {
        ConstantNode multiplicand = new ConstantNode(0);
        ConstantNode multiplier = new ConstantNode(0);
        MultBinaryOperatorNode productBinaryNode = 
                new MultBinaryOperatorNode(multiplicand, multiplier);
        Assert.assertEquals(0, productBinaryNode.evaluate(), 0.0);
    }
    @Test
    public void MultBinaryOperatorNodeTests_multZeroNumbre() {
        ConstantNode multiplicand = new ConstantNode(0);
        ConstantNode multiplier = new ConstantNode(0);
        MultBinaryOperatorNode productBinaryNode = 
                new MultBinaryOperatorNode(multiplicand, multiplier);
        Assert.assertEquals(0, productBinaryNode.evaluate(), 0.0);
    }
    @Test
    public void MultBinaryOperatorNodeTests_multNumberZero() {
        ConstantNode multiplicand = new ConstantNode(0);
        ConstantNode multiplier = new ConstantNode(0);
        MultBinaryOperatorNode productBinaryNode = 
                new MultBinaryOperatorNode(multiplicand, multiplier);
        Assert.assertEquals(0, productBinaryNode.evaluate(), 0.0);
    }
    @Test
    public void MultBinaryOperatorNodeTests_multNormal() {
        ConstantNode multiplicand = new ConstantNode(10);
        ConstantNode multiplier = new ConstantNode(58);
        MultBinaryOperatorNode productBinaryNode = 
                new MultBinaryOperatorNode(multiplicand, multiplier);
        Assert.assertEquals(580, productBinaryNode.evaluate(), 0.0);
    }
    @Test
    public void MultBinaryOperatorNodeTests_multZeroNegative() {
        ConstantNode multiplicand = new ConstantNode(0);
        ConstantNode multiplier = new ConstantNode(-500);
        MultBinaryOperatorNode productBinaryNode = 
                new MultBinaryOperatorNode(multiplicand, multiplier);
        Assert.assertEquals(0, productBinaryNode.evaluate(), 0.0);
    }
    @Test
    public void MultBinaryOperatorNodeTests_multNegativeNumbers() {
        ConstantNode multiplicand = new ConstantNode(-259);
        ConstantNode multiplier = new ConstantNode(-2364);
        MultBinaryOperatorNode productBinaryNode = 
                new MultBinaryOperatorNode(multiplicand, multiplier);
        Assert.assertEquals(612276, productBinaryNode.evaluate(), 0.0);
    }
    @Test
    public void MultBinaryOperatorNodeTests_multNegativeNumber() {
        ConstantNode multiplicand = new ConstantNode(-259);
        ConstantNode multiplier = new ConstantNode(2364);
        MultBinaryOperatorNode productBinaryNode = 
                new MultBinaryOperatorNode(multiplicand, multiplier);
        Assert.assertEquals(-612276, productBinaryNode.evaluate(), 0.0);
    }
}
