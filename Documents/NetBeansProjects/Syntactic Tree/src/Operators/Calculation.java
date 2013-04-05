package Operators;

import Calculator.Calculator;
import Calculator.TypesCalculator;
import Types.DoubleType;
import Types.IntegerType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import syntactic.tree.Type;

public class Calculation {

    public static Calculator typesDescriptorCalculator(Type left, Type right) {

        if (left == null || right == null) {
            return null;
        }
        if ((left.getValue() instanceof Integer) && (right.getValue() instanceof Integer)) {
            return new TypesCalculator();
        }
        if ((left.getValue() instanceof Integer) && (right.getValue() instanceof Double)) {
            return new TypesCalculator();
        }
        if ((left.getValue() instanceof Double) && (right.getValue() instanceof Integer)) {
            return new TypesCalculator();
        }
        if ((left.getValue() instanceof Double) && (right.getValue() instanceof Double)) {
            return new TypesCalculator();
        }
        return null;
    }

    public static Type Calculate(Calculator calculator, Type left, Type right, Operator operator) {
        try {
            if (calculator == null) {
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

    private static Type typesDescriptor(Object object) {
        if (object instanceof Double) {
            return new DoubleType((double) object);
        }
        if (object instanceof Integer) {
            return new IntegerType((int) object);
        }
        return null;

    }
}
