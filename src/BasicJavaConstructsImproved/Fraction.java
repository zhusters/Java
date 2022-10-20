package BasicJavaConstructsImproved;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Fraction a = new Fraction(10,5);
        Fraction b = new Fraction(5,9);

        a.Subtraction(a,b);
        a.Addition(a,b);
        a.Divide(a,b);
        a.Multiply(a,b);

        CreateArr();
        ShowArr();
        ReplaceEven();
        ShowArr();


    }
    private double znamenatel;
    private double chislitel;

    private double number;

    private static Fraction arr[];
    private static int size;

    public Fraction(){}
    public Fraction(double chislitel,double znamenatel){
        this.chislitel=chislitel;
        this.znamenatel=znamenatel;
    }
    public void setZnamenatel() {
        System.out.println("введите znamenatel - ");
        Scanner sc = new Scanner(System.in);
        this.znamenatel = sc.nextInt();
    }

    public void setChislitel() {
        System.out.println("введите chislitel - ");
        Scanner sc = new Scanner(System.in);
        this.chislitel = sc.nextInt();
    }



    public double getZnamenatel() {
        return znamenatel;
    }

    public double getChislitel() {
        return chislitel;
    }
    public void Addition(Fraction a,Fraction b){
        double bottom = a.znamenatel*b.znamenatel;
        double sum =( a.chislitel*b.znamenatel + b.chislitel*a.znamenatel)/bottom;
        System.out.println("сумма - "+sum);
    }
    public double getNumber() {
        return number = chislitel/znamenatel;
    }

    public void Subtraction(Fraction a,Fraction b){
        double bottom = a.znamenatel*b.znamenatel;
        double sum =( a.chislitel*b.znamenatel - b.chislitel*a.znamenatel)/bottom;
        System.out.println("вычитание  - "+sum);

    }public void Multiply(Fraction a,Fraction b){
        double sum =(a.chislitel* b.chislitel)/(a.znamenatel*b.znamenatel);
        System.out.println("умножение - "+sum);

    }
    public void Divide(Fraction a,Fraction b){
        double sum =(a.znamenatel*b.znamenatel)/(a.chislitel* b.chislitel);
        System.out.println("деление - "+sum);

    }

    public static void CreateFraction(Fraction f){
        f.setChislitel();
        f.setZnamenatel();
    }

   public static void CreateArr(){
        System.out.println("Введите кол во дробей - ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new Fraction[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Fraction();
            CreateFraction(arr[i]);
        }
    }

    public static void ShowFract(Fraction f){
        System.out.println(f.getChislitel());
        System.out.println(f.getZnamenatel());
        System.out.println(f.getNumber());
    }

    public static void ShowArr(){

        for (int i = 0; i < arr.length; i++) {
            ShowFract(arr[i]);
            System.out.println("-----------");
        }
    }
    public static void ReplaceEven() {
        System.out.println("replace even number");
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].number % 2.0 != 0.0) {
                //double temp = arr[i].number;
                arr[i] = arr[i+1];

            }
        }
    }


    
}


