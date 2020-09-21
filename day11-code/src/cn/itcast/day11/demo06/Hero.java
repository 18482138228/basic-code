package cn.itcast.day11.demo06;

public class Hero {
    private String name;//名字
    private int age;//年龄
    private Weapon weapon;//武器

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attck() {
        System.out.println("年龄为" + this.age + "的" + this.name + "用" + weapon.getCode() + "攻击敌方");
    }
}
