package cn.itcast.day11.demo06;

public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        giveMeAPet(new Dog());

    }

    public static void giveMeAPet(Animal animal) {
        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
    }

}
