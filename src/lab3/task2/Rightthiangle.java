package lab3.task2;

public class Rightthiangle implements Geometry{
    private int a;
    private  int b;

    public Rightthiangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public void Area() {
        int res = (a*b)/2;
        System.out.println(res);

    }
}