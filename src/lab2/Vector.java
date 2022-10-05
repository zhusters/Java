package lab2;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Vector a = new Vector(59);
        Vector b = new Vector(14);
        a.Skalar(a,b);
        a.CosAlpha(a,b);
        a.Decrement(a);
        a.Inkrement(a);
        a.Addition(a,b);
        a.Multiply(a,b);
        System.out.println("cosalpha - "+a.CosAlpha(a, b));
    }
    private static Vector arr[];
    private int number;
    private static int size;
    public Vector (){}
    public Vector (int number){
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public static void setArr() {
        System.out.println("Введите кол во веркторов - ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new Vector [size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Vector();
            Scanner scvec = new Scanner(System.in);
            System.out.println("введите значение вектора - ");
            arr[i].number = scvec.nextInt();
        }
    }
    public static void  ShowVector(Vector a){
        System.out.println(  a.getNumber());
    }
    public static void ShowArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].number);
            System.out.println("--------------");
        }
    }
    public static void Addition(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i].number;
        }
        System.out.println("сумма всех значений - "+sum);
    }
    public void Addition(Vector a,Vector b) {
        int sum = 0;
        sum= a.number+b.number;
        System.out.println("сумма элементa a и элемента b - " +sum);
    }
    public static void Subtract(Vector a,Vector b){
        int sum = 0;
        sum= a.number-b.number;
        System.out.println("разница элемента a и элемента b - "+sum);
    }
    public void Multiply(Vector a,Vector b){
        int sum = 0;
        sum= a.number*b.number;
        System.out.println("произведение элемента a и элемента b - "+sum);
    }
    public void Inkrement(Vector a){
        System.out.println("inkrement - "+ a.number++);
    }
    public void Decrement(Vector a){
        System.out.println("dekrement - "+ a.number--);
    }
public int CosAlpha(Vector a, Vector b){
        int sum = (a.number*b.number)/Math.abs(a.number)*Math.abs(b.number);
    return (a.number*b.number)/Math.abs(a.number)*Math.abs(b.number);
}
public void Skalar(Vector a, Vector b){
        int sum = a.number*b.number*CosAlpha(a,b);
    System.out.println("skalar - "+sum);
}
    }