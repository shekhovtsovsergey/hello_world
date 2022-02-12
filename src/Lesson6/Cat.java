package Lesson6;

public class Cat extends Animal {

    private static int count;


    public Cat (String name, int age, int distance) {
       super(name, age, distance);
        count++;

    }

    public void info () {
        System.out.println("Cat " + name +  " Возраст " + age);

    }


    public void run (int distance) {
        if (distance < 200) {
            System.out.println("Cat " + name + " Пробежал " + distance);
        } else {
            System.out.println("Cat " + name + " Не может пробежать " + distance);
        }


    }

    public void swim (int distance) {
        System.out.println("Cat " + name +  " Не умеет плавать ");

    }

    public int getCount()  {
        return count;
    }


}
