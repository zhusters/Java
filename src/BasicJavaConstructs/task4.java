package BasicJavaConstructs;

import java.util.Scanner;

public class task4 {


    public static void main(String[] args){
        int password = 7777;

        String string_password;
        int from_str_to_int;

        do {
            Scanner user_password = new Scanner(System.in);
            System.out.println("Password: ");
            string_password = user_password.nextLine();
            from_str_to_int = Integer.parseInt(string_password);

        }while(from_str_to_int != password);

        System.out.println("Correct password!");
        //string_password.length() != 4 &&
    }

    }








