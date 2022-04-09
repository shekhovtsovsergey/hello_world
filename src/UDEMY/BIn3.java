package UDEMY;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BIn3 {

    public static void main(String[] args) throws IOException {

        String src = "/Users/shehovtsovsu/1.txt";
        String dest = "/Users/shehovtsovsu/2.txt";

        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(dest)) {

            byte[] buffer = new byte[65536]; // 64Kb

            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        }

    }
}