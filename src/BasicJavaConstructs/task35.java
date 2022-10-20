package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task35 {
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

                arr[i][j] = r.nextInt(5) -3;

                System.out.print(arr[i][j] + " ");


            }

            System.out.println();

        }


        int sum = 0;
        int max = 0;
        int count = 0;
        for (int j = 0; j < n; j++) {
            sum = 0;
            for (int i = 0; i < m; i++) {
                sum += arr[i][j];


                if (arr[i][j] > sum) {
                    System.out.println("special el - " + arr[i][j]);
                }

            }


            System.out.println();
            System.out.println("column number -  " + j + ":" + sum);

        }
//        int j=0;
//        while (arr.length-1 !=0){
//            for (int i = 0; i < n; i++) {
//
//
//                if (arr[i][j] > sum) count++;
//                j++;
//
//            }
//
//        }


//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < m; j++) {
//
//                if (arr[i][0] > sum) count++;
//
//            }
//
//        }


    }


}
