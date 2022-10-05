package lab1;

import java.util.Random;
import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {

        int n = 0;
        int count = 0;
        do {
            System.out.print("enter arr size - ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            int arr[] = new int[n];
            Random r = new Random();


            System.out.print("arr one - ");
            for (int i = 0; i < n; i++) {

                int x = r.nextInt(n);
                arr[i] = x;
                System.out.print(arr[i] + " ");

                if (arr[i] % 2 == 0){
                    count++;}

            }
            int arrtwo[] = new int[n];
            System.out.println();
            System.out.print("arr two - ");

            for (int i = 0; i < n; i++) {

                if (arr[i] % 2 == 0) {
                    arrtwo[i] = arr[i];
                    System.out.print(arrtwo[i] + " ");
                }
            }


        } while (n < 3);
    }
}
