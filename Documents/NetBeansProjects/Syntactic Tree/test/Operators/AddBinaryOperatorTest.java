
package Operators;
import Types.DoubleType;
import Types.IntegerType;
import static org.junit.Assert.*;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.Node;


public class AddBinaryOperatorTest {
    
    @Test
    public void AddBinaryOperatorTest_int_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(0)),
                new ConstantNode(new IntegerType(22)), Operator.add);
        assertEquals(IntegerType.class, binaryNode.evaluate().getClass());
        assertEquals(22, (int) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void AddBinaryOperatorTest_int_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(-4)),
                new ConstantNode(new DoubleType(22.0)), Operator.add);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(18.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void AddBinaryOperatorTest_double_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(-4.0)),
                new ConstantNode(new IntegerType(-22)), Operator.add);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(-26.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void AddBinaryOperatorTest_double_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(4.0)),
                new ConstantNode(new DoubleType(22.0)), Operator.add);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(26.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
}
