package lab3.task1;

import lab3.task1.Matrix;
import lab3.task1.Stroka;
import lab3.task1.Vector;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        Stroka s = new Stroka();
        Vector v = new Vector();





        while (true) {
            System.out.println("main menu:\n1.Matrix\n2.String\n3.Vector\n4.Exit\ninput number - ");
            int vibormain;
            Scanner scmain = new Scanner(System.in);
            vibormain = scmain.nextInt();


            switch (vibormain) {

                case 1:

                while (true) {
                    int viborone;
                    Scanner scone = new Scanner(System.in);
                    System.out.println("main menu:\n1.create\n2.showArr\n3.show cell\n4.divide\n5.create several matrix\n6.addition\n7.Compare\n10.exit\ninput number - ");
                    viborone = scone.nextInt();

                    switch (viborone) {
                        case 1:
                            m.Create();
                            break;
                        case 2:
                            m.ShowArr();
                            break;
                        case 3:
                            m.ShowCell();
                            break;
                        case 4:
                            m.Divide();
                            break;
                        case 5:
                            m.CreateSeveralArr(m);
                            break;
                        case 6:
                            m.Addition();
                            break;
                        case 7:
                            m.Compare();
                            break;

//                case 4: edit();
//                    break;
//                case 5: task();
//                    break;
                        case 10:
                            System.out.println("exit");
                            System.exit(1);


                    }
                }//matrix




               case 2:

                   while (true) {
                       int vibortwo;
                       Scanner sctwo = new Scanner(System.in);
                       System.out.println("main menu:\n1.create line\n2.show line\n3.addition\n4.compare\n5.show index\n6.exit\ninput number - ");

                       vibortwo = sctwo.nextInt();

                       switch (vibortwo) {
                           case 1:
                               s.CreateLine();
                               break;
                           case 2:
                               s.ShowLine();
                               break;
                           case 3:
                               s.Addition();
                               break;
                           case 4:
                               s.Compare();
                               break;
                           case 5:
                               s.ShowIndex();
                               break;


                           case 6:
                               System.out.println("exit");
                               System.exit(1);
                       }
                   }//stroka

                   case 3:
                       while (true) {
                           int viborthree;
                           Scanner scthree = new Scanner(System.in);
                           System.out.println("main menu:\n1.create\n2.show\n3.addition\n4.compare\n5.exit\ninput number - ");

                           viborthree = scthree.nextInt();

                           switch (viborthree) {
                               case 1:
                                   v.Create();
                                   break;
                               case 2:
                                   v.Show();
                                   break;
                               case 3:
                                   v.Addition();
                                   break;
                               case 4:
                                   v.Compare();
                                   break;
                               case 5:
                                   System.out.println("exit");
                                   System.exit(1);
                           }}//vector


            }//main



        }


    }

}
