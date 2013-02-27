
package syntacticTreeUnaryOperators;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import syntactic.tree.ConstantNode;
import syntactic.tree.UnaryOperationalNodes.SinUnaryOperatorNode;


public class SinUnaryOperatorNodeTests {

    @Test
    public void SinUnaryOperatorNodeTests_Zero() {
        ConstantNode angle = new ConstantNode(0);
        SinUnaryOperatorNode sin = new SinUnaryOperatorNode(angle);
        Assert.assertEquals(0, sin.evaluate(), 0.0);
    }
    
    @Test
    public void SinUnaryOperatorNodeTests_90() {
        ConstantNode angle = new ConstantNode(90);
        SinUnaryOperatorNode sin = new SinUnaryOperatorNode(angle);
        Assert.assertEquals(0.894, sin.evaluate(), 0.001);
    }
    
    @Test
    public void SinUnaryOperatorNodeTests_270() {
        ConstantNode angle = new ConstantNode(270);
        SinUnaryOperatorNode sin = new SinUnaryOperatorNode(angle);
        Assert.assertEquals(-0.176, sin.evaluate(), 0.001);
    }
    
    @Test
    public void SinUnaryOperatorNodeTests_Negative90() {
        ConstantNode angle = new ConstantNode(-90);
        SinUnaryOperatorNode sin = new SinUnaryOperatorNode(angle);
        Assert.assertEquals(-0.894, sin.evaluate(), 0.001);
    }    
   
}
