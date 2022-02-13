package Lesson7;

public class Plate {

    private int food;


    public Plate (int food) {
        this.food=food;
    }


    public void info () {
        System.out.println(" Еды " + food);
    }


    public void decrease (int n){
            food = food - n;
    }


    //Вспомогательный метод определяющий хватит ли еды коту
    public boolean check (int n) {
        if ((food - n)>=0) {
            return true;
        } else {
            return false;
        }
    }


    //6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void add (int n){
        food = food + n;
        System.out.println("В миску добавили жратвы " + n);
    }


}
