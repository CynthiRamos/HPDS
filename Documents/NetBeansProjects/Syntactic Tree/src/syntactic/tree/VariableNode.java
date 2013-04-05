package syntactic.tree;

public class VariableNode extends Node {

    private final Type value;

    public VariableNode(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    @Override
    public Type evaluate() {
        return this.value;
    }
}
