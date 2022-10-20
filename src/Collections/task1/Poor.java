package Collections.task1;

import java.util.*;


public class Poor implements Comparable<Poor> {
    public static void main(String[] args) {
        LinkedList<Poor> PoorListOne = new LinkedList<Poor>();
        LinkedList<Poor> PoorListTwo = new LinkedList<Poor>();
        Poor st1 = new Poor("sanya", 1);
        Poor st2 = new Poor("sanya", 2);
        Poor st3 = new Poor("sanya", 3);
        Poor st7 = new Poor("david", 1);
        Poor st4 = new Poor("david", 1);
        Poor st5 = new Poor("david", 5);
        Poor st6 = new Poor("david", 6);
        PoorListOne.add(st1);
        PoorListOne.add(st2);
        PoorListOne.add(st3);
        PoorListOne.add(st7);
        PoorListTwo.add(st4);
        PoorListTwo.add(st5);
        PoorListTwo.add(st6);
        System.out.println("poorone - " + PoorListOne);
        System.out.println();
        System.out.println("poortwo - " + PoorListTwo);
        System.out.println();
        Collections.sort(PoorListOne);
        System.out.println("poorlistonesort - " + PoorListOne);
        System.out.println("Sorted List");
        for (Poor s : PoorListOne) {
            System.out.println(s.course + " " + s.name);
        }
        System.out.println();
        System.out.print("of index - ");
        printPoor(PoorListOne, 1);
        System.out.println();
        System.out.println();
        union(PoorListOne, PoorListTwo);
        System.out.println("union - " + PoorListOne);
        System.out.println();
        intersect(PoorListOne, PoorListTwo);
        System.out.println("intersect - " + PoorListOne);
        System.out.println(PoorListOne.toString());
    }

    @Override
    public int compareTo(Poor o) {
        if (course > o.course) {
            return 1;
        } else if (course == o.course) {
            return 0;
        } else {
            return -1;
        }
    }

    private String name;
    private int course;

    public Poor() {
    }

    public Poor(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Poor{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poor poor = (Poor) o;
        return course == poor.course && Objects.equals(name, poor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public static void printPoor(LinkedList<Poor> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).course == course) {
                System.out.print(students.get(i).toString());
            }
        }
    }

    public static void union(LinkedList<Poor> PoorListOne, LinkedList<Poor> PoorListTwo) {
        try {
            PoorListOne.addAll(PoorListTwo);
        } catch (Exception e) {
            System.out.println("smth wrong");
        }
    }

    public static void intersect(LinkedList<Poor> PoorListOne, LinkedList<Poor> PoorListTwo) {
        try { PoorListOne.retainAll(PoorListTwo);}
        catch (Exception e) {
            System.out.println("smth wrong");
        }
    }
}



