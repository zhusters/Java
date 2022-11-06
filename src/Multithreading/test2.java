package Multithreading;

import javax.print.attribute.standard.RequestingUserName;
import java.util.concurrent.ArrayBlockingQueue;

public class test2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> que = new ArrayBlockingQueue<>(5);
//producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    que.put(++i);
                    System.out.println("Prod added el - " + i + " " + que);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //consumer
        new Thread(() -> {
            while (true) {
                try {
                    int j = que.take();
                    System.out.println("cons take el - " + j + " " + que);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();




    }
}
