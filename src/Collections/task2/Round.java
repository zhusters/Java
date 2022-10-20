package Collections.task2;

import java.util.LinkedList;
import java.util.Scanner;
public class Round {
    public static void main(String[] args) {
        LinkedList<Round> Numbers = new LinkedList<Round>();
        create(Numbers);
        System.out.println(Numbers.toString());
        deleteEven(Numbers);
        System.out.println(Numbers.toString());
    }
    private int number;
  public static int count = 0;
    public int getNumber() {
        return number;
    }
    public static void create(LinkedList<Round> Numbers) {
        System.out.println("введите кол во цифр - ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("введите значение обьекта - ");
            Scanner sctemp = new Scanner(System.in);
            int temp = sctemp.nextInt();
            Round obj = new Round(temp);
            Numbers.add(obj);
            count++;
        }
    }
    public static void deleteEven(LinkedList<Round> Numbers) {
        for (int i = 0; i < Numbers.size(); i++) {
            if (i%2== 0) {
                Numbers.remove(i);
            }
        }
    }
    @Override
    public String toString() {
        return "Round{" +
                "number=" + number +
                '}';
    }
    public Round(int number) {
        this.number = number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
