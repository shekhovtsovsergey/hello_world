package Java2.Leeson5;


import static Java2.Leeson5.Lesson5.arr;

public class MyThread extends Thread {


        private float [] x;


        MyThread(float [] x) {
            this.x = arr;
        }


        @Override
        public void run() {
            for(int i = 0; i < x.length; i++) {
                x[i] = (float)(x[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }


    }
