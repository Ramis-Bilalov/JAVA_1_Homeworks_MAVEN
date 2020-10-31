package Lesson6.weapon;

public abstract class Weapon {

    protected int damage;
    protected int range;

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public abstract void hitEnemy(Enemy enemy, int range);
}
