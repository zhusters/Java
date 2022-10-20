package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//        int q = 0;
//
//        int n = 0;
//
//        q = (int) (Math.random() * 9 + 1);
//
//
//        do {
//
//            System.out.println("guess the number");
//
//            while (!sc.hasNextInt()) {
//
//                System.out.println("the number isnt right");
//
//                sc.next();
//
//            }
//
//            n = sc.nextInt();
//
//            if (n > q)
//                System.out.println("the number is smaller");
//
//            if (n < q)
//                System.out.println("the number is greater");
//
//        } while (n != q);
//
//        System.out.println("success:" + n);
///////////////////////////////////////////////////////////////////////////////


        Random rand = new Random();
        int n = rand.nextInt();

        System.out.println(n);

        System.out.println("enter the number :");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        do {
            System.out.println("guess the number - ");

            while (!scanner.hasNextInt()) {
                System.out.println("the number isnt right");
                scanner.nextInt();



            }

            a = scanner.nextInt();

            if (a < n) System.out.println("num is smaller");
            if (a > n) System.out.println("num is greater");


        } while (a != n);
        System.out.println("success");

        //}
//        if (a == n)
//            System.out.println("succes");
//        else if (a<n)
//            System.out.println("your number is lower");
//        else if (a>n)
//            System.out.println("your number is higher");


    }
}
