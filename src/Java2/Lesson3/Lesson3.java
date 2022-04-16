package Java2.Lesson3;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lesson3 {

    public static void main(String[] args) {

        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
        List<String> list = Arrays.asList("Катя", "Наташа", "Даша", "Катя", "Лена","Настя", "Настя", "Таня", "Света", "Диана","Лиза", "Маша", "Соня", "Оля", "Вика");
        Map<String, Long> uniq = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        uniq.forEach((k, v) -> System.out.println(k + ": " + v));



        //2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        //В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
        //Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        //за использование в качестве ключа для Map не фамилии человека будет снижена оценка
            PhoneList phoneList = new PhoneList();
            phoneList.add("Света", "111111111");
            phoneList.add("Маша", "2222222222");
            phoneList.add("Оля", "3333333333");
            phoneList.add("Настя", "44444444444");
            phoneList.add("Настя", "555555555");
            phoneList.add("Кошка", "666666666666");
            phoneList.add("Наташа", "777777777777");
            phoneList.add("Лиза", "88888888888888");
            System.out.println("Света" + phoneList.get("Света"));
            System.out.println("Настя" + phoneList.get("Настя"));
            System.out.println("Оля" + phoneList.get("Оля"));
            System.out.println("Наташа" + phoneList.get("Наташа"));
    }


    //Телефонная книга
    public static class PhoneList {
        private static Map<String, List<String>> PhoneListGeneral = new HashMap<>(); //создаем мапу с колонкой текст и колонкой лист
        private static List<String> secval; //вторая колонка лист из номеров телефонов

        //Метод добавления
        public static void add(String name, String number) {
            if (PhoneListGeneral.containsKey(name)) {
                secval = PhoneListGeneral.get(name);
                secval.add(number);
                PhoneListGeneral.put(name, secval);
            } else {
                secval = new ArrayList<>();
                secval.add(number);
                PhoneListGeneral.put(name, secval);
            }
        }


        //Метод поиска
        public static List<String> get(String name) {
            return PhoneListGeneral.get(name);
        }

    }



}

