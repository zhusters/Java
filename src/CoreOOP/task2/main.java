package CoreOOP.task2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("введите кол во обьектов - ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Geometry arr[] = new Geometry[size];
        for (int i = 0; i < arr.length; i++) {
            while (i < size) {
                System.out.println("main menu:\n1.Circle\n2.Rectangle\n3.Righttriangle\n4.Trapizza\n5.Exit\ninput number - ");
                Scanner scv = new Scanner(System.in);
                int vibor = scv.nextInt();

                switch (vibor) {

                    case 1:
                        arr[i] = new Circle(5);
                        arr[i].Area();
                        i++;
                        break;
                    case 2:
                        arr[i] = new Rectangle(4, 6);
                        arr[i].Area();
                        i++;
                        break;
                    case 3:
                        arr[i] = new Rightthiangle(8, 10);
                        arr[i].Area();
                        i++;
                        break;
                    case 4:
                        arr[i] = new Trapizza(3, 6, 2);
                        arr[i].Area();
                        i++;
                        break;
                    case 5:
                        System.out.println("exit");
                        System.exit(1);
                }
            }
        }
    }
}




