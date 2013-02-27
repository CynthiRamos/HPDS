
package syntacticTreeBinaryOperators;

import junit.framework.Assert;
import org.junit.Test;
import syntactic.tree.BinaryOperatorsNode.SubtractBinaryOperatorNode;
import syntactic.tree.ConstantNode;

public class SubtractBinaryOperatorTests {
    @Test
    public void SubtractBinaryOperatorTests_PositiveNumbers() {
        ConstantNode minuendo =  new ConstantNode(35);
        ConstantNode sustraendo = new ConstantNode(7);
        SubtractBinaryOperatorNode dec =  
                new SubtractBinaryOperatorNode(minuendo, sustraendo);
        Assert.assertEquals(28, dec.evaluate(), 0.0);
    }
    
    @Test
    public void SubtractBinaryOperatorTests_ZeroNumber() {
        ConstantNode minuendo =  new ConstantNode(0);
        ConstantNode sustraendo = new ConstantNode(45);
        SubtractBinaryOperatorNode dec =  
                new SubtractBinaryOperatorNode(minuendo, sustraendo);
        Assert.assertEquals(-45, dec.evaluate(), 0.0);
    }
    
    @Test
    public void SubtractBinaryOperatorTests_NumberZero() {
        ConstantNode minuendo =  new ConstantNode(4568);
        ConstantNode sustraendo = new ConstantNode(0);
        SubtractBinaryOperatorNode dec =  
                new SubtractBinaryOperatorNode(minuendo, sustraendo);
        Assert.assertEquals(4568, dec.evaluate(), 0.0);
    }
    
    @Test
    public void SubtractBinaryOperatorTests_NegativeNumbers() {
        ConstantNode minuendo =  new ConstantNode(-35);
        ConstantNode sustraendo = new ConstantNode(-4561);
        SubtractBinaryOperatorNode dec =  
                new SubtractBinaryOperatorNode(minuendo, sustraendo);
        Assert.assertEquals(4526, dec.evaluate(), 0.0);
    }
    
}
