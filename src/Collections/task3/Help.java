package Collections.task3;
import java.util.Scanner;
public class Help {
    public static int enterX() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        while (!sc.hasNextInt()) {
            System.out.println("Again");
            sc.next();
        }
        number = sc.nextInt();
        return number;
    }
}




