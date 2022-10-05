package lab2;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        CreateArr();
        ShowArr();
        CheckElementFromArr();
        //CheckEachOther();
        Merge();
        Difference();


        Stuff a = new Stuff();
        a.AddToStuff();
        a.ShowArrStuff();




    }

    private int element;
    private static Array arr[][];
    private static int mn;
    private static int elofarr;


    public Array() {
    }


    public Array(int element) {
        this.element = element;
    }


    public int getElement() {
        return element;
    }

    public void setElement() {
        System.out.println("введите елемент множества - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        element = a;
    }

    public void setElement(Array a, Array b) {
        element = a.element + b.element;
    }

    public void setElementDifference(Array a, Array b) {
        element = a.element - b.element;
    }

    public static void CreateElement(Array element) {
        element.setElement();
    }

    public static void CreateArr() {
        int temp = 1;
        System.out.println("Введите кол во множеств - ");
        Scanner sc = new Scanner(System.in);
        mn = sc.nextInt();
        System.out.println("Введите кол во элементов - ");
        Scanner scel = new Scanner(System.in);
        elofarr = scel.nextInt();
        arr = new Array[mn][elofarr];
        for (int i = 0; i < mn; i++) {
            for (int j = 0; j < elofarr; j++) {
                arr[i][j] = new Array();
                System.out.print(" введите элемент множества - " + temp + " ");
                CreateElement(arr[i][j]);
            }
            temp++;
        }
    }

    public static void ShowElement(Array element) {
        System.out.println("element - " + element.getElement());
    }


    public static void ShowArr() {
        for (int i = 0; i < mn; i++) {
            for (int j = 0; j < elofarr; j++) {
                ShowElement(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void CheckElementFromArr() {
        System.out.println("введите элемент для проверки его в множестве - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 0; j < elofarr; j++) {
            for (int i = 0; i < mn; i++) {
                if (a <= arr[i][j].element && a > 0) {
                    System.out.println("елемент принадлежит множеству - " + i + " елементы множества - " + arr[i][j].element);
                }
            }

        }
    }

//    public static void CheckEachOther() {
//        int indi = 0;
//        int indj = 0;
//        for (int i = 0; i < mn ; i++) {
//            for (int j = 0; j < elofarr-1; j++) {
//                if (arr[i][j].element == arr[i][j+1].element) {
//
//                }
//            }
//        }
//
//
//    }

    private static Array arrres[][];

    public static void Merge() {
        System.out.println("введите номера множеств для слияния - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner scb = new Scanner(System.in);
        int b = sc.nextInt();
        arrres = new Array[mn][elofarr];

        for (int i = 0; i < mn; i++) {
            for (int j = 0; j < elofarr; j++) {
                arrres[i][j] = new Array();
                arrres[i][j].setElement(arr[a][j], arr[b][j]);
            }

        }
        for (int i = 0; i < mn; i++) {
            for (int j = 0; j < elofarr; j++) {
                ShowElement(arrres[i][j]);
            }
            System.out.println();
        }

    }

    public static void Difference() {
        System.out.println("введите номера множеств для вычитания  - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner scb = new Scanner(System.in);
        int b = sc.nextInt();
        arrres = new Array[mn][elofarr];

        for (int i = 0; i < mn; i++) {
            for (int j = 0; j < elofarr; j++) {
                arrres[i][j] = new Array();
                arrres[i][j].setElementDifference(arr[a][j], arr[b][j]);
            }

        }
        for (int i = 0; i < mn; i++) {
            for (int j = 0; j < elofarr; j++) {
                ShowElement(arrres[i][j]);
            }
            System.out.println();
        }

    }

//    public static void AddToStaff() {
//        int temp = 1;
//
//        System.out.println("Введите номер множества для добавления элементов - ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        for (int i = 0; i < mn; i++) {
//            for (int j = 0; j < elofarr; j++) {
//
//            }
//            temp++;
//        }
//
//    }


    public static class Stuff {



        private  Stuff arrstuff[];

        private int element;
        public Stuff(){}

        public void setElement(Array a) {
            this.element = a.element;
        }


        public  int getElementStuff() {
            return element;
        }

        public  void ShowElementStuff(Stuff element) {

            System.out.print("element - " + element.getElementStuff() +" ");

        }

        public  void AddToStuff() {
            System.out.println("Введите номер множества для добавления элементов в массив другого класса- ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            for (int i = 0; i < elofarr; i++) {
                arrstuff = new Stuff[elofarr];
                for (int j = 0; j < elofarr; j++) {
                    arrstuff[j] = new Stuff();
                    arrstuff[j].setElement(arr[a][j]);
                }
            }
        }

        public  void ShowArrStuff() {
            for (int i = 0; i < elofarr; i++) {
                ShowElementStuff(arrstuff[i]);
                //System.out.println(arrstuff[i].element);
            }
        }
    }

}
