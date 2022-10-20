package BasicJavaConstructs;

import java.util.Scanner;

public class task3 {

public static void main(String[] args){
    System.out.println(task());

}



public static int task(){

    System.out.println("enter numbers : ");

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();


   if (a<b){
    a = (a+b)/2;
   }
    if (b>a){
        b= (a*b)/2;
   }







    System.out.println("b = " + b);
    System.out.println("a = " + a);


    return 0;



}

}
