package Lesson6.HOMEWORK;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.getRunDistance(dog, 400);
        dog.getJumpHeight(dog, 1);
        dog.getSwimDistance(dog, 5);
        dog.getSwimDistance(dog, 10);
        System.out.println(dog);

        cat.getRunDistance(cat, 100);
        cat.getJumpHeight(cat, 1);
        cat.getSwimDistance(cat, 1);
        System.out.println(cat);
    }
}
