package Operators;

import Types.DoubleType;
import Types.IntegerType;
import static org.junit.Assert.*;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.Node;

public class divBinaryOperatorTest {

    @Test
    public void AddBinaryOperatorTest_int_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(35)),
                new ConstantNode(new IntegerType(5)), Operator.div);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(7.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }

    @Test
    public void AddBinaryOperatorTest_int_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new IntegerType(-44)),
                new ConstantNode(new DoubleType(2.0)), Operator.div);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(-22.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }

    @Test
    public void AddBinaryOperatorTest_double_int() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(-35.0)),
                new ConstantNode(new IntegerType(-7)), Operator.div);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(5.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }

    @Test
    public void AddBinaryOperatorTest_double_double() {
        Node binaryNode;
        binaryNode = new BinaryOperatorNode(new ConstantNode(new DoubleType(0.0)),
                new ConstantNode(new DoubleType(1.0)), Operator.div);
        assertEquals(DoubleType.class, binaryNode.evaluate().getClass());
        assertEquals(0.0, (double) binaryNode.evaluate().getValue(), 0.0);
    }
}
