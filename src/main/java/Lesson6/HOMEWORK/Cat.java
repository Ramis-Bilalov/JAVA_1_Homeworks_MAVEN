package Lesson6.HOMEWORK;

public class Cat extends Animal {

    public Cat() {
        runDistance = (int) (Math.random() * (300 - 100) + 100);
        jumpHeight = (int) (Math.random() * (3 - 1) + 1);
        swimDistance = 0;
    }


    @Override
    public void getRunDistance(Animal animal, double value) {
        runDistance -= value;
        if (runDistance <= 0) {
            System.out.println(animal.getClass().getSimpleName() + " добежал. " +
                    animal.getClass().getSimpleName() + " больше бежать не может");
        }
    }

    @Override
    public void getJumpHeight(Animal animal, double value) {
        jumpHeight -= value;
        if (jumpHeight <= 0) {
            System.out.println(animal.getClass().getSimpleName() + " допрыгал. " +
                    animal.getClass().getSimpleName() + " больше прыгать не может");
        }
    }

    @Override
    public void getSwimDistance(Animal animal, double value) {
        swimDistance -= value;
        if (swimDistance <= 0) {
            System.out.println(animal.getClass().getSimpleName() + " не умеет плавать!");
        }
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n\tCat" +
                "\n\tБежать дальше? еще " + check(runDistance) + " метров" +
                "\n\tПрыгать дальше? еще " + check((int)jumpHeight) + " метров" +
                "\n\tПлыть дальше? еще " + check(swimDistance) + " метров\n";
    }
    public int check(int a) {
        if(a <= 0) return 0;
        return a;
    }
}
