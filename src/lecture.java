import java.util.Random;
import java.util.Scanner;

public class lecture {
    public static void changeStr(StringBuffer s) {
        s.append(" Microsystems");
    }
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Sun");
        changeStr(str);
        System.out.println(str);
    }
}