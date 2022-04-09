package UDEMY;

import java.io.*;

public class UDEMY {

    public static void main(String[] args) throws IOException {

            //Запоминаем адрес источника
            File file = new File("/Users/shehovtsovsu/1.txt");
            //Запоминаем адрес назначения
            File file2 = new File("/Users/shehovtsovsu/2.txt");


            //создаем объект FileReader для объекта File
            FileReader fileReader = new FileReader(file);
            //создаем обьект Writer для обьекта File21
            Writer writer = new FileWriter(file2);


            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fileReader);


            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                writer.write(line + "\n");
                writer.flush();
                line = reader.readLine();
            }

    }


}

