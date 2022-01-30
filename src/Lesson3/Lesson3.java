package Lesson3;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
    createArrChenge();
    createArrr();
    multiplyByTwo();
    createDiagonal();
    int[] intArray = createArr(3,1);
    maxMin();
    }



    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void createArrChenge () {
        int[] x = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                x[i] = 0;
            }  else {
                x[i] = 1;
            };
            System.out.print(x[i]);
        }
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void createArrr () {
        int[] x = new int[100];
        int y = 1;
        for (int i = 0; i < x.length; i++) {
                x[i] = y;
                y = y+1;
                System.out.print(x[i]);
            };


    }


    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multiplyByTwo () {
        int[] x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 6) {
                x[i] =x[i] * 2;
            };
            System.out.print(x[i]);
        }
    }


    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void createDiagonal () {
        int[][] x = new int[11][11];
        for (int i = 0; i < 11; i++) {

            for (int j = 0; j < 11; j++) {
                //главная диагональ
                if (i == j) {
                    System.out.print("1");
                    x[i][j] = 1;

                //побочная диагональ
                } else if (i+j+1 == x.length) {
                    System.out.print("1");
                    x[i][j] = 1;

                //иначе ноль
                } else {
                    System.out.print("0");
                    x[i][j] = 0;

                }
            }
            System.out.println();
        }
    }



    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] createArr(int len, int initialValue) {
        int size= len;
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
        return arr;
    }




    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void maxMin () {
        int[] x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int min = x [0];
        int max = x [0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            } else if (x[i] > max) {
                max = x[i];
            };
        }
        System.out.print("min = " + min + " max = " + max);
    }





}

