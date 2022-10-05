package lab3.task9;

import java.util.Scanner;

public class FeminуCar extends Car implements Auto {
    private boolean go;

    @Override
    public void Drive() {
        go = true;
    }

    @Override
    public void Brake() {
        go = false;
    }

    @Override
    public void setColor(String color) {
        System.out.println("введите цвет");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        super.setColor(str);
    }
}
