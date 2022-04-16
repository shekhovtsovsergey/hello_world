package Java2.Lesson2;

public class Lesson2 {



    //1 Составить вопросы по исключениям и интерфейсам, уделить особенное внимание блоку try-with-resources
    //2 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //3 Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось
    //  (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
    //4 В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
    //5 (не обязательно, на смекалку) Заменить обработчик нажатия кнопок мыши в MainCircles на MouseListener и изменить класс таким образом, чтобы ДОБАВЛЕНИЕ обработчика было описано в одну строку.


    public static void main(String[] args)  {

        String[][] array;
        array = createArr();

        try {
            checkArr(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }



    public static String[][] createArr() {
        String[][] arr = new String[4][4];
        String a = "1";

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = a;
                    System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }



    public static void checkArr(String[][] x) throws MyArraySizeException  {
        int summa = 0;

        if (x.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for(int i = 0; i < x.length; i++) {
        if (x[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" + " строке", i));
            for (int j = 0; j < x[i].length; j++) {

                try {
                        Integer i1 = Integer.valueOf(x[i][j]);
                        summa = Integer.parseInt(summa + x[i][j]);
                }catch (NumberFormatException e) {
                        System.err.println("Неправильный формат в ячейке = " + (i+1) + " " + (j+1));
                    }

            }
        }
        System.out.println(summa);
    }


    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }


    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

}









