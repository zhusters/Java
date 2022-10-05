package lab1;

import java.util.Scanner;

public class task14 {

    public static void main(String[] args) {



//???????????????????????????????????????????????????????????????????????????????????????????????

        Scanner sc = new Scanner(System.in);

        System.out.println("task - 14");

        int n = 0, k = 0, q = 0;

        do {

            System.out.println("enter number - ");

            while (!sc.hasNextInt()) {

                System.out.println("enter number one more time - ");

                sc.next();

            }

            n = sc.nextInt();

            if (n > 1) {

                for (int i = 2; i < n; i++) {

                    if (n % i == 0) {

                        System.out.print("the number is simple, its factors ");

                        break;

                    } else k++;

                }

                for (int i = 2; i <= (double) Math.sqrt(n); i++) {

                    for (int j = 2; j <= n; j++) {

                        if (n % i == 0) {

                            if (i % j == 0)
                                q++;

                        }

                    }

                    if (q == 1) System.out.print(i + " ");

                    q = 0;

                }

            }

            if (k == n - 2) System.out.println("number is simple");

            System.out.println();

        }

        while (n < 2);


    }






}
