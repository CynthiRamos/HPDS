package syntactic.tree;

public class ConstantNode extends Node {

    private final Type value;

    public ConstantNode(Type value) {
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
