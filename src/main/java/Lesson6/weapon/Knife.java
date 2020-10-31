package Lesson6.weapon;

public class Knife extends Weapon {

    public Knife() {
        range = 10;
        damage = 100;
    }

    @Override
    public void hitEnemy(Enemy enemy, int range) {
        if(this.range >= range) {
            enemy.takeDamage(this);
        }
    }
}
