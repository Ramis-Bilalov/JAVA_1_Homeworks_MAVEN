package Lesson7.homework;

public class Cat {
    private String name;
    private int appetite;
    private int inc;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void catsEating(Cat[] array, Plate plate) {
        for (int i = 0; i < array.length; i++) {
            inc++;
            array[i] = new Cat("Кот №" + inc, 20);
            if(array[i].eat(plate))
                plate.info(array[i]);
        }
    }

    public boolean eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            System.out.print(name + " сыт.  ");
            return true;
        } else System.out.println(name +" еды не достаточно!\n");
        return false;
    }
}