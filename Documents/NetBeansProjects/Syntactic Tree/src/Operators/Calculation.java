
package Operators;

import Calculator.Calculator;
import Calculator.TypesCalculator;
import syntactic.tree.Type;

public class Calculation {

   public static Calculator typesDescriptorCalculator(Type left, Type right){
        
        if(left == null || right == null){
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


}
