package BasicJavaConstructs;

public class task15 {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        System.out.print(a+" "+b +" ");
        for(int i = 0; i<9; i++){
            a+=b;
            b+=a;

            System.out.print(" "+a+" "+b);
        }

    }
}
