package lab3.task3;

public class Complex implements CalmAndFocus{
    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int a;
    private int b;

   private int res =0;

    @Override
    public void DoIt() {
        int res = Math.abs((a+b)*-1*(a+b)*-1);
        System.out.println(res);
    }
}
