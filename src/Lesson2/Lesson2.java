package Lesson2;

import java.sql.Date;
import java.util.Arrays;

public class Lesson2 {


    // main
    public static void main(String[] args) {
        System.out.println(betweenCheck(10, 5)); //1
        printNum(5); //2
        System.out.println(returnNum(-1)); //3
        printTextCycle("Привет", 5); //4
        System.out.println(checkYear(2024)); //5

    }


    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean betweenCheck(int a, int b) {

        if ((a + b) >= 10 & (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }


    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void printNum(int a) {
        if (a < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }


    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean returnNum(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }


    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printTextCycle(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }


    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,  при этом каждый 400-й – високосный кроме каждого 100-го,
    public static boolean checkYear(int a) {
        if (a%4==0 && a%100 !=0 || a%400==0) {
            return true;
        } else {
            return false;
        }
    }


}