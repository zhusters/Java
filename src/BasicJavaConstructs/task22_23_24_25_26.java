package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task22_23_24_25_26 {
    public static void main(String[] args) {


        int arr [] = new int[8];
        for (int i = 0; i < 8; i++) {
            int q = (int) ( Math.random() * 10 );

            arr[i] = q;

            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if ( i%2==0 ){
                arr[i] = 0;
            }



        }
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("task23");

        int arrtwo []= new int[8];
        for (int i = 0; i < 8; i++) {
            int q = (int) ( Math.random() * 10 );

            arrtwo[i] = q;


        }

        int average = 0;
        int averagetwo = 0;

        for (int i = 0; i < 8; i++) {
            average += arr[i];
            averagetwo += arrtwo[i];


        }
        average = average/8;
        averagetwo = averagetwo/8;
        System.out.println("average - "+average);

        System.out.println("average two - "+averagetwo);


        System.out.println();
        System.out.println("task 24");


        System.out.println("enter arr size - ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arrthree [] = new int[n];


        for (int i = 0; i < n; i++) {
            int q = (int) ( Math.random() * 90 );
            arrthree[i] = q;

        }
        int k = 0, m = 0;
        for (int i = 1; i < 4; i++) {

            if (k < arrthree[i]) m++;

            k = arrthree[i];

        }

        if (m == 3) System.out.println("true");

        else System.out.println("false");


        System.out.println();
        System.out.println("task 25");



        int arrfour [] = new int[22];

        arrfour[0] = 1;

        arrfour[1] = 1;

        for (int i = 2; i < 20; i++) {

            arrfour[i] = arrfour[i - 1] + arrfour[i - 2];

        }

        for (int i = 0; i < 20; i++) {

            System.out.print(arrfour[i] + " ");

        }

        System.out.println();


        System.out.println();
        System.out.println("task 26");


        System.out.println("enter arr size - ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int arrfive [] = new int[q];
        Random r = new Random();

        for (int i = 0; i < q; i++) {
            arrfive[i]  = r.nextInt(30) - 15;

        }

       int max = 0;
        int ind = 0;
        for (int i = 0; i < q; i++) {
            if (arrfive[i] > max)
                max = arrfive[i];
            ind = i;
        }
        for (int i = 0; i < q; i++) {
            System.out.print(arrfive[i]+" ");
        }

        System.out.println("max - "+max);
        System.out.println("index - "+ind);



    }
}
