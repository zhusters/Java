package lab1;

public class task18 {
    public static void main(String[] args) {
        int k = 0, m = 0, kol = 0;

        for (int n = 1; n < 100000; n++) {

            int l = n;

            for (int i = 1; i < 6; i++) {

                k = n % 10;
                m = n % 100;
                l = l / 10;
                if (k == 4 || m == 13) kol++;
                // how it works
//                public static void main(String[] args) {
//                    int m = 10000019%100;
//                    int n = 10000019%10;
//                    System.out.println("m"+m);
//                    System.out.println("n"+n);
//
//                }


            }
        }
        System.out.println(kol);
    }
}