
package Operators;

import Types.DoubleType;
import Types.IntegerType;
import static org.junit.Assert.*;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.Node;


public class MultBinaryOperatorNodeTest {
    
    @Test
    public void MultBinaryOperatorNodeTest_int_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(0)),
                new ConstantNode(new IntegerType(-22)), Operator.mult);
        assertEquals(IntegerType.class, binaryNode.evaluate().getClass());
        assertEquals(0, (int) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void MultBinaryOperatorTest_int_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(-259)),
                new ConstantNode(new DoubleType(-2364.0)), Operator.mult);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(612276.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void MultBinaryOperatorTest_double_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(-259.0)),
                new ConstantNode(new IntegerType(2364)), Operator.mult);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(-612276.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void MultBinaryOperatorTest_double_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(0.0)),
                new ConstantNode(new DoubleType(0.0)), Operator.mult);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(0.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
    
}
