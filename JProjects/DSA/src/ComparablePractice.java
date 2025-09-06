import java.util.*;

public class ComparablePractice {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "John"));
        list.add(new Student(2, "Alice"));
        list.add(new Student(1, "Bob"));

        Collections.sort(list); // uses compareTo
        Collections.sort(list, new NameComparator()); // uses compare method of NameComparator
        System.out.println(list);
    }
}

 class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int compareTo(Student s){
        return this.roll - s.roll;
    }

    public String toString(){
        return this.roll + " " + this.name;
    }

}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
