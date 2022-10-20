package Collections.task5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Struct a = new Struct();
        a.add(0);
        int i = 0;
        while (i < a.getCount()) {
            System.out.println("main menu:\n1.add\n2.remove\n3.find\n4.show\n5.Exit\ninput number - ");
            Scanner scv = new Scanner(System.in);
            int vibor = scv.nextInt();
            switch (vibor) {
                case 1:
                    a.add();
                    i++;
                    break;
                case 2:
                    a.remove();
                    i--;
                    break;
                case 3:
                    a.find();

                    break;
                case 4:
                    a.show();

                    break;
                case 5:
                    System.out.println("exit");
                    System.exit(1);
            }
        }
    }
}

