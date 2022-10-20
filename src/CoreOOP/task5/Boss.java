package CoreOOP.task5;

public class Boss extends Person implements Employee{

    @Override
    public void Say() {
        System.out.println("am a Boss");
    }

    @Override
    public void Work() {
        System.out.println("3 hour of work in a day ");
    }

    @Override
    public void Salary() {
        System.out.println("big salary");
    }
}
