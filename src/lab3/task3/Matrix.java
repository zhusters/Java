package lab3.task3;

import java.util.Scanner;

public class Matrix implements CalmAndFocus{
    private int arr[][];
    private int size;
    private         int res;


    public void Create(){

    }
    @Override
    public void DoIt() {

        System.out.println("введите размер матрцы - ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println(" введите число для заполнения матрицы по порядку - ");
                Scanner sci = new Scanner(System.in);
                arr[i][j] = sci.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res += Math.abs(arr[i][j]);
            }
        }
        System.out.println(res);
    }
}
