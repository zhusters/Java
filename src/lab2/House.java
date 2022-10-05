package lab2;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {

        CreateArr();
        ShowArr();
        ShowHowManyRooms();
    }

    private int id;
    private int floor;
    private int room;
    static private House arr[];
    static private int size;
    public int GetId() {

        return id;
    }

    ;
    public int GetRoom() {

        return room;
    }
    ;
    public int GetFloor() {

        return floor;
    }
    ;
    void SetRoom() {
        System.out.println("введите кол ко комнат - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            room = sc.nextInt();
        }
    }
    ;
    void SetFloor() {
        System.out.println("введите этаж - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            floor = sc.nextInt();

        }
    }
    ;

    void SetId() {
        System.out.println("введите id - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            id = sc.nextInt();
        }
    }
    ;
    static void CreateAppartment(House a) {
        a.SetId();
        a.SetRoom();
        a.SetFloor();
    }
    static House[] CreateArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол во квартир - ");
        size = sc.nextInt();
        arr = new House[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new House();
            CreateAppartment(arr[i]);
        }
        return arr;
    }
    ;
    static House ShowHouse(House a) {
        System.out.println("Id - " + a.GetId());
        System.out.println("room - " + a.GetRoom());
        System.out.println("floor - " + a.GetFloor());
        return a;
    }
    static void ShowArr() {
        for (int i = 0; i < arr.length; i++) {
            ShowHouse(arr[i]);
            System.out.println("-------------------------");
        }
    }
    static void ShowHowManyRooms() {
        System.out.println("введите количество комнат для поиска -  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].GetRoom() == a)
                System.out.println(ShowHouse(arr[i]));
        }
    }
    static void ShowHowManyRoomsAndFloor() {
        System.out.println("введите количество комнат для поиска и этаж  в диапозоне от a до б-  ");
        Scanner scone = new Scanner(System.in);
        Scanner sctwo = new Scanner(System.in);
        Scanner scthree = new Scanner(System.in);
        int a = scone.nextInt();
        int b = sctwo.nextInt();
        int c = scthree.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].GetRoom() == a && arr[i].floor>b&&arr[i].floor<c )
                System.out.println(ShowHouse(arr[i]));
        }
    }

}
