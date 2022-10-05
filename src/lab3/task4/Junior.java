package lab3.task4;

public class Junior extends Student implements PoorMan {
    @Override
    public void Sleep() {
        System.out.println("сон для слабаков");
    }

    @Override
    public void Say() {
        super.Say();
    }

    @Override
    public void Eat() {
        System.out.println("питаюсь энергией солнца");
    }

    @Override
    public void Ability() {
        System.out.println("заходит Фарнегейт в бар а там сто Фаренгейтов");
    }
}
