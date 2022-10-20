package BasicJavaConstructs;

import java.util.Scanner;

public class    task13 {
    public static void main(String[] argv){


        Scanner sc = new Scanner(System.in);
        System.out.println("task - 13");

        int n = 0;

        do {

            System.out.println("enter number - ");

            while (!sc.hasNextInt()) {

                System.out.println("the number isnt right ");

                sc.next();

            }

            n = sc.nextInt();

            if (n > 0) {

                System.out.println("factors of  " + n + ": ");

                for (int i = 1; i < 10000; i++) {

                    if (n % i == 0) System.out.print(i + " ");

                }

            }

        } while (n < 1);
    }
}

