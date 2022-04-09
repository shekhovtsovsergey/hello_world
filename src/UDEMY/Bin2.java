package UDEMY;

import java.io.*;

public class Bin2 {

    public static void main(String[] args) throws IOException {

        //Запоминаем адрес источника
        File file = new File("/Users/shehovtsovsu/1.txt");
        //Запоминаем адрес назначения
        File file2 = new File("/Users/shehovtsovsu/2.txt");

        //Чем читать
        FileReader fileReader = new FileReader(file);
        //Чем писать
        Writer writer = new FileWriter(file2);

        //создаем BufferedReader с существующего FileReader для чтения // то что прочитали запомнить в буффере
        BufferedReader reader = new BufferedReader(fileReader,64000);

        // создаем в памяти буфер для чтения 1 байт символов за раз // положили в массив
        char[] buffer = new char[1];

        //номер элемента в массиве
        int chars = reader.read(buffer);

        // до тех пор пока есть символы в файле, читаем данные выводим в консоль и записываем в файл
        while (chars != -1) {
            System.out.print(String.valueOf(buffer, 0,chars));
            writer.write(String.valueOf(buffer, 0,chars));
            writer.flush();
            chars = reader.read(buffer);
        }
    }

}
