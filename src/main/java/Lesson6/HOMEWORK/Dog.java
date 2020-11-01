package Lesson6.HOMEWORK;

public class Dog extends Animal {

    public Dog() {
        runDistance = (int) (Math.random() * (600 - 400) + 400);
        jumpHeight = (int) (Math.random() * (2 - 1) + 1);
        swimDistance = (int) (Math.random() * (20 - 5) + 5);
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
    public void getJumpHeight (Animal animal, double value) {
        jumpHeight -= value;
        if (jumpHeight <= 0) {
            System.out.println(animal.getClass().getSimpleName() + " допрыгал. " +
                    animal.getClass().getSimpleName() + " больше прыгать не может");
        }
    }

    @Override
    public void getSwimDistance (Animal animal, double value){
        swimDistance -= value;
        if (swimDistance <= 0) {
            System.out.println(animal.getClass().getSimpleName() + " доплыл. " +
                    animal.getClass().getSimpleName() + " больше плыть не может");
        }
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n\tDog" +
                "\n\tБежать дальше? еще " + check(runDistance) +
                "\n\tПрыгать дальше? еще " + check((int)jumpHeight) +
                "\n\tПлыть дальше? еще " + check(swimDistance) + "\n";
    }

    public int check(int a) {
        if(a <= 0) return 0;
        return a;
    }
}