package Lesson7;

public class HomeCat {

    public String name;
    public int appetite;
    public boolean well = false;


    public HomeCat(String name, int appetite) {
        this.name=name;
        this.appetite = appetite;
        this.well = well;
    }


    public void info () {
        System.out.println(" Cat = " + name +  "    Апетит = " + appetite + "    Нажрался = " + well);
    }



    public void eat (Plate plate) {
        if (plate.check(appetite) ) {
            plate.decrease(appetite);
            well = true;
        } else {
            well = false;
        }
    }




}
