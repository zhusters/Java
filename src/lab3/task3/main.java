package lab3.task3;

import lab3.task2.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("введите кол во обьектов - ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        CalmAndFocus arr[] = new CalmAndFocus[size];
        for (int i = 0; i < arr.length; i++) {
            while (i < size) {
                System.out.println("main menu:\n1.Complex\n2.Vector\n3.Matrix\n4.exit\ninput number - ");
                Scanner scv = new Scanner(System.in);
                int vibor = scv.nextInt();

                switch (vibor) {

                    case 1:
                        arr[i] = new Complex(10, 5);
                        arr[i].DoIt();
                        i++;
                        break;
                    case 2:
                        arr[i] = new Vector();
                        arr[i].DoIt();
                        i++;
                        break;
                    case 3:
                        arr[i] = new Matrix();
                        arr[i].DoIt();
                        i++;
                        break;
                    case 4:
                        System.out.println("exit");
                        System.exit(1);
                }
            }
        }
    }
    }

