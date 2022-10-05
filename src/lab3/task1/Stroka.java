package lab3.task1;

import lab3.task1.Arithmetic;

import java.util.Scanner;

public class Stroka implements Arithmetic {
    private char arr[];

    public char[] getArr() {
        return arr;
    }

    public void setArr(char[] arr) {
        this.arr = arr;
    }

    public void CreateLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку - ");
        String str = sc.nextLine();
        arr = str.toCharArray();

    }

    public void ShowLine() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public void ShowIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку - ");
        String str = sc.nextLine();
        arr = str.toCharArray();

        System.out.println(" введите номер нужного символа - ");
        Scanner scone = new Scanner(System.in);
        int a = scone.nextInt();
        char result2 = str.charAt(a);
        System.out.println(result2);
    }


    @Override
    public void Addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку - ");
        String str = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" " + str);
    }

    @Override
    public void Compare() {
        Scanner scone = new Scanner(System.in);
        System.out.println("введите строку - ");
        String strone = scone.nextLine();
        char arrone[] = strone.toCharArray();

        Scanner sctwo = new Scanner(System.in);
        System.out.println("введите строку - ");
        String strtwo = sctwo.nextLine();
        char arrtwo[] = strtwo.toCharArray();

        if (arrone.length > arrone.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arrone[i] + " ");
            }
            System.out.println("длинее второго слова ");
        } else {
            for (int i = 0; i < arrtwo.length; i++) {
                System.out.print(arrtwo[i] + " ");
            }
            System.out.println("длинее первого слова ");
        }



    }
}
