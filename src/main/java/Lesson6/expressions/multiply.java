package Lesson6.expressions;

public class multiply extends binaryExpression {

    public multiply(Expression left, Expression right) {
        super(left, right);
        operation = "*";


    }

    @Override
    int apply() {
        return left.apply() * right.apply();
    }
}
