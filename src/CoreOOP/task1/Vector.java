package CoreOOP.task1;

import java.util.Scanner;

public class Vector implements Arithmetic {
    private int arr[];
    private int size;

    public void Create(){
        System.out.println("Введите кол во веркторов - ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            Scanner scvec = new Scanner(System.in);
            System.out.println("введите значение вектора - ");
            arr[i] = scvec.nextInt();
        }
    }
    public void Show(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +" ");
        }
    }
    @Override
    public void Addition() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println("сумма всех значений - "+sum);
    }

    @Override
    public void Compare() {
        System.out.println("введите номе первогр вектора для сравнения - ");
        Scanner sca  = new Scanner(System.in);
        int a = sca.nextInt();

        System.out.println("введите номер второго вектора для сравнения - ");
        Scanner scb = new Scanner(System.in);
        int b = scb.nextInt();
            if (arr[a] > arr[b]){
                System.out.println("первый веткор больше");

        }else System.out.println("второй веткор больше");

    }
}
