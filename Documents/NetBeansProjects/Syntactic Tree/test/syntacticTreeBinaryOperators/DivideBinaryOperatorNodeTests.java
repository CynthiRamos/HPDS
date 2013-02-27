
package syntacticTreeBinaryOperators;

import junit.framework.Assert;
import org.junit.Test;
import syntactic.tree.BinaryOperatorsNode.DivideBinaryOperatorNode;
import syntactic.tree.BinaryOperatorsNode.SubtractBinaryOperatorNode;
import syntactic.tree.ConstantNode;


public class DivideBinaryOperatorNodeTests {
   
    @Test
    public void DivideBinaryOperatorNodeTestsPositiveNumbers() {
        ConstantNode dividendo = new ConstantNode(35);
        ConstantNode divisor = new ConstantNode(5);
        DivideBinaryOperatorNode div = new DivideBinaryOperatorNode(dividendo, divisor);
        Assert.assertEquals(7, div.evaluate(), 0.0);
    }
    
    @Test
    public void DivideBinaryOperatorNodeTestsZero_Numbre() {
        ConstantNode dividendo = new ConstantNode(0);
        ConstantNode divisor = new ConstantNode(5);
        DivideBinaryOperatorNode div = new DivideBinaryOperatorNode(dividendo, divisor);
        Assert.assertEquals( 0, div.evaluate(), 0.0);
    }
    
    @Test
    public void DivideBinaryOperatorNodeTests_NumberZero() {
        ConstantNode dividendo = new ConstantNode(10);
        ConstantNode divisor = new ConstantNode(0);
        DivideBinaryOperatorNode div = new DivideBinaryOperatorNode(dividendo, divisor);
       // Assert.assertEquals( "Infinity", div.evaluate(), 0.0);
    }
    
}
