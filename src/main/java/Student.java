// Java program to demonstrate working of Comparator 
// interface 
import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student. 
class Student
{
    int studentnumber;
    String name, address;

    // Constructor 
    public Student(int studentnumber, String name, String address) {
        this.studentnumber = studentnumber;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main() 
    public String toString() {
        return this.studentnumber + " " + this.name + " " + this.address;
    }
}

class Sortbystudentnumber implements Comparator<Student> {
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) {
        return a.studentnumber - b.studentnumber;
    }
}

class Sortbyname implements Comparator<Student> {
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

// Driver class 
class Main {
    public static void main (String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(100, "Ben", "london"));
        ar.add(new Student(105, "Bart", "nyc"));
        ar.add(new Student(110, "Lisa", "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbystudentnumber());

        System.out.println("\nSorted by studentnumber");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
} 
