package Java2.Leeson5;

import java.io.IOException;
import java.util.Arrays;

public class Lesson5 extends Thread {

    public static final int size = 10_000_000;
    public static final int h = size / 2;
    public static float[] arr = new float[size];
    public static float[] a1 = new float[h];
    public static float[] a2 = new float[h];


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        calcFirstWay();
        calcSecondWay();
    }



    private static void calcFirstWay (){

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            //System.out.println(arr[i]);
        }

        System.out.println("One Thread: " + (System.currentTimeMillis() - a));

    }




    private static void calcSecondWay () throws InterruptedException {

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);///
        System.arraycopy(arr, h, a2, 0, h);///


        MyThread mt1 = new MyThread(a1);
        MyThread mt2 = new MyThread(a2);
        mt1.start();
        mt2.start();

        try {
            mt1.join();
            mt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(a1, 0, arr, 0, h);///
        System.arraycopy(a2, 0, arr, h, h);///


        System.out.println("Two Threads: " + (System.currentTimeMillis() - a));


    }








}






