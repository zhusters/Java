package lab3.task2;

public class Trapizza implements Geometry{
    private int a;
    private int b;
    private int h;

    public Trapizza(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    @Override
    public void Area() {
        int res = (a*b)*h/2;
        System.out.println(res);

    }
}
