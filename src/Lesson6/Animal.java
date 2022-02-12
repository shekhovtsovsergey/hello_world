package Lesson6;

public class Animal {

    public String name;
    public int age;
    public int distance;
    public int count = 0;


    public Animal (String name, int age, int distance) {
        this.name = name;
        this.age = age;
        this.distance= distance;
        count++;

    }


    public void info () {
        System.out.println("Animal " + name +  " Возраст " + age);

    }


    public void run () {
        System.out.println("Animal");

    }

    public void swim () {
        System.out.println("Animal");

    }

    public int getCount()  {
        return count;
    }


}
