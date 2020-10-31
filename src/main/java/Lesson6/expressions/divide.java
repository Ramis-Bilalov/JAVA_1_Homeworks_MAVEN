package Lesson6.expressions;

public class divide extends binaryExpression{

    public divide(Expression left, Expression right) {
        super(left, right);
        operation = "/";
    }

    @Override
    int apply() {
        return left.apply() / right.apply();
    }
}
