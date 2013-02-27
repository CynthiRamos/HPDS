
package syntacticTreeUnaryOperators;

import org.junit.Assert;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.UnaryOperationalNodes.IncreaseUnaryOperatorNode;

public class IncreaseUnaryOperatorNodeTests {
    @Test
    public void IncreaseUnaryOperatorNodeTests_Zero() {
        ConstantNode number = new ConstantNode(0);
        IncreaseUnaryOperatorNode increase = 
                new IncreaseUnaryOperatorNode(number);
        Assert.assertEquals(1, increase.evaluate(), 0);  
    }
    @Test
    public void IncreaseUnaryOperatorNodeTests_number() {
        ConstantNode number = new ConstantNode(15);
        IncreaseUnaryOperatorNode increase = 
                new IncreaseUnaryOperatorNode(number);
        Assert.assertEquals(16, increase.evaluate(), 0);  
    }
    @Test
    public void IncreaseUnaryOperatorNodeTests_negativenumber() {
        ConstantNode number = new ConstantNode(-15);
        IncreaseUnaryOperatorNode increase = 
                new IncreaseUnaryOperatorNode(number);
        Assert.assertEquals(-14, increase.evaluate(), 0);  
    }
    
  }
