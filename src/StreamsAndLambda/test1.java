package StreamsAndLambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sanya");
        list.add("david");
        list.add("max");
        list.add("true");
        List<Integer> res = list.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(res);
        int arr[] = {10, 5, 5, 6, 7, 8, 9, 1};
        arr = Arrays.stream(arr).map(el -> {
            if (el % 2 == 0) {
                el = el / 2;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(arr));

        Arrays.stream(arr).forEach(Student::MyMethod);//or
        //        Arrays.stream(arr).forEach(el->Student.MyMethod(el));



        List<Integer> listone = new ArrayList<>();
        listone.add(1);
        listone.add(8);
        listone.add(887);
       int sum =  listone.stream().reduce(1,(accumulator, el) ->
               accumulator * el);




        Student a = new Student("sanya", 20);
        Student b = new Student("david", 1);
        Student c = new Student("max", 2);
        Student d = new Student("true", 3);
        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students = students.stream().filter(el -> el.getAge() > 5).collect(Collectors.toList());
        System.out.println(students);
    }

}


class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void MyMethod(int a) {
        a += a + 10000;
        System.out.print(a + " ");


    }
}
