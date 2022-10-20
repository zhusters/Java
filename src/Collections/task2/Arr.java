package Collections.task2;

import java.util.Collections;
import java.util.LinkedList;
public class Arr implements Comparable<Arr> {
    public static void main(String[] args) {
        LinkedList<Arr> Numbers = new LinkedList<Arr>();
        Arr n1 = new Arr(1);
        Arr n2 = new Arr(-5);
        Arr n3 = new Arr(-3);
        Arr n4 = new Arr(2);
        Arr n5 = new Arr(87);
        Arr n6 = new Arr(-777);
        Numbers.add(n1);
        Numbers.add(n2);
        Numbers.add(n3);
        Numbers.add(n4);
        Numbers.add(n5);
        Numbers.add(n6);
        System.out.println(Numbers.toString());
        Collections.sort(Numbers);
        System.out.println(Numbers.toString());
    }
    public int getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "Arr{" +
                "number=" + number +
                '}';
    }
    private int number;
    public Arr(int number) {
        this.number = number;
    }
    @Override
    public int compareTo(Arr o) {
        if (number > o.number) {
            return 1;
        }
        else if (number == o.number) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
