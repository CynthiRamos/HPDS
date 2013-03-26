
package Operators;

import Types.DoubleType;
import Types.IntegerType;
import static org.junit.Assert.*;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.Node;


public class subBinaryOperatorTest {
    @Test
    public void subBinaryOperatorTest_Int_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(35)),
                new ConstantNode(new IntegerType(7)), Operator.sub);
        assertEquals(IntegerType.class, binaryNode.evaluate().getClass());
        assertEquals(28, (int) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void AddBinaryOperatorTest_int_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(4)),
                new ConstantNode(new DoubleType(45.0)), Operator.sub);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(-41.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void AddBinaryOperatorTest_double_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(-24.0)),
                new ConstantNode(new IntegerType(-28)), Operator.sub);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(4.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
    
    @Test
    public void AddBinaryOperatorTest_double_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(-35.0)),
                new ConstantNode(new DoubleType(-5680.0)), Operator.sub);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(5645.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }           
 }
    
