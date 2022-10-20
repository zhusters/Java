package CoreOOP.task2;

public class Circle implements Geometry{
    private int r;

    public Circle(int r) {
        this.r = r;
    }


    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public void Area() {
        int res = (int)Math.PI*r*r;
        System.out.println(res);

    }
}
