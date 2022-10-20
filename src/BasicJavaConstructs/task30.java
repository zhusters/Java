package BasicJavaConstructs;

import java.util.Random;

public class task30 {
    public static void main(String[] args) {




        Random r = new Random();
        System.out.println("Задание 30");
        int arr[] = new int[12];
        int n = 6, m = 6, l, i = 0;
        do {
            l = r.nextInt(20) - 10;
            if (l > 0 && l < 11 && n>0) {
                arr[i] = l;
                i++;
                n--;//count
            }

            if (l < 0 && l > -11 && m>0) {
                arr[i] = l;
                i++;
                m--;//count
            }

        } while (m > 0 || n > 0);
        for (i=0; i<12; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();









//
//        System.out.print("enter arr size - ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int x = 0;
//        int pos = 0;
//        int neg = 0;
//        int arr[] = new int[n];
//        Random r = new Random();
//        for (int i = 0; i < n; i++) {
//
//
//            if (arr[i] < 0)
//                neg++;
//            else if (arr[i] > 0)
//                pos++;
//
//            if (pos > neg) {
//                x = -r.nextInt(20) - 10;
//                arr[i] = x;
//
//
//            } else if (neg>pos){
//                x = +r.nextInt(20) - 10;
//                arr[i] = x;
//            }
//
//
//            System.out.print(arr[i] + " ");
//
//        }
//        int count = 0;
//        int counttwo = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > 0)
//                count++;
//            else counttwo++;
//        }
//        System.out.println("pos - " + count);
//        System.out.println("neg - " + counttwo);


    }
}
