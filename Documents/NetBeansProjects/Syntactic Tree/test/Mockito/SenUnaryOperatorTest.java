package Mockito;



import Operators.UnaryOperatorNode;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class SenUnaryOperatorTest {

    @Test
    public void SenUnaryOperatorTest() {
        UnaryOperatorNode unaryNode = mock(UnaryOperatorNode.class);
        when(unaryNode.sin()).thenReturn("0");
        assertEquals("0", unaryNode.sin());

    }
}
