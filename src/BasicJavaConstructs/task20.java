package BasicJavaConstructs;

import java.util.Random;

public class task20 {
    public static void main(String[] args) {
//        int q = 0;
//
//        q = (int) (Math.random() * 900 + 1);
//        int length = (int) (Math.log10(q) + 1);
//        System.out.println("length - " + length);
//        String str = Integer.toString(q);
//
//        for(int i=0;i<str.length();i++){
//            for (int j = 0; j < str.length(); j++) {
//                int x = Integer.parseInt (str.trim());
//                if (x[i] > x[j])
//
//                    System.out.println("");
//
//            }
        Random rand = new Random();
        int a = rand.nextInt(899) + 100;
        int first = a / 100;
        int secondBegin = a / 10;
        int second = secondBegin % 10;
        int third = a % 10;
        if (first > second && first > third) {
            System.out.println (first);
        } else if (second > first && second > third) {
            System.out.println (second);
        } else {
            System.out.println (third);
        }
        System.out.println (a);


        }
    }

