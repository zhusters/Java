package BasicJavaConstructs;

import java.util.Random;
import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {


        Random r = new Random();
        int b = r.nextInt(3) - 1;
        int a;

        System.out.println(b);
        do {
            System.out.println("enter random number - ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if (a < b) System.out.println("the number is smaller");

            else if (a>b)System.out.println("the number is greater");


        } while (a != b);


    }

}
