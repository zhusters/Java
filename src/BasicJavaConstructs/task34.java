package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task34 {
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

int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i<j){

                    sum+=arr[i][j];

                }
            }
        }

        System.out.println();
        System.out.println("sum - "+sum);
    }
}
