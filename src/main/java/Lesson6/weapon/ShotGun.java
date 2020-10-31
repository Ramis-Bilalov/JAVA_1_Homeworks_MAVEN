package Lesson6.weapon;

public class ShotGun extends Weapon {

    public ShotGun() {
        range = 500;
        damage = 500;
    }

    @Override
    public void hitEnemy(Enemy enemy, int range) {
        if(this.range >= range) {
            enemy.takeDamage(this);
        }
    }
}
