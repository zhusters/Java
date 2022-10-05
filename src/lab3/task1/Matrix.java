package lab3.task1;

import java.util.Random;
import java.util.Scanner;

public class Matrix implements Arithmetic {
    private Matrix arrofmatrix[];
    private int arr[][];
    private int size;
    private int sizeofmatrix;

    public Matrix[] getArrofmatrix() {
        return arrofmatrix;
    }

    public int[][] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }

    public int getSizeofmatrix() {
        return sizeofmatrix;
    }

    public void setArrofmatrix(Matrix[] arrofmatrix) {
        this.arrofmatrix = arrofmatrix;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSizeofmatrix(int sizeofmatrix) {
        this.sizeofmatrix = sizeofmatrix;
    }

    public Matrix Create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы - ");
        size = sc.nextInt();
        arr = new int[size][size];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
        return null;
    }

    public void CreateSeveralArr(Matrix arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол во матриц - ");
        sizeofmatrix = sc.nextInt();
        arrofmatrix = new Matrix[sizeofmatrix];
        for (int i = 0; i < arrofmatrix.length; i++) {
            arrofmatrix[i] = new Matrix();
            arrofmatrix[i] = arg.Create();
            arg.ShowArr();
        }


    }


    public Matrix ShowArr() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return null;
    }


    public void ShowCell() {
        Scanner scone = new Scanner(System.in);
        Scanner sctwo = new Scanner(System.in);

        System.out.println("Введите индекс элемента i - ");
        while (!scone.hasNextInt()) {
            scone.next();
        }
        int i = scone.nextInt();

        System.out.println("Введите индекс элемента j - ");
        while (!sctwo.hasNextInt()) {
            sctwo.next();
        }
        int j = sctwo.nextInt();

        System.out.println("элемент - " + arr[i][j]);


    }

    public void Divide() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = arr[i][j] / 2;
            }
        }
    }

    @Override
    public void Addition() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum - "+sum);
    }

    @Override
    public void Compare() {

        System.out.println("введите номер строки для сравнения - ");
        Scanner scone = new Scanner(System.in);
        while (!scone.hasNextInt()) {
            scone.next();
        }
        int a = scone.nextInt();


        System.out.println("введите номер элемента строки - " + a +" для сравнения - ");
        Scanner sctwo = new Scanner(System.in);
        while (!sctwo.hasNextInt()) {
            sctwo.next();
        }
        int b = sctwo.nextInt();



        System.out.println("введите второй номер строки для сравнения - ");
        Scanner scthree = new Scanner(System.in);
        while (!scthree.hasNextInt()) {
            scthree.next();
        }
        int c = scthree.nextInt();



        System.out.println("введите номер элемента строки - " + c+ " для сравнения - ");
        Scanner scfour = new Scanner(System.in);
        while (!scfour.hasNextInt()) {
            scfour.next();
        }
        int d = scfour.nextInt();



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[a][b] > arr[c][d]){
                    System.out.println(arr[a][b]+" is greater than " +arr[c][d]);
                }
                else System.out.println(arr[c][d]+" is greater than "+arr[a][b]);
            }
        }

    }
}
