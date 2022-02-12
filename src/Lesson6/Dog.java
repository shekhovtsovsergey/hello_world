package Lesson6;

public class Dog extends Animal {

    private static int count;


    public Dog(String name, int age, int distance) {
        super(name, age, distance);
        count++;
    }

    public void info() {
        System.out.println("Dog " + name + " Возраст " + age);
    }

    public void run(int distance) {
        if (distance < 500) {
            System.out.println("Dog " + name + " Пробежал " + distance);
        } else {
            System.out.println("Dog " + name + " Не может пробежать " + distance);
        }

    }


    public void swim(int distance) {
        if (distance < 10) {
            System.out.println("Dog " + name + " Проплыл " + distance);
        } else {
            System.out.println("Dog " + name + " Не может проплыть " + distance);
        }
    }


    public int getCount()  {
        return count;
    }


}