package Collections.task6;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, Student> mapone = new HashMap<>();



        Student a = new Student("sanya", 1);
        Student b = new Student("david", 2);
        Student c = new Student("lera", 1);
        Student d = new Student("ivan", 4);

        Student dd = new Student("ivan", 4);


        //score, student
        mapone.put(4,a);
        mapone.put(2,b);
        mapone.put(3,c);

        mapone.put(5,d);
        mapone.put(5,dd);

        boolean res = mapone.containsKey(d);
        System.out.println(res);
        System.out.println(d.equals(dd));
        System.out.println(d.hashCode());
        System.out.println(dd.hashCode());



    }
}


class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}

