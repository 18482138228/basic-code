package cn.itcast.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(19);
        hero.setName("武器大师");
        Weapon weapon = new Weapon("多兰之盾");
        hero.setWeapon(weapon);

        hero.attck();
    }
}
