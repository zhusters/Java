package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task39 {
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
        int indi = 0;
        int indj = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j] || max == arr[i][j]) {

                    max = arr[i][j];
                    indi = i;
                    indj = j;

                }
            }
        }

        System.out.println();
        System.out.println("max - " + max);
        System.out.println();

        System.out.println("enter coor i - ");
        Scanner coorone = new Scanner(System.in);
        int coori = coorone.nextInt() - 1;
        System.out.println("enter coor j - ");
        Scanner coortwo = new Scanner(System.in);
        int coorj = coortwo.nextInt() - 1;


        int temp = arr[coori][coorj];
        arr[coori][coorj] = arr[indi][indj];
        arr[indi][indj] = temp;







        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}




