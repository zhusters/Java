package lab2;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Equation one = new Equation(10,5,3);

        one.Root(one);

        one.Extremum(one);

        one.IncreaseDecrease(one);


    }
    private int a;
    private int b;
    private int c;

    public Equation() {


    }

    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA() {
        System.out.println("введите a - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        this.a = a;
    }

    public void setB() {

        System.out.println("введите b - ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        this.b = b;
    }

    public void setC() {

        System.out.println("введите c - ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double Root(Equation argv) {
        double d = Math.pow(2, b) - 4 * a * c;//диcкримнт...
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Первый корень уравнения - " + x1 + ", второй корень уравнения - " + x2);

            if (x1 > x2) {
                return x1;
            } else {
                return x2;
            }
        }
        else {
            if (d == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Корень уравнения - " + x);
                return x;
            } else {
                System.out.println("Корни отсутствуют");
                return 0;
            }
        }
    }
    public double Extremum(Equation argv){

        if (a > 0) {
            double minx = -b / (2 * a);
            double miny = a * Math.pow(minx,2) + b * minx + c;
            System.out.println("Координаты минимума уравнения - " +"minx - "+ minx + "miny - "+miny );
            return minx;
        }
        else {
            if (a < 0) {
                double maxx = -b / (2 * a);
                double maxy = a * Math.pow(maxx,2) + b * maxx + c;
                System.out.println("Координаты максимума уравнения - " +"maxx -  "+ maxx + "," + maxy );
                return maxx;
            }
            else {
                System.out.println("У уравнения нет экстремумов");
                return 0;
            }
        }
    }
    public void IncreaseDecrease(Equation argv) {
        if (a > 0) {
            System.out.println("Промежуток убывания - " + argv.Extremum(argv) + " промежуток возрастания - " + argv.Extremum(argv));
        } else {
            if (a < 0) {
                System.out.println("Промежуток возрастания - " + argv.Extremum(argv) + " промежуток убывания - " + argv.Extremum(argv));
            }
        }
    }
}
