package Collections.task3;
public class Smth implements Comparable<Smth> {
    public int number;
    public int x;
    public Smth(int number, int x) {
        this.number = number;
        this.x = x;
    }
    @Override
    public String toString() {
        return "Smth{" +
                "number=" + number +
                ", x=" + x +
                '}';
    }
    @Override
    public int compareTo(Smth a) {
        if (a.x > number) {
            return -1;
        } else if (a.x < number) {
            return 1;
        } else {
            return 0;
        }
    }
}