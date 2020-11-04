package Lesson7.homework;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food = food + this.food;
        System.out.println("Добавили " + this.food + " еды\n");
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void info(Cat cat) {
        System.out.println("В тарелке: " + food);
    }
}