package BasicJavaConstructs;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {

        String a;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter number -  ");
        if(scn.hasNextInt()){
            a=scn.nextLine();
            int c=0;
            for(int i=0;i<a.length();i++){
                char m=a.charAt(i);//возвращает индекс символа строки
                //c=(a.charAt(i)-48)+c;
                c=Character.getNumericValue(a.charAt(i))+c;//from ascii
            }
            System.out.println("sum - "+c);
        }
        else System.out.println("error");



    }
}
