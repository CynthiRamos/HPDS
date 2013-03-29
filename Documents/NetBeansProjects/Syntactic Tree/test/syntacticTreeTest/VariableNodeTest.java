
package syntacticTreeTest;

import Types.DoubleType;
import Types.IntegerType;
import static org.junit.Assert.*;
import org.junit.Test;
import syntactic.tree.VariableNode;


public class VariableNodeTest {
    
    @Test
    public void VariableNodeTest_Integer() {
        VariableNode variableNode = new VariableNode(new IntegerType(33));
        assertEquals(IntegerType.class, variableNode.evaluate().getClass());
        assertEquals(33, (int) variableNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void VariableNodeTest_Integer_Negative() {
        VariableNode variableNode = new VariableNode(new IntegerType(-123));
        assertEquals(IntegerType.class, variableNode.evaluate().getClass());
        assertEquals(-123, (int) variableNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void VariableNodeTest_IntegerZero() {
        VariableNode variableNode = new VariableNode(new IntegerType(0));
        assertEquals(IntegerType.class, variableNode.evaluate().getClass());
        assertEquals(0, (int) variableNode.evaluate().getValue(), 0.0);
    }  
    
    @Test
    public void VariableNodeTest_Double() {
        VariableNode variableNode = new VariableNode(new DoubleType(48.0));
        assertEquals(DoubleType.class, variableNode.evaluate().getClass());
        assertEquals(48.0, (double) variableNode.evaluate().getValue(), 0.0);
    }
    
     @Test
     public void VariableNodeTest_Double_Negative() {
        VariableNode variableNode = new VariableNode(new DoubleType(-148.0));
        assertEquals(DoubleType.class, variableNode.evaluate().getClass());
        assertEquals(-148.0, (double) variableNode.evaluate().getValue(), 0.0);
    }
}
