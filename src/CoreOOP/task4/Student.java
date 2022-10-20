package CoreOOP.task4;

public abstract class Student implements PoorMan{


    abstract public void Sleep();
    @Override
    public void Say() {
        System.out.println(":)");
    }

    @Override
    public void Eat() {
    }

    @Override
    public void Ability() {
    }
}
