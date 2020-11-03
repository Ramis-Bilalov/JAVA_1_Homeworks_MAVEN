package Lesson6.HOMEWORK;

public class Animal {

    protected int runDistance;
    protected double jumpHeight;
    protected int swimDistance;
    protected double value;

    public void getRunDistance(Animal animal, double value) {
        runDistance -= value;
        if (runDistance <= 0) {
            System.out.println(animal.getClass().getSimpleName() + " добежал. " +
                    animal.getClass().getSimpleName() + " больше бежать не может");
        }
    }

    public void getJumpHeight(Animal animal, double value) {
        jumpHeight -= value;
        if (jumpHeight <= 0) {
            System.out.println(animal.getClass().getSimpleName() + " допрыгал. " +
                    animal.getClass().getSimpleName() + " больше прыгать не может");
        }
    }

    public void getSwimDistance(Animal animal, double value) {

    }

    public double getValue() {
        return 0;
    }

    public int check(int a) {
        if(a <= 0) return 0;
        return a;
    }
}
