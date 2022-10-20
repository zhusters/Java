package BasicJavaConstructsImproved;

import java.util.Scanner;

public class Patient {
    public static void main(String[] args) {

        CreateArr();
        ShowArr();
        ShowDiagnose();
        ShowNumberCard();

    }
    private int id;
    private String name;
    private String diagnose;
    static int size;
    static Patient arr[];
    public int GetId() {
        return id;
    }

    ;
    public String GetName() {
        return name;
    }
    ;
    public String GetDiagnose() {
        return diagnose;
    }
    ;
    void SetId() {
        System.out.println("введите значение id - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            id = sc.nextInt();
        }
    }
    ;
    void SetName() {
        System.out.println("введите значение name - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            name = sc.nextLine();
        }
    }

    ;
    void SetDiagnose() {
        System.out.println("введите название diagnose - ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            diagnose = sc.nextLine();
        }
    }

    ;
    static void CreatePatient(Patient p) {
        p.SetId();
        p.SetName();
        p.SetDiagnose();
    }
    static void ShowPatient(Patient p) {
        System.out.println("id - " + p.GetId());
        System.out.println("name - " + p.GetName());
        System.out.println("diagnose - " + p.GetDiagnose());
    }
    ;
    static void ShowDiagnose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужный диагноз - ");
        String a = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (a.equalsIgnoreCase(arr[i].diagnose)) {
                System.out.println(arr[i].GetName());
            }
        }
    }
    ;
    static void ShowNumberCard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужный диапазон для поиска по карте (от 1 до 5 введите 1, 5) - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].id >= a && arr[i].id <= b) {
                System.out.println(arr[i].GetName());
                System.out.println(arr[i].GetId());
                System.out.println(arr[i].GetDiagnose());
            }
        }
    }
    ;
    static Patient[] CreateArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол во пациентов - ");
        size = sc.nextInt();
        arr = new Patient[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Patient();
            CreatePatient(arr[i]);
        }
        return arr;
    }
    ;
    static void ShowArr() {
        for (int i = 0; i < arr.length; i++) {
            ShowPatient(arr[i]);
            System.out.println("-------------------------");

        }
    }
}
