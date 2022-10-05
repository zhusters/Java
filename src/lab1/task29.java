package lab1;

import java.util.Random;
import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {


        int n = 0;
        int count = 0;
        int sum = 0;
        int sumtwo = 0;
        do {
            System.out.print("enter arr size - ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            int midlle = n / 2;

            int arr[] = new int[n];
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int x = r.nextInt(11) - 5;

                arr[i] = x;
                System.out.print(arr[i] + " ");
            }


            for (int i = 0; i < midlle; i++) {
                sum += Math.abs(arr[i]);
            }
            for (int i = midlle; i <n ; i++) {
                sumtwo +=Math.abs(arr[i]);
            }
            System.out.println();
            System.out.println("sum left - "+sum);
            System.out.println("sum right - "+sumtwo);
            if (sum>sumtwo) System.out.println("left is greater that right");
            else System.out.println("right is greater than left");

        } while (n % 2 != 0);

    }
}
