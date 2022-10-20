package CoreOOP.task5;

public class main {
    public static void main(String[] args) {
        Boss a = new Boss();
        a.setAge(1);
        System.out.println(a.getAge());
        System.out.println("Boss");
        a.Say();
        a.Salary();
        a.Work();
        Junior b = new Junior();
        b.setAge(1);
        System.out.println(b.getAge());
        System.out.println("Junior");
        b.Say();
        b.Salary();
        b.Work();

    }
}
