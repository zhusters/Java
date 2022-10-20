package CoreOOP.task4;

public class main {

    public static void main(String[] args) {
        System.out.println("Абитуриент");
        Abiturient a = new Abiturient();
        a.Say();
        a.Eat();
        a.Ability();
        System.out.println("Бывалый");
        Junior b = new Junior();
        b.Say();
        b.Eat();
        b.Ability();
    }
}
