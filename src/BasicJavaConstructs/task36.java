package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task36 {
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


        int max = 0;
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (max < arr[i][j]) {

                    max = arr[i][j];
                    maxi = i;
                    maxj = j;

                }

            }

        }


        int temp = 0;
        int replace = 0;
        System.out.println("enter a number of columns that need to be replaced - ");
        Scanner scanner = new Scanner(System.in);
        replace = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            temp = arr[maxi][i];
            arr[maxi][i] = arr[replace - 1][i];
            arr[replace - 1][i] = temp;

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
