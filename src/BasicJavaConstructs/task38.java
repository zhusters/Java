package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task38 {
    public static void main(String[] args) {
        System.out.println("enter cols number - ");
        Scanner scannerone = new Scanner(System.in);
        System.out.println("enter rows number - ");
        Scanner scannertwo = new Scanner(System.in);


        int n = scannerone.nextInt();
        int m = scannertwo.nextInt();


        int arr[][] = new int[n][m];

        Random r = new Random();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                arr[i][j] = r.nextInt(10);

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();

        }


        int sumi = 0;
        int sumj = 0;
        int arrone[] = new int[n];
        int arrtwo[] = new int[m];

        for (int j = 0; j < n; j++) {
            sumi = 0;
            for (int i = 0; i < m; i++) {
                sumi += arr[i][j];

            }
            arrone[j] = sumi;
            System.out.println("rows -  " + j + ":" + sumi);
        }
        System.out.println();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                sumj += arr[j][i];
            }
            arrtwo[j] = sumj;
            System.out.println("cols -  " + j + ":" + sumj);
            sumj = 0;


        }
        System.out.println();



        for (int i = 0; i < n; i++) {
            System.out.println("arr one - " + arrone[i]);

        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("arr two - " + arrtwo[i]);


        }
        System.out.println();
        for (int i = 0; i < 1; i++) {


            if (arrone[i] == arrtwo[i]) System.out.println("arr is magic");
            else System.out.println("arr isnt magic");
        }
        System.out.println();
        System.out.println();
    }
}

