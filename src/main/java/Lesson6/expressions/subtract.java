package Lesson6.expressions;

public class subtract extends binaryExpression{


    public subtract(Expression left, Expression right) {
        super(left, right);
        operation = "-";
    }

    @Override
    int apply() {
        return left.apply() - right.apply();
    }
}
