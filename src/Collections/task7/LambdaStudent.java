package Collections.task7;

import java.util.ArrayList;

public class LambdaStudent {
    public static void main(String[] args) {
        LambdaStudent st1 = new LambdaStudent(20,"sanya");
        LambdaStudent st2 = new LambdaStudent(22,"eva");
        LambdaStudent st3 = new LambdaStudent(23,"ava");
        LambdaStudent st4 = new LambdaStudent(24,"max");


        ArrayList<LambdaStudent> ArrList = new ArrayList<>();
        ArrList.add(st1);
        ArrList.add(st2);
        ArrList.add(st3);
        ArrList.add(st4);


        InfoStudents info = new InfoStudents();
        Check lambda = (LambdaStudent s)-> {return s.age>19;};
        info.TestStudents(ArrList,lambda);


    }
    private int age;
    private String name;

    public LambdaStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "LambdaStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

interface Check{
    boolean check(LambdaStudent st);
}

class InfoStudents{
    void TestStudents  (ArrayList <LambdaStudent> student, Check ch){
        for (LambdaStudent s:student) {
            if (ch.check(s)){
                System.out.println(s);
            }
        }
    }
}


