package syntacticTreeTest;

import Types.DoubleType;
import Types.IntegerType;
import static org.junit.Assert.*;
import org.junit.Test;
import syntactic.tree.ConstantNode;

public class ConstantNodeTest {

    @Test
    public void ConstantNodeTest_Integer() {
        ConstantNode constant = new ConstantNode(new IntegerType(3));
        assertEquals(IntegerType.class, constant.evaluate().getClass());
        assertEquals(3, (int) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void ConstantNodeTest_IntegerNegative() {
        ConstantNode constant = new ConstantNode(new IntegerType(-3));
        assertEquals(IntegerType.class, constant.evaluate().getClass());
        assertEquals(-3, (int) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void ConstantNodeTest_IntegerZero() {
        ConstantNode constant = new ConstantNode(new IntegerType(0));
        assertEquals(IntegerType.class, constant.evaluate().getClass());
        assertEquals(0, (int) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void ConstantNodeTest_Double() {
        ConstantNode constant = new ConstantNode(new DoubleType(10.0));
        assertEquals(DoubleType.class, constant.evaluate().getClass());
        assertEquals(10.0, (double) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void ConstantNodeTest_Double_Negative() {
        ConstantNode constant = new ConstantNode(new DoubleType(-10.0));
        assertEquals(DoubleType.class, constant.evaluate().getClass());
        assertEquals(-10.0, (double) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void ConstantNodeTest_Double_Zero() {
        ConstantNode constant = new ConstantNode(new DoubleType(0.0));
        assertEquals(DoubleType.class, constant.evaluate().getClass());
        assertEquals(0.0, (double) constant.evaluate().getValue(), 0.0);
    }
}
