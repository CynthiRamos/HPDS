
package Operators;

public class Operator {
    
    public static final Operator add = new Operator("add", '+', OperatorTypes.Binary);
    public static final Operator sub = new Operator("sub", '-', OperatorTypes.Binary);
    public static final Operator mult = new Operator("mult", '*', OperatorTypes.Binary);
    public static final Operator div = new Operator("div", '/', OperatorTypes.Binary);
    
    private final String name;
    private final char Operator;
    private final OperatorTypes operatorType;

    public Operator(String name, char Operator, OperatorTypes operatorType) {
        this.name = name;
        this.Operator = Operator;
        this.operatorType = operatorType;
    }
    
    public String getName() {
        return name;
    }

    public char getOperator() {
        return Operator;
    }

    public OperatorTypes getOperatorType() {
        return operatorType;
    }
                
}
