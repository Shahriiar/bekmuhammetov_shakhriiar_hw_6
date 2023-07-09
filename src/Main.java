
public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setDamage(50);
    boss.setHealth(700);
    Weapon weapon = new Weapon();
    boss.setWeapon(WeaponType.PM2038);
    weapon.setWeaponName("Pistol");
    System.out.println("Boss health : " + boss.getHealth() + "\nBoss damage : "
        + boss.getDamage() + "\nBoss weapon : " + boss.getWeapon() + "\nBoss weapon name : " + weapon.getWeaponName());
    }
}
