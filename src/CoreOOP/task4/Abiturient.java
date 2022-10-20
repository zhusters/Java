package CoreOOP.task4;

public class Abiturient extends Student implements PoorMan {

    @Override
    public void Sleep() {
        System.out.println("сплю 7 часов");
    }

    @Override
    public void Say() {
        super.Say();
    }

    @Override
    public void Eat() {
        System.out.println("ест дома");
    }

    @Override
    public void Ability() {
        System.out.println("найти аудиторию с первого раза");
    }
}
