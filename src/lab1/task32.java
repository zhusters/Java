package lab1;

import java.util.Random;
import java.util.Scanner;

public class task32 {
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

// сортировака по строкам т.е элемент 1 строки = макс последней = мин
//        int max = arr[0][0], temp = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][0] > arr[j][0]) {
//
//                    temp = arr[i][0];
//                    arr[i][0] = arr[j][0];
//                    arr[j][0] = temp;
//
//
//
//                }
//
//
//            }
//        }
//        ;


        // сортировка строк по условию
int temptwo  =0;
        for (int k = 0; k < n*m; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m-1; j++) {
                    if (arr[i][j] < arr[i][j+1]){

                         temptwo = arr[i][j];
                         arr[i][j] = arr[i][j+ 1];
                         arr[i][j+1] = temptwo;



                    }

                }
            }
        }

        System.out.println("sort");

        for (
                int i = 0;
                i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }


}
