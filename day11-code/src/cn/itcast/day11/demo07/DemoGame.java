package cn.itcast.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        hero.setSkill(new SkillImpl());
        hero.attack();
    }
}
