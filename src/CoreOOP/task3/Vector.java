package CoreOOP.task3;

import java.util.Scanner;

public class Vector implements CalmAndFocus{
    private int arr[];
    private int size;


    private int res;

    public void Create(){

    }
    @Override
    public void DoIt() {
        System.out.println("введите размер массива - ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(" введите число "+ i +" массива -");
            Scanner sci = new Scanner(System.in);
            int temp = sci.nextInt();
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            res+=Math.abs(arr[i]);
        }
        res =(int) Math.sqrt(res);
        System.out.println(res);

    }
}
