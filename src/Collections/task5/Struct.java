package Collections.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Struct {
    List<Integer> list = new ArrayList<>();
    private int count;
    public int getCount() {
        return count;
    }
    public void add() {
        try {
            System.out.println("введите число для добавления - ");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            list.add(temp);
            count++;
        } catch (Exception e) {
            System.out.println(" ООООООООПАЧКИ  ");
        }
    }
    public void add(int temp) {

        list.add(temp);
        count++;

    }
    public void remove() {
        try {
            System.out.println("введите число для удаления - ");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            list.remove(temp);
            count--;
        } catch (Exception e) {
            System.out.println(" ООООООООПАЧКИ  ");
        }
    }
    public void show() {
        System.out.println(list);
    }
    public void find() {
        try {
            System.out.println("введите число для поиска ближайшего к нему -  ");
            Scanner sc = new Scanner(System.in);
            double temp = sc.nextInt();
            Iterator iterator = list.iterator();
            int min = (int) iterator.next();
            try {
                while (iterator.hasNext()) {
                    int elem = (int) iterator.next();
                    if (Math.abs(elem - temp) < Math.abs(min - temp)) {
                        min = elem;
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("ООООООООПАЧКИ АРИФМЕТИЧЕСКАЯ ОШИБОЧКА");
            }
            System.out.println(min);
        } catch (Exception e) {
            System.out.println(" ООООООООПАЧКИ  ");
        }
    }
    @Override
    public String toString() {
        return "Struct{" +
                "list=" + list +
                '}';
    }
}

