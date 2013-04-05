
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
        return Calculation.Calculate( calculator, tLeft, tRight, operator);
    
    } 
}
