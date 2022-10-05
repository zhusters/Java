package lab1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        System.out.println("enter k : ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int sum = 0;
        int res = 0;
        for (int i = 1; i<5; i++){
            sum += i;

            if (sum %2==0) {
                res += sum;
            }
            System.out.println("sum - "+sum);
            System.out.println("res - "+res);

        }



    }
}
