
package syntacticTreeUnaryOperators;

import org.junit.Assert;
import org.junit.Test;
import syntactic.tree.ConstantNode;
import syntactic.tree.UnaryOperationalNodes.IncreaseUnaryOperatorNode;

public class IncreaseUnaryOperatorNodeTests {
    @Test
    public void IncreaseUnaryOperatorNodeTests_Zero() {
        ConstantNode number = new ConstantNode(0);
        IncreaseUnaryOperatorNode increase = 
                new IncreaseUnaryOperatorNode(number);
     
       
    }
    
  }
