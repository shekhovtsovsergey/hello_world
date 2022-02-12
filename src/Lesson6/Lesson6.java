package Lesson6;

import java.util.Arrays;

public class Lesson6 {


    public static void main(String[] args) {

        Animal animal = new Animal("Животное", 10, 150);
        Cat cat = new Cat ("Васька", 20, 250);
        Cat cat2 = new Cat ("Сноу", 20, 250);
        Dog dog = new Dog ("Рэкс", 30, 300);
        Dog dog2 = new Dog ("Бобик", 30, 300);
        Dog dog3 = new Dog ("Бим", 30, 300);


        animal.info();
        cat.info();
        dog.info();

        cat.run(100);
        dog.run(100);
        cat.swim(100);
        dog.swim(100);

        System.out.println("Животных " + animal.getCount());
        System.out.println("Котов " + cat.getCount());
        System.out.println("Собак " + dog.getCount());


    }



}
