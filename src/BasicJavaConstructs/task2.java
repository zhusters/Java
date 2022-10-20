package BasicJavaConstructs;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class task2 {
    public static void main(String[] args) {
        System.out.println("enter number - ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int length = (int) (Math.log10(n) + 1);
        System.out.println("length - " + length);
        if (length < 4)
            System.out.println("number is not four digit");
        else if (n / 1000 + n % 1000 / 100 == n % 100 / 10 + n % 10) {
            System.out.println("true");
        } else System.out.println("false");

        System.out.println(evennumber());
        System.out.println(isevendouble());
        System.out.println(pifagor());
        System.out.println(isdifferent());
        isfamiliar();
    }

    public static int evennumber() {
        System.out.println("sum of three digit and even");
        System.out.println("enter number i - ");
        System.out.println("enter number j - ");
        System.out.println("enter number k - ");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = i + j + k;
        int check = sum % 2;

        if (check == 0) {
            System.out.println("number is even");
        } else System.out.println("number is not even");
        return 0;
    }


    public static int isevendouble() {

        System.out.println("is even double enter number - ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0 && n > 9)
            System.out.println("the number is even2");
        else System.out.println("the number isnt even");


        return 0;

    }


    public static int pifagor() {
        System.out.println("num of pifagor");
        System.out.println("enter number a - ");
        System.out.println("enter number b - ");
        System.out.println("enter number c - ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (sqrt(a) == sqrt(b) + sqrt(c) && sqrt(b) == sqrt(a) + sqrt(c) && sqrt(c) == sqrt(a) + sqrt(b))
            System.out.println("this is true");
        else System.out.println("this is false");

        return 0;

    }


    public static int isdifferent() {
        System.out.println("is different");
        System.out.println("enter number a - ");
        System.out.println("enter number b - ");
        System.out.println("enter number c - ");
        System.out.println("enter number n - ");


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        int d;
        a = n % 10;
        b = (n % 100) / 10;
        c = (n % 1000) / 100;
        d = n / 1000;

        if ((a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d))
            System.out.println("Числа различны!");
        else
            System.out.println("Есть одинаковые цифры!");
        return 0;


    }
    public static void isfamiliar() {

        int number;
        Scanner user_number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = user_number.nextInt();

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = number % 10;
            number = number / 10;
        }

        if (arr[0] == arr[3] && arr[1] == arr[2]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//        return 0;
    }

}

