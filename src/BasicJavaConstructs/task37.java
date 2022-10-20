package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;


public class task37 {
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

        int max = arr[0][0];
        int min = arr[0][0];
        int mini = 0;
        int minj = 0;
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (max < arr[i][j]) {

                    max = arr[i][j];
                    maxi = i;
                    maxj = j;

                }

                if (min > arr[i][j]) {
                    min = arr[i][j];
                    mini = i;
                    minj = j;

                }


            }

        }
        System.out.println();
        System.out.println("max - "+max+ "min - "+min);
        System.out.println();
int temp = 0;int temptwo = 0;
        for (int i = 0; i < n; i++) {

            temp = arr[maxi][maxj];
            arr[maxi][maxj] = arr[0][0];
            arr[0][0] = temp;

            temptwo = arr[mini][minj];
            arr[mini][minj] = arr[n-1][m-1];
            arr[n-1][m-1] = temptwo;


        }


        System.out.println("refactor");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
