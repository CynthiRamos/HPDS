/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syntacticTreeUnaryOperators;
//todo
import junit.framework.Assert;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.UnaryOperationalNodes.CosUnaryOperatorNode;


public class CosUnaryOperatorNodeTests {
    
    @Test
    public void CosUnaryOperatorNodeTests_Zero() {
        ConstantNode angle = new ConstantNode(0);
        CosUnaryOperatorNode cos = new CosUnaryOperatorNode(angle);
        Assert.assertEquals(1, cos.evaluate(), 0.0);
    }
    
    @Test
    public void CosUnaryOperatorNodeTests_90() {
        ConstantNode angle = new ConstantNode(90);
        CosUnaryOperatorNode cos = new CosUnaryOperatorNode(angle);
        Assert.assertEquals(-0.448, cos.evaluate(), 0.001);
    }
    
    @Test
    public void CosUnaryOperatorNodeTests_Negative90() {
        ConstantNode angle = new ConstantNode(-90);
        CosUnaryOperatorNode cos = new CosUnaryOperatorNode(angle);
        Assert.assertEquals(-0.448, cos.evaluate(), 0.001);
    }
    
    @Test
    public void CosUnaryOperatorNodeTests_180() {
        ConstantNode angle = new ConstantNode(0);
        CosUnaryOperatorNode cos = new CosUnaryOperatorNode(angle);
        Assert.assertEquals(1, cos.evaluate(), 0.0);
    }
    
    @Test
    public void CosUnaryOperatorNodeTests_270() {
        ConstantNode angle = new ConstantNode(90);
        CosUnaryOperatorNode cos = new CosUnaryOperatorNode(angle);
        Assert.assertEquals(-0.448, cos.evaluate(), 0.001);
    }
   
}
