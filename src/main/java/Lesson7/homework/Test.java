package Lesson7.homework;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", 20);
        Plate plate = new Plate(50);
        Cat[] array = new Cat[3];
        cat.catsEating(array, plate);
        plate.setFood(200);
        cat.catsEating(array, plate);


    }
}