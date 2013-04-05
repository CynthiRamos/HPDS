
package Operators;

import Calculator.Calculator;
import Types.DoubleType;
import Types.IntegerType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import syntactic.tree.Node;
import syntactic.tree.Type;

public class BinaryOperatorNode extends Operation {
    private final Node left, right;
    private final Operator operator;

    public BinaryOperatorNode(Node left, Node right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public Type evaluate(){
        Type tLeft = getLeft().evaluate();
        Type tRight = getRight().evaluate(); 
        Calculator calculator = Calculation.typesDescriptorCalculator(tLeft, tRight);
        return Calculate( calculator, tLeft, tRight);
    }
    
    
    
    private Type Calculate(Calculator calculator, Type left, Type right){
        try{
            if(calculator == null){
                return null;
            }
            Method method = calculator.getClass().getMethod(operator.getName(), left.getValue().getClass(), right.getValue().getClass());
            return typesDescriptor(method.invoke(calculator, left.getValue(), right.getValue()));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperatorNode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            return null;
        }
        return null;    
    }
    
     private Type typesDescriptor(Object object) {
        if (object instanceof Double) {
            return new DoubleType((double) object);
        }
        if (object instanceof Integer) {
            return new IntegerType((int) object);
        }
        return null;

    }
}
