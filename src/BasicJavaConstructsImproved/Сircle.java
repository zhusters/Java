package BasicJavaConstructsImproved;

public class Сircle {
    public static void main(String[] args) {
        Сircle a = new Сircle();
        a.ChangeABR(10,5,5);
        a.CountL(a);
        a.CountS(a);

    }
    private int radius;
    private int a;
    private int b;

    public void SetRadius(int radius) {
        this.radius = radius;
    }
    public void SetA(int a) {
        this.a = a;
    }
    public void SetB(int b) {
        this.b = b;
    }
    public int GetRadius() {
        return radius;
    }
    public int GetA() {
        return a;
    }
    public int GetB() {
        return b;
    }
    public Сircle(){
    }
    public Сircle(int radius){
this.radius = radius;
    }
    public Сircle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Сircle(int radius,int a, int b){
        this.radius =radius;
        this.a = a;
        this.b = b;
    }

    public void ShowСircle(Сircle c){
        System.out.println(c.GetRadius());
        System.out.println( c.GetA());
        System.out.println( c.GetB());
    }

    public void ChangeABR(int r, int a, int b){
        SetRadius(r);
        SetA(a);
        SetB(b);
    }
    public void CountS(Сircle c){
    int s;
    s = 2*3 *c.radius;
        System.out.println("s - "+s);

    }
    public void CountL(Сircle c){
        int l;
        l = 3 *c.radius*c.radius;
        System.out.println("l - "+l);

    }

}

