package Lesson6.expressions;

public class sum extends binaryExpression {


    public sum(Expression left, Expression right) {
        super(left, right);
        operation = "+";
    }

    @Override
    int apply() {
        return left.apply() + right.apply();
    }
}
