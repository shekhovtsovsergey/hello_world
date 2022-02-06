package Lesson5;

public class Lesson5 {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванова", "Аналитик", "123@gb.ru", "98795654", 100, 30);
        Employee employee2 = new Employee("Петрова", "Секретарь", "123@gb.ru", "98795654", 100, 35);
        Employee employee3 = new Employee("Сидорова", "Продуктовнер", "123@gb.ru", "98795654", 100, 40);
        Employee employee4 = new Employee("Соколова", "Тестировщик", "123@gb.ru", "98795654", 100, 45);
        Employee employee5 = new Employee("Орлова", "Директор", "123@gb.ru", "98795654", 100, 50);

        Employee[] pers = {employee1, employee2, employee3, employee4, employee5 };


        for (int i = 0; i < pers.length; i++) {
            if (pers[i].age >= 40) {
                pers[i].info();
            }
        }
    }
}
