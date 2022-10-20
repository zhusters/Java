package Collections.task3;

import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<Smth> arr = new TreeSet<>();
        int x = Help.enterX();
        arr.add(new Smth(x, x));
        arr.add(new Smth(777, x));
        arr.add(new Smth(878, x));
        arr.add(new Smth(-3, x));
        arr.add(new Smth(787, x));
        arr.add(new Smth(-521, x));
        arr.add(new Smth(1, x));
        arr.add(new Smth(-21, x));
        for (Smth arrs :arr) {
            System.out.println(arrs);
        }
    }
}
