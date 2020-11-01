package Lesson6.HOMEWORK;

public abstract class Animal {

    protected int runDistance;
    protected double jumpHeight;
    protected int swimDistance;
    protected double value;

    public abstract void getRunDistance(Animal animal, double value);

    public abstract void getJumpHeight(Animal animal, double value);

    public abstract void getSwimDistance(Animal animal, double value);

    public abstract double getValue();

}
