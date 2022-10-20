package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        System.out.println("enter number - ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int x = r.nextInt(3) -1;

            arr[i] = x;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int neg = 0;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos++;
            else neg++;

        }
        if (neg > pos) System.out.println("negative results is more");
        else System.out.println("positive results is more");


    }
}
