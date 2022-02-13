package Lesson7;

import Lesson5.Employee;

public class Lesson7 {



    public static void main(String[] args) {


        //1. Расширить задачу про котов и тарелки с едой.
        //2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
        //3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
        //4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
        Plate plate = new Plate(20);
        HomeCat homeCat = new HomeCat("Васька", 10);
        plate.info();
        homeCat.eat(plate);
        plate.info();
        homeCat.info();




        //5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        HomeCat homeCat1 = new HomeCat("Светка", 1);
        HomeCat homeCat2 = new HomeCat("Машка", 2);
        HomeCat homeCat3 = new HomeCat("Наташка", 3);
        HomeCat homeCat4 = new HomeCat("Маринка", 4);
        HomeCat homeCat5 = new HomeCat("Катька", 5);
        HomeCat homeCat6 = new HomeCat("Танька", 6);
        HomeCat homeCat7 = new HomeCat("Ольга",7 );
        HomeCat homeCat8 = new HomeCat("Джульетта", 8);
        HomeCat homeCat9 = new HomeCat("Диана", 9);
        HomeCat homeCat10 = new HomeCat("Карина", 10);

        HomeCat[] cs = { homeCat1,homeCat2,homeCat3,homeCat4,homeCat5,homeCat6,homeCat7,homeCat8,homeCat9,homeCat10 };


        for (int i = 0; i < cs.length; i++) {
            cs[i].eat(plate);
            cs[i].info();
            }



        plate.add(50);
        plate.info();


        }
}
