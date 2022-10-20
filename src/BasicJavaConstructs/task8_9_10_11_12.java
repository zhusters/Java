package BasicJavaConstructs;

public class task8_9_10_11_12 {
    public static void main(String[] args) {

        System.out.println("task - 8");
        for (int i = 1000; i < 10000; i += 2)

            System.out.print(i + " ");

        System.out.println();


        System.out.println("task - 9");
        int n = 0;
        for (int i = 0; i < 54; i ++) {
            n += 2;
            System.out.println(n + " ");
        }
        System.out.println();

        System.out.println("task - 10");

        for (int i = 100; i >- 1; i -=5) {
            System.out.println(i+" ");
        }


        System.out.println("task - 11");
        for (int a=2; a<=10000; a=2*a-1){

            System.out.print(a+" ");

        }

        System.out.println();



        System.out.println("task - 12");

        for (int a =-166; a<100; a=a*2+200 )
        {
            if(a>-100&&(a<-9||a>9)){
                System.out.print(a+" ");}
        }

    }
}
