package Lesson6.weapon;

public class Test {
    public static void main(String[] args) {
        Enemy volanDeMort = new Enemy("Volan De Mort", 1000);
        Knife knife = new Knife();
        ShotGun shotgun = new ShotGun();
        volanDeMort.takeDamage(knife);
        volanDeMort.takeDamage(shotgun);
        knife.hitEnemy(volanDeMort, 50);
        knife.hitEnemy(volanDeMort, 50);
        knife.hitEnemy(volanDeMort, 5);
        knife.hitEnemy(volanDeMort, 5);
        shotgun.hitEnemy(volanDeMort, 400);


    }
}
