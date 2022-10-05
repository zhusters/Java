package lab1;

import java.util.Random;
import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {

        System.out.println("enter arr size - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("enter arr two size - ");
        Scanner sctwo = new Scanner(System.in);
        int ntwo = sctwo.nextInt();

        int arr[] = new int[n];
        int arrtwo[] = new int[ntwo];

        int arrthree[];
        int maxarr = 0;
        int minarr = 0;


        if (n > ntwo) {

            arrthree = new int[ntwo];
            maxarr = n;
            minarr = ntwo;
        } else {
            arrthree = new int[n];
            maxarr = ntwo;
            minarr = n;

        }

        for (int i = 0; i < n; i++) {
            int x = 1+ (int) (Math.random() * 10);

            arr[i] = x;

        }
        for (int i = 0; i < ntwo; i++) {
            int x = 1+(int) (Math.random() * 10);

            arrtwo[i] = x;

        }


        for (int i = 0; i < minarr; i++) {

            arrthree[i] = arr[i]/arrtwo[i];

            if (arr[i] % arrtwo[i]==0){
                arrthree[i] = 777;
            }

        }
        System.out.print("arr one - ");

        for (int i = 0; i < minarr; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.print("arr two - ");

        for (int i = 0; i < minarr; i++) {
            System.out.print(arrtwo[i]+" ");

        }
        System.out.println();
        System.out.print("arr three - ");

        for (int i = 0; i < minarr; i++) {
            System.out.print(arrthree[i]+" ");

        }


    }
}
