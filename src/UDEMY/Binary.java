package UDEMY;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Binary {



    public static void main(String[] args) throws IOException {

        //Запоминаем адрес источника
        File file = new File("/Users/1.txt");
        //Запоминаем адрес назначения
        File file2 = new File("/Users/2.txt");

        //создаем объект FileReader для объекта File
        FileInputStream fileInputStream = new FileInputStream(file);
        //создаем обьект Writer для обьекта File21
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedInputStream reader = new BufferedInputStream(fileInputStream);

        byte[] bytes = new byte[64000];
        while (fileInputStream.read(bytes) != -1) {
            System.out.print(bytes);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        }
    }

}


