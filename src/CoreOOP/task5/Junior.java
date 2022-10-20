package CoreOOP.task5;

public class Junior extends Person implements Employee{
    @Override
    public void Say() {
        System.out.println("i do all kind of work" );
    }

    @Override
    public void Work() {
        System.out.println("i work for 12 hour in a day");
    }

    @Override
    public void Salary() {
        System.out.println("he thinks that he has a big salary");
    }
}
