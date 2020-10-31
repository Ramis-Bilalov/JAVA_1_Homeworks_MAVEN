package Lesson6.classwork;

public class B extends A {

    private int b;

    public B(int a, int b) {
        super(a);
        System.out.println("B created");
        this.b = b;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return super.toString() + "B{" +
                "b=" + b +
                '}';
    }

    @Override
    public int inc() {
        return ++b;
    }
}
