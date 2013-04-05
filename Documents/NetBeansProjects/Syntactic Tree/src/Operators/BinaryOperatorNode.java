package Operators;

import Calculator.Calculator;
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
    public Type evaluate() {
        Type tLeft = getLeft().evaluate();
        Type tRight = getRight().evaluate();
        Calculator calculator = Calculation.typesDescriptorCalculator(tLeft, tRight);
        return Calculation.Calculate(calculator, tLeft, tRight, operator);

    }
}
