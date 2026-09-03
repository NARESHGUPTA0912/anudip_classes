package collectionframework;

import java.util.Arrays;

public class Student implements Comparable<Integer> {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Integer marks) {
        return Integer.compare(this.marks, marks);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Marks: " + this.marks;
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(67, "Prince"), new Student(34, "Naresh"), new Student(49, "Aisha"), new Student(87, "Priya")};
    
        System.out.println(Arrays.toString(students));
    }
}







// public class StudentDriver {
    
// }
