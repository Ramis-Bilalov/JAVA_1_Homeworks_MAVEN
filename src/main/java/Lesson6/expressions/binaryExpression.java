package Lesson6.expressions;

public abstract class binaryExpression extends Expression{

    public binaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
