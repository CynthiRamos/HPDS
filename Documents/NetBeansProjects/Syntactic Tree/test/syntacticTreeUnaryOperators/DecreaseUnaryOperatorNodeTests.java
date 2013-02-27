package syntacticTreeUnaryOperators;

import junit.framework.Assert;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.UnaryOperationalNodes.DecreaseUnaryOperatorNode;

public class DecreaseUnaryOperatorNodeTests {
    @Test
    public void DecreaseUnaryOperatorNodeTests_Zero() {
        ConstantNode number = new ConstantNode(0);
        DecreaseUnaryOperatorNode decrease = 
                new DecreaseUnaryOperatorNode(number);
        Assert.assertEquals(-1, decrease.evaluate(), 0.0);
    }
    @Test
    public void DecreaseUnaryOperatorNodeTests_NegativeNumber() {
        ConstantNode number = new ConstantNode(-10);
        DecreaseUnaryOperatorNode decrease = 
                new DecreaseUnaryOperatorNode(number);
        Assert.assertEquals(-11, decrease.evaluate(), 0.0);
    }
    @Test
    public void DecreaseUnaryOperatorNodeTests_PositiveNumber() {
        ConstantNode number = new ConstantNode(28);
        DecreaseUnaryOperatorNode decrease = 
                new DecreaseUnaryOperatorNode(number);
        Assert.assertEquals(27, decrease.evaluate(), 0.0);
    }
    
}
