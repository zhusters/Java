package lab2;

import java.util.Scanner;

public class Abiturient {
    public static void main(String[] args) {
        CreateArr();
        ShowScoreWithBadRes();
        ShowAverageScore();
        ShowHighestAverageScore();
    }
    private int id;
    private String name;
     private int arrscore[];
   static private int sizescore;
    static int size;
    static Abiturient arr[];
    public int GetId() {
        return id;
    }
    ;

    public String GetName() {
        return name;
    }
    ;
    void SetId() {
        System.out.println("введите значение id - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            id = sc.nextInt();
        }
    }
    ;
    void SetName() {
        System.out.println("введите значение name - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            name = sc.nextLine();
        }
    }
    ;
    void SetScore() {
        System.out.println("введите кол во оценок - ");
        Scanner sc = new Scanner(System.in);
        sizescore = sc.nextInt();
        arrscore = new int[sizescore];
        for (int i = 0; i < sizescore; i++) {
            System.out.println("введите оценку - ");
            Scanner scgrade = new Scanner(System.in);
            int a = scgrade.nextInt();
            arrscore[i] = a;
        }
    }
    ;
    static void CreateAbiturient(Abiturient a) {
        a.SetId();
        a.SetName();
        a.SetScore();
    }
    static void ShowAbiturient(Abiturient a) {
        System.out.println("id - " + a.GetId());
        System.out.println("name - " + a.GetName());
      //  System.out.println("score - " + a.GetScore());
    }    ;
   static  void ShowScoreWithBadRes() {
        System.out.println("студенты с неуд. оценками - ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].arrscore[i] < 4) {
                ShowAbiturient(arr[i]);
            }
        }
    }    ;
    static void ShowAverageScore() {
        System.out.println("введите балл для поиска студентов выше этого балла - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].arrscore[i] > a )
                ShowAbiturient(arr[i]);
        }
    }
    ;
    static void ShowHighestAverageScore() {
        int sum = 0;
        int count = 0;
        int res = 0;
        System.out.println("сумма оценок всех студентов - ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sizescore; j++) {
                sum +=arr[i].arrscore[j];
                count++;
            }
            res = sum/count;
            ShowAbiturient(arr[i]);
            System.out.println("average is - "+ res );
            if (res < 2){
                System.out.println("у студента нет полупроходного балла ");
            }
            else System.out.println("у студента есть полупроходной балл ");
            sum = 0;
        }
    }
    ;
    static Abiturient[] CreateArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол во абитуриентов - ");
        size = sc.nextInt();
        arr = new Abiturient[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Abiturient();
            CreateAbiturient(arr[i]);
        }
        return arr;
    }
    ;
    static void ShowArr() {
        for (int i = 0; i < arr.length; i++) {
            ShowAbiturient(arr[i]);
            System.out.println("-------------------------");
        }
    }
}